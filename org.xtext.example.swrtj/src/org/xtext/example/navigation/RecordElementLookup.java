package org.xtext.example.navigation;

import java.util.Collection;
import java.util.HashMap;
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

public class RecordElementLookup extends Navigator<Map<String, FieldName>> {
	private Map<String, Map<String, FieldName>> recordLookups = new HashMap<String, Map<String, FieldName>>();
	private Map<String, FieldName> current;
	
	/**
	 * Navigate on the record and collects the results.
	 * @param record the record to navigate.
	 * @return the target result.
	 */
	public Map<String, FieldName> navigate(Record record) {
		if(record == null) return defaultConstructor();
		
		RecordExpression expression = record.getExpression();
		if(expression == null) return defaultConstructor();
		//Inserts an empty mapping name --> field set in order to break further cycles
		recordLookups.put(record.getName(), defaultConstructor());
		
		Map<String, FieldName> result = doNavigate(expression);
		//Inserts the real result
		recordLookups.put(record.getName(), result);
		
		return result;
	}
	
	/**
	 * Navigate on the record and collects the results.
	 * @param record the record to navigate.
	 * @return the target result.
	 */
	public Map<String, FieldName> navigate(RecordExpression expression) {
		if(expression == null) return defaultConstructor();
		
		return doNavigate(expression);
	}
	
	/**
	 * Navigate on the record and collects the results.
	 * @param base the base record to navigate.
	 * @return the target result.
	 */
	public Map<String, FieldName> navigate(BaseRecord base) {
		if(base == null) return defaultConstructor();
		
		return doSwitch(base);
	}
	
	/**
	 * Starts the navigation.
	 * @param expression the record expression.
	 * @return the record accessible fields.
	 */
	protected Map<String, FieldName> doNavigate(RecordExpression expression) {
		Map<String, FieldName> result = defaultConstructor();
		Collection<BaseRecord> recordList = expression.getRecordList();
		
		for(BaseRecord record : recordList) {
			current = lookup(record);
			Collection<RecordOperation> operationList = record.getOperationList();
			
			for(RecordOperation operation : operationList) {
				applyChanges(operation);
			}
			
			result.putAll(current);
		}
		
		return result;
	}
	
	/**
	 * Bind the correct lookup.
	 * @param record the record in wich lookup fields.
	 * @return the record fields.
	 */
	protected Map<String, FieldName> lookup(BaseRecord record) {
		return doSwitch(record);
	}
	
	/**
	 * Apply record operations.
	 * @param operation the current record operations.
	 */
	protected void applyChanges(RecordOperation operation) {
		doSwitch(operation);
	}
	
	@Override
	public Map<String, FieldName> caseAnonimousRecord(AnonimousRecord record) {
		Map<String, FieldName> result = defaultConstructor();
		Collection<Field> fieldList = record.getDeclarationList();
		
		for(Field field : fieldList) {
			if(field != null && field.getFieldRef() != null)
				result.put(field.getFieldRef().getName(), field.getFieldRef());
		}
		
		return result;
	}
	
	@Override
	public Map<String, FieldName> caseRecordName(RecordName record) {
		Map<String, FieldName> result = defaultConstructor();
		String name = record.getRecord().getName();
		
		if(recordLookups.containsKey(name)) {
			dump(result, recordLookups.get(name));
		} else {
			dump(result, navigate(record.getRecord()));
		}
		
		return result;
	}
	
	@Override
	public Map<String, FieldName> caseNestedRecordExpression(NestedRecordExpression record) {
		return (record.getExpression() == null ? defaultConstructor() : doNavigate(record.getExpression()));
	}
	
	@Override
	public Map<String, FieldName> caseRecordExclude(RecordExclude operation) {
		if(operation.getField() == null) return null;
		current.remove(operation.getField().getName());
		return null;
	}
	
	@Override
	public Map<String, FieldName> caseRecordRename(RecordRename operation) {
		if(operation.getOriginalField() == null || operation.getNewField() == null)
			return null;
		current.remove(operation.getOriginalField().getName());
		current.put(operation.getNewField().getName(), operation.getNewField());
		return null;
	}
	
	/* Service methods */
	
	private void dump(Map<String, FieldName> destination, Map<String, FieldName> source) {
		Collection<FieldName> fieldList = source.values();
		
		for(FieldName field : fieldList) {
			destination.put(field.getName(), field);
		}
	}
	
	@Override
	protected Map<String, FieldName> defaultConstructor() {
		return new HashMap<String, FieldName>();
	}
}
