/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.xtext.example.swrtj.AnonimousRecord;
import org.xtext.example.swrtj.AnonimousTrait;
import org.xtext.example.swrtj.Args;
import org.xtext.example.swrtj.AtomicBooleanExpression;
import org.xtext.example.swrtj.BaseRecord;
import org.xtext.example.swrtj.BaseTrait;
import org.xtext.example.swrtj.Block;
import org.xtext.example.swrtj.BooleanConstant;
import org.xtext.example.swrtj.BooleanExpression;
import org.xtext.example.swrtj.BooleanOperator;
import org.xtext.example.swrtj.Cast;
import org.xtext.example.swrtj.CompareOperator;
import org.xtext.example.swrtj.Constructor;
import org.xtext.example.swrtj.ConstructorInvocation;
import org.xtext.example.swrtj.DottedExpression;
import org.xtext.example.swrtj.Element;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.ExpressionStatement;
import org.xtext.example.swrtj.Field;
import org.xtext.example.swrtj.FieldAccess;
import org.xtext.example.swrtj.FieldDeclaration;
import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.FormalParameter;
import org.xtext.example.swrtj.GenericExpression;
import org.xtext.example.swrtj.IfThenElseStatement;
import org.xtext.example.swrtj.Import;
import org.xtext.example.swrtj.Input;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.LocalParameter;
import org.xtext.example.swrtj.Message;
import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.MethodInvocation;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.NestedBooleanExpression;
import org.xtext.example.swrtj.NestedExpression;
import org.xtext.example.swrtj.NestedRecordExpression;
import org.xtext.example.swrtj.NestedTraitExpression;
import org.xtext.example.swrtj.Null;
import org.xtext.example.swrtj.Output;
import org.xtext.example.swrtj.Parameter;
import org.xtext.example.swrtj.ParameterAssignment;
import org.xtext.example.swrtj.ParameterReference;
import org.xtext.example.swrtj.Program;
import org.xtext.example.swrtj.ProvidedMethod;
import org.xtext.example.swrtj.Record;
import org.xtext.example.swrtj.RecordExclude;
import org.xtext.example.swrtj.RecordExpression;
import org.xtext.example.swrtj.RecordName;
import org.xtext.example.swrtj.RecordOperation;
import org.xtext.example.swrtj.RecordRename;
import org.xtext.example.swrtj.RequiredField;
import org.xtext.example.swrtj.RequiredMethod;
import org.xtext.example.swrtj.ReturnStatement;
import org.xtext.example.swrtj.SimpleComparation;
import org.xtext.example.swrtj.Start;
import org.xtext.example.swrtj.Statement;
import org.xtext.example.swrtj.StringConstant;
import org.xtext.example.swrtj.SwrtjPackage;
import org.xtext.example.swrtj.This;
import org.xtext.example.swrtj.Trait;
import org.xtext.example.swrtj.TraitAlias;
import org.xtext.example.swrtj.TraitElement;
import org.xtext.example.swrtj.TraitExclude;
import org.xtext.example.swrtj.TraitExpression;
import org.xtext.example.swrtj.TraitFieldRename;
import org.xtext.example.swrtj.TraitMethodRename;
import org.xtext.example.swrtj.TraitName;
import org.xtext.example.swrtj.TraitOperation;
import org.xtext.example.swrtj.Type;
import org.xtext.example.swrtj.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.swrtj.SwrtjPackage
 * @generated
 */
public class SwrtjSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SwrtjPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwrtjSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SwrtjPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SwrtjPackage.FILE:
      {
        File file = (File)theEObject;
        T result = caseFile(file);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.INTERFACE:
      {
        Interface interface_ = (Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = caseElement(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.RECORD:
      {
        Record record = (Record)theEObject;
        T result = caseRecord(record);
        if (result == null) result = caseElement(record);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.TRAIT:
      {
        Trait trait = (Trait)theEObject;
        T result = caseTrait(trait);
        if (result == null) result = caseElement(trait);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.CLASS:
      {
        org.xtext.example.swrtj.Class class_ = (org.xtext.example.swrtj.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseElement(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = caseElement(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.RECORD_EXPRESSION:
      {
        RecordExpression recordExpression = (RecordExpression)theEObject;
        T result = caseRecordExpression(recordExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.BASE_RECORD:
      {
        BaseRecord baseRecord = (BaseRecord)theEObject;
        T result = caseBaseRecord(baseRecord);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.ANONIMOUS_RECORD:
      {
        AnonimousRecord anonimousRecord = (AnonimousRecord)theEObject;
        T result = caseAnonimousRecord(anonimousRecord);
        if (result == null) result = caseBaseRecord(anonimousRecord);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.RECORD_NAME:
      {
        RecordName recordName = (RecordName)theEObject;
        T result = caseRecordName(recordName);
        if (result == null) result = caseBaseRecord(recordName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.NESTED_RECORD_EXPRESSION:
      {
        NestedRecordExpression nestedRecordExpression = (NestedRecordExpression)theEObject;
        T result = caseNestedRecordExpression(nestedRecordExpression);
        if (result == null) result = caseBaseRecord(nestedRecordExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.RECORD_OPERATION:
      {
        RecordOperation recordOperation = (RecordOperation)theEObject;
        T result = caseRecordOperation(recordOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.TRAIT_EXPRESSION:
      {
        TraitExpression traitExpression = (TraitExpression)theEObject;
        T result = caseTraitExpression(traitExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.BASE_TRAIT:
      {
        BaseTrait baseTrait = (BaseTrait)theEObject;
        T result = caseBaseTrait(baseTrait);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.ANONIMOUS_TRAIT:
      {
        AnonimousTrait anonimousTrait = (AnonimousTrait)theEObject;
        T result = caseAnonimousTrait(anonimousTrait);
        if (result == null) result = caseBaseTrait(anonimousTrait);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.TRAIT_NAME:
      {
        TraitName traitName = (TraitName)theEObject;
        T result = caseTraitName(traitName);
        if (result == null) result = caseBaseTrait(traitName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.NESTED_TRAIT_EXPRESSION:
      {
        NestedTraitExpression nestedTraitExpression = (NestedTraitExpression)theEObject;
        T result = caseNestedTraitExpression(nestedTraitExpression);
        if (result == null) result = caseBaseTrait(nestedTraitExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.TRAIT_OPERATION:
      {
        TraitOperation traitOperation = (TraitOperation)theEObject;
        T result = caseTraitOperation(traitOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.TRAIT_ELEMENT:
      {
        TraitElement traitElement = (TraitElement)theEObject;
        T result = caseTraitElement(traitElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.FIELD:
      {
        Field field = (Field)theEObject;
        T result = caseField(field);
        if (result == null) result = caseTraitElement(field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.METHOD:
      {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = caseTraitElement(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.CONSTRUCTOR:
      {
        Constructor constructor = (Constructor)theEObject;
        T result = caseConstructor(constructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.RETURN_STATEMENT:
      {
        ReturnStatement returnStatement = (ReturnStatement)theEObject;
        T result = caseReturnStatement(returnStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.FIELD_NAME:
      {
        FieldName fieldName = (FieldName)theEObject;
        T result = caseFieldName(fieldName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.METHOD_NAME:
      {
        MethodName methodName = (MethodName)theEObject;
        T result = caseMethodName(methodName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.EXPRESSION_STATEMENT:
      {
        ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
        T result = caseExpressionStatement(expressionStatement);
        if (result == null) result = caseStatement(expressionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT:
      {
        IfThenElseStatement ifThenElseStatement = (IfThenElseStatement)theEObject;
        T result = caseIfThenElseStatement(ifThenElseStatement);
        if (result == null) result = caseStatement(ifThenElseStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.WHILE_STATEMENT:
      {
        WhileStatement whileStatement = (WhileStatement)theEObject;
        T result = caseWhileStatement(whileStatement);
        if (result == null) result = caseStatement(whileStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.GENERIC_EXPRESSION:
      {
        GenericExpression genericExpression = (GenericExpression)theEObject;
        T result = caseGenericExpression(genericExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.BOOLEAN_OPERATOR:
      {
        BooleanOperator booleanOperator = (BooleanOperator)theEObject;
        T result = caseBooleanOperator(booleanOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.ATOMIC_BOOLEAN_EXPRESSION:
      {
        AtomicBooleanExpression atomicBooleanExpression = (AtomicBooleanExpression)theEObject;
        T result = caseAtomicBooleanExpression(atomicBooleanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.SIMPLE_COMPARATION:
      {
        SimpleComparation simpleComparation = (SimpleComparation)theEObject;
        T result = caseSimpleComparation(simpleComparation);
        if (result == null) result = caseAtomicBooleanExpression(simpleComparation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.NESTED_BOOLEAN_EXPRESSION:
      {
        NestedBooleanExpression nestedBooleanExpression = (NestedBooleanExpression)theEObject;
        T result = caseNestedBooleanExpression(nestedBooleanExpression);
        if (result == null) result = caseAtomicBooleanExpression(nestedBooleanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.COMPARE_OPERATOR:
      {
        CompareOperator compareOperator = (CompareOperator)theEObject;
        T result = caseCompareOperator(compareOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.DOTTED_EXPRESSION:
      {
        DottedExpression dottedExpression = (DottedExpression)theEObject;
        T result = caseDottedExpression(dottedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.START:
      {
        Start start = (Start)theEObject;
        T result = caseStart(start);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.NULL:
      {
        Null null_ = (Null)theEObject;
        T result = caseNull(null_);
        if (result == null) result = caseStart(null_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = caseStart(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.ARGS:
      {
        Args args = (Args)theEObject;
        T result = caseArgs(args);
        if (result == null) result = caseStart(args);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.OUTPUT:
      {
        Output output = (Output)theEObject;
        T result = caseOutput(output);
        if (result == null) result = caseStart(output);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.BOOLEAN_CONSTANT:
      {
        BooleanConstant booleanConstant = (BooleanConstant)theEObject;
        T result = caseBooleanConstant(booleanConstant);
        if (result == null) result = caseStart(booleanConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.NUMBER:
      {
        org.xtext.example.swrtj.Number number = (org.xtext.example.swrtj.Number)theEObject;
        T result = caseNumber(number);
        if (result == null) result = caseStart(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.STRING_CONSTANT:
      {
        StringConstant stringConstant = (StringConstant)theEObject;
        T result = caseStringConstant(stringConstant);
        if (result == null) result = caseStart(stringConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.THIS:
      {
        This this_ = (This)theEObject;
        T result = caseThis(this_);
        if (result == null) result = caseStart(this_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.PARAMETER_REFERENCE:
      {
        ParameterReference parameterReference = (ParameterReference)theEObject;
        T result = caseParameterReference(parameterReference);
        if (result == null) result = caseStart(parameterReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.CONSTRUCTOR_INVOCATION:
      {
        ConstructorInvocation constructorInvocation = (ConstructorInvocation)theEObject;
        T result = caseConstructorInvocation(constructorInvocation);
        if (result == null) result = caseStart(constructorInvocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.CAST:
      {
        Cast cast = (Cast)theEObject;
        T result = caseCast(cast);
        if (result == null) result = caseStart(cast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.NESTED_EXPRESSION:
      {
        NestedExpression nestedExpression = (NestedExpression)theEObject;
        T result = caseNestedExpression(nestedExpression);
        if (result == null) result = caseStart(nestedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.MESSAGE:
      {
        Message message = (Message)theEObject;
        T result = caseMessage(message);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.METHOD_INVOCATION:
      {
        MethodInvocation methodInvocation = (MethodInvocation)theEObject;
        T result = caseMethodInvocation(methodInvocation);
        if (result == null) result = caseMessage(methodInvocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.FIELD_ACCESS:
      {
        FieldAccess fieldAccess = (FieldAccess)theEObject;
        T result = caseFieldAccess(fieldAccess);
        if (result == null) result = caseMessage(fieldAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.PARAMETER_ASSIGNMENT:
      {
        ParameterAssignment parameterAssignment = (ParameterAssignment)theEObject;
        T result = caseParameterAssignment(parameterAssignment);
        if (result == null) result = caseStart(parameterAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.RECORD_EXCLUDE:
      {
        RecordExclude recordExclude = (RecordExclude)theEObject;
        T result = caseRecordExclude(recordExclude);
        if (result == null) result = caseRecordOperation(recordExclude);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.RECORD_RENAME:
      {
        RecordRename recordRename = (RecordRename)theEObject;
        T result = caseRecordRename(recordRename);
        if (result == null) result = caseRecordOperation(recordRename);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.TRAIT_EXCLUDE:
      {
        TraitExclude traitExclude = (TraitExclude)theEObject;
        T result = caseTraitExclude(traitExclude);
        if (result == null) result = caseTraitOperation(traitExclude);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.TRAIT_ALIAS:
      {
        TraitAlias traitAlias = (TraitAlias)theEObject;
        T result = caseTraitAlias(traitAlias);
        if (result == null) result = caseTraitOperation(traitAlias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.TRAIT_METHOD_RENAME:
      {
        TraitMethodRename traitMethodRename = (TraitMethodRename)theEObject;
        T result = caseTraitMethodRename(traitMethodRename);
        if (result == null) result = caseTraitOperation(traitMethodRename);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.TRAIT_FIELD_RENAME:
      {
        TraitFieldRename traitFieldRename = (TraitFieldRename)theEObject;
        T result = caseTraitFieldRename(traitFieldRename);
        if (result == null) result = caseTraitOperation(traitFieldRename);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.FIELD_DECLARATION:
      {
        FieldDeclaration fieldDeclaration = (FieldDeclaration)theEObject;
        T result = caseFieldDeclaration(fieldDeclaration);
        if (result == null) result = caseField(fieldDeclaration);
        if (result == null) result = caseTraitElement(fieldDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.REQUIRED_FIELD:
      {
        RequiredField requiredField = (RequiredField)theEObject;
        T result = caseRequiredField(requiredField);
        if (result == null) result = caseField(requiredField);
        if (result == null) result = caseTraitElement(requiredField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.REQUIRED_METHOD:
      {
        RequiredMethod requiredMethod = (RequiredMethod)theEObject;
        T result = caseRequiredMethod(requiredMethod);
        if (result == null) result = caseMethod(requiredMethod);
        if (result == null) result = caseTraitElement(requiredMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.PROVIDED_METHOD:
      {
        ProvidedMethod providedMethod = (ProvidedMethod)theEObject;
        T result = caseProvidedMethod(providedMethod);
        if (result == null) result = caseMethod(providedMethod);
        if (result == null) result = caseTraitElement(providedMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.FORMAL_PARAMETER:
      {
        FormalParameter formalParameter = (FormalParameter)theEObject;
        T result = caseFormalParameter(formalParameter);
        if (result == null) result = caseParameter(formalParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.BOOLEAN_EXPRESSION:
      {
        BooleanExpression booleanExpression = (BooleanExpression)theEObject;
        T result = caseBooleanExpression(booleanExpression);
        if (result == null) result = caseGenericExpression(booleanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.LOCAL_PARAMETER:
      {
        LocalParameter localParameter = (LocalParameter)theEObject;
        T result = caseLocalParameter(localParameter);
        if (result == null) result = caseParameter(localParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SwrtjPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseGenericExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFile(File object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecord(Record object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrait(Trait object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(org.xtext.example.swrtj.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordExpression(RecordExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Record</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Record</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseRecord(BaseRecord object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anonimous Record</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anonimous Record</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnonimousRecord(AnonimousRecord object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordName(RecordName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Record Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Record Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedRecordExpression(NestedRecordExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordOperation(RecordOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraitExpression(TraitExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Trait</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Trait</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseTrait(BaseTrait object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anonimous Trait</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anonimous Trait</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnonimousTrait(AnonimousTrait object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraitName(TraitName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Trait Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Trait Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedTraitExpression(NestedTraitExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraitOperation(TraitOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraitElement(TraitElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField(Field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod(Method object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructor(Constructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnStatement(ReturnStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldName(FieldName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodName(MethodName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionStatement(ExpressionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Then Else Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Then Else Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfThenElseStatement(IfThenElseStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhileStatement(WhileStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericExpression(GenericExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanOperator(BooleanOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Boolean Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicBooleanExpression(AtomicBooleanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Comparation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Comparation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleComparation(SimpleComparation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Boolean Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedBooleanExpression(NestedBooleanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compare Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compare Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompareOperator(CompareOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dotted Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dotted Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDottedExpression(DottedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStart(Start object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNull(Null object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput(Input object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Args</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Args</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgs(Args object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutput(Output object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanConstant(BooleanConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumber(org.xtext.example.swrtj.Number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringConstant(StringConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>This</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>This</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThis(This object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterReference(ParameterReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor Invocation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor Invocation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructorInvocation(ConstructorInvocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCast(Cast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedExpression(NestedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessage(Message object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodInvocation(MethodInvocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldAccess(FieldAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterAssignment(ParameterAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Exclude</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Exclude</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordExclude(RecordExclude object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Rename</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Rename</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordRename(RecordRename object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait Exclude</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait Exclude</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraitExclude(TraitExclude object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraitAlias(TraitAlias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait Method Rename</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait Method Rename</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraitMethodRename(TraitMethodRename object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait Field Rename</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait Field Rename</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraitFieldRename(TraitFieldRename object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldDeclaration(FieldDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiredField(RequiredField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiredMethod(RequiredMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provided Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provided Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvidedMethod(ProvidedMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalParameter(FormalParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExpression(BooleanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalParameter(LocalParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SwrtjSwitch
