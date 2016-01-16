package org.xtext.example.navigation;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.xtext.example.swrtj.AnonimousRecord;
import org.xtext.example.swrtj.BaseRecord;
import org.xtext.example.swrtj.NestedRecordExpression;
import org.xtext.example.swrtj.Record;
import org.xtext.example.swrtj.RecordExpression;
import org.xtext.example.swrtj.RecordName;
import org.xtext.example.swrtj.SwrtjPackage;
import org.xtext.example.utils.ErrorMessage;

public class RecordCicleChecker extends Navigator<Collection<ErrorMessage>> {
	private Set<String> recordNames = new HashSet<String>();
	private String recordName;
	private Record ownerRecord;
	
	/**
	 * Navigate on the record and collects the results.
	 * @param record the record to navigate.
	 * @return the target result.
	 */
	public Collection<ErrorMessage> navigate(Record record) {
		if(record == null) return defaultConstructor();
		
		RecordExpression expression = record.getExpression();
		if(expression == null) return defaultConstructor();
		if(recordName == null) recordName = record.getName();
		if(ownerRecord == null) ownerRecord = record;
		
		return doNavigate(expression);
	}
	
	/**
	 * Starts the navigation.
	 * @param expression the record expression.
	 * @return the record accessible fields.
	 */
	protected Collection<ErrorMessage> doNavigate(RecordExpression expression) {
		Collection<ErrorMessage> errorList = defaultConstructor();
		Collection<BaseRecord> recordList = expression.getRecordList();
		
		for(BaseRecord record : recordList) {
			errorList.addAll(doSwitch(record));
		}
		
		return errorList;
	}
	
	@Override
	public Collection<ErrorMessage> caseAnonimousRecord(AnonimousRecord record) {
		return defaultConstructor();
	}
	
	@Override
	public Collection<ErrorMessage> caseRecordName(RecordName record) {
		Collection<ErrorMessage> errorList = defaultConstructor();
		String name = record.getRecord().getName();
		
		if(!recordNames.add(name))
			return defaultConstructor();
		else if(recordName.equals(name)) {
			errorList.add(new ErrorMessage("Cyclic record definition", ownerRecord, SwrtjPackage.RECORD__NAME));
			return errorList;
		} else return navigate(record.getRecord());		
	}	
	
	@Override
	public Collection<ErrorMessage> caseNestedRecordExpression(NestedRecordExpression record) {
		return (record.getExpression() == null ? defaultConstructor() : doNavigate(record.getExpression()));
	}	

	@Override
	protected Collection<ErrorMessage> defaultConstructor() {
		return new LinkedList<ErrorMessage>();
	}
}
