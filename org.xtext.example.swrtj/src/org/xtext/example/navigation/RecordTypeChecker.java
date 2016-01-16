package org.xtext.example.navigation;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.xtext.example.swrtj.AnonimousRecord;
import org.xtext.example.swrtj.BaseRecord;
import org.xtext.example.swrtj.Field;
import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.NestedRecordExpression;
import org.xtext.example.swrtj.Record;
import org.xtext.example.swrtj.RecordExclude;
import org.xtext.example.swrtj.RecordExpression;
import org.xtext.example.swrtj.RecordName;
import org.xtext.example.swrtj.RecordOperation;
import org.xtext.example.swrtj.RecordRename;
import org.xtext.example.swrtj.SwrtjPackage;
import org.xtext.example.utils.DuplicateChecker;
import org.xtext.example.utils.ErrorMessage;
import org.xtext.example.utils.Lookup;

public class RecordTypeChecker extends Navigator<Collection<ErrorMessage>> {
	private Map<String, FieldName> fields = new HashMap<String, FieldName>();
	private Map<String, FieldName> current;
	
	private Lookup lookup = new Lookup();
	private DuplicateChecker duplicateChecker = new DuplicateChecker();
		
	/**
	 * Navigate on the record and collects the results.
	 * @param record the record to navigate.
	 * @return the target result.
	 */
	public Collection<ErrorMessage> navigate(Record record) {
		if(record == null) return defaultConstructor();
		
		RecordExpression expression = record.getExpression();
		if(expression == null) return defaultConstructor();
		
		return doNavigate(expression);
	}
	
	/**
	 * Navigate on the record and collects the results.
	 * @param record the record to navigate.
	 * @return the target result.
	 */
	public Collection<ErrorMessage> navigate(RecordExpression expression) {
		if(expression == null) return defaultConstructor();
		
		return doNavigate(expression);
	}
	
	/**
	 * Navigate on the record and collects the results.
	 * @param base the base record to navigate.
	 * @return the target result.
	 */
	public Collection<ErrorMessage> navigate(BaseRecord base) {
		if(base == null) return defaultConstructor();
		
		return doSwitch(base);
	}
	
	/**
	 * Starts the navigation.
	 * @param expression the record expression.
	 * @param check checks for duplicate if this parameter is <code>true</false>.
	 * @return the record accessible fields.
	 */
	protected Collection<ErrorMessage> doNavigate(RecordExpression expression, boolean check) {
		Collection<ErrorMessage> errorList = defaultConstructor();
		Collection<BaseRecord> recordList = expression.getRecordList();
		
		for(BaseRecord record : recordList) {
			//current = field contained in record(without considering expressions)
			errorList.addAll(doSwitch(record));
			
			Collection<RecordOperation> operations = record.getOperationList();
			
			for(RecordOperation operation : operations) {
				//Uses current in order to check base record fields and remove or rename fields
				errorList.addAll(doSwitch(operation));
			}
			
			if(!check) return errorList;
			
			Collection<FieldName> detectedField = current.values();
			for(FieldName field : detectedField) {
				String name = field.getName();
				//Same name, same(or different) type = conflict because this is not a request
				if(fields.containsKey(name))
					errorList.add(new ErrorMessage("Field conflict detected '" + name + "': rename or " +
							                       "remove it", record));
				else fields.put(name, field);
			}
		}
		
		return errorList;
	}
	
	/**
	 * Starts the navigation.
	 * @param expression the record expression.
	 * @return the record accessible fields.
	 */
	protected Collection<ErrorMessage> doNavigate(RecordExpression expression) {
		return doNavigate(expression, true);
	}
	
	@Override
	public Collection<ErrorMessage> caseAnonimousRecord(AnonimousRecord record) {
		current = new HashMap<String, FieldName>();
		Collection<Field> fieldList = record.getDeclarationList();
		
		for(Field field : fieldList) {
			if(field != null && field.getFieldRef() != null && field.getFieldRef().getName() != null)
				current.put(field.getFieldRef().getName(), field.getFieldRef());
		}
		
		return duplicateChecker.checkRecordConflicts(record);
	}
	
	@Override
	public Collection<ErrorMessage> caseRecordName(RecordName record) {
		current = lookup.getProvidedFields(record.getRecord());
		
		return defaultConstructor();
	}
	
	@Override
	public Collection<ErrorMessage> caseNestedRecordExpression(NestedRecordExpression record) {	
		RecordExpression expression = record.getExpression();
		Collection<ErrorMessage> errorList = defaultConstructor();
		
		if(expression != null) {
			RecordTypeChecker typeChecker = new RecordTypeChecker();
			errorList = typeChecker.navigate(expression);
			current = lookup.getProvidedFields(record);
		}
		
		current = lookup.getProvidedFields(expression);
		
		return errorList;
	}
	
	@Override
	public Collection<ErrorMessage> caseRecordExclude(RecordExclude operation) {
		Collection<ErrorMessage> errorList = defaultConstructor();
		if(operation.getField() == null) return errorList;
		String name = operation.getField().getName();
		
		if(!current.containsKey(name))
			errorList.add(new ErrorMessage("Cannot exclude field " + name + ": field not exists in this record: it has " +
					                       "been removed in previous exclude or renaming operations", 
					      operation, SwrtjPackage.RECORD_EXCLUDE__FIELD));
		current.remove(name);
		
		return errorList;
	}
	
	@Override
	public Collection<ErrorMessage> caseRecordRename(RecordRename operation) {
		Collection<ErrorMessage> errorList = defaultConstructor();
		String originalName = (operation.getOriginalField() != null ? operation.getOriginalField().getName() : null);
		String newName = (operation.getNewField() != null ? operation.getNewField().getName() : null);
		if(newName == null || originalName == null) return errorList;
		
		if(!current.containsKey(originalName))
			errorList.add(new ErrorMessage("Cannot rename field " + originalName + ": field not exists in this record: it has " +
                                           "been removed in previous exclude or renaming operations", 
                                           operation, SwrtjPackage.RECORD_RENAME__ORIGINAL_FIELD));
		if(current.containsKey(newName))
			errorList.add(new ErrorMessage("Cannot rename field to existing field: " + newName,
                                           operation, SwrtjPackage.RECORD_RENAME__NEW_FIELD));
		
		if(!errorList.isEmpty()) return errorList;
				
		current.remove(operation.getOriginalField().getName());
		current.put(operation.getNewField().getName(), operation.getNewField());
		return errorList;
	}
	
	@Override
	protected Collection<ErrorMessage> defaultConstructor() {
		return new LinkedList<ErrorMessage>();
	}
}