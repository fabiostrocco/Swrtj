/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.xtext.example.swrtj.SwrtjFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwrtjFactoryImpl extends EFactoryImpl implements SwrtjFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SwrtjFactory init()
  {
    try
    {
      SwrtjFactory theSwrtjFactory = (SwrtjFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/Swrtj"); 
      if (theSwrtjFactory != null)
      {
        return theSwrtjFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SwrtjFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwrtjFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SwrtjPackage.FILE: return createFile();
      case SwrtjPackage.IMPORT: return createImport();
      case SwrtjPackage.ELEMENT: return createElement();
      case SwrtjPackage.INTERFACE: return createInterface();
      case SwrtjPackage.RECORD: return createRecord();
      case SwrtjPackage.TRAIT: return createTrait();
      case SwrtjPackage.CLASS: return createClass();
      case SwrtjPackage.PROGRAM: return createProgram();
      case SwrtjPackage.RECORD_EXPRESSION: return createRecordExpression();
      case SwrtjPackage.BASE_RECORD: return createBaseRecord();
      case SwrtjPackage.ANONIMOUS_RECORD: return createAnonimousRecord();
      case SwrtjPackage.RECORD_NAME: return createRecordName();
      case SwrtjPackage.NESTED_RECORD_EXPRESSION: return createNestedRecordExpression();
      case SwrtjPackage.RECORD_OPERATION: return createRecordOperation();
      case SwrtjPackage.TRAIT_EXPRESSION: return createTraitExpression();
      case SwrtjPackage.BASE_TRAIT: return createBaseTrait();
      case SwrtjPackage.ANONIMOUS_TRAIT: return createAnonimousTrait();
      case SwrtjPackage.TRAIT_NAME: return createTraitName();
      case SwrtjPackage.NESTED_TRAIT_EXPRESSION: return createNestedTraitExpression();
      case SwrtjPackage.TRAIT_OPERATION: return createTraitOperation();
      case SwrtjPackage.TRAIT_ELEMENT: return createTraitElement();
      case SwrtjPackage.FIELD: return createField();
      case SwrtjPackage.METHOD: return createMethod();
      case SwrtjPackage.CONSTRUCTOR: return createConstructor();
      case SwrtjPackage.RETURN_STATEMENT: return createReturnStatement();
      case SwrtjPackage.PARAMETER: return createParameter();
      case SwrtjPackage.FIELD_NAME: return createFieldName();
      case SwrtjPackage.METHOD_NAME: return createMethodName();
      case SwrtjPackage.TYPE: return createType();
      case SwrtjPackage.BLOCK: return createBlock();
      case SwrtjPackage.STATEMENT: return createStatement();
      case SwrtjPackage.EXPRESSION_STATEMENT: return createExpressionStatement();
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT: return createIfThenElseStatement();
      case SwrtjPackage.WHILE_STATEMENT: return createWhileStatement();
      case SwrtjPackage.GENERIC_EXPRESSION: return createGenericExpression();
      case SwrtjPackage.BOOLEAN_OPERATOR: return createBooleanOperator();
      case SwrtjPackage.ATOMIC_BOOLEAN_EXPRESSION: return createAtomicBooleanExpression();
      case SwrtjPackage.SIMPLE_COMPARATION: return createSimpleComparation();
      case SwrtjPackage.NESTED_BOOLEAN_EXPRESSION: return createNestedBooleanExpression();
      case SwrtjPackage.COMPARE_OPERATOR: return createCompareOperator();
      case SwrtjPackage.DOTTED_EXPRESSION: return createDottedExpression();
      case SwrtjPackage.START: return createStart();
      case SwrtjPackage.NULL: return createNull();
      case SwrtjPackage.INPUT: return createInput();
      case SwrtjPackage.ARGS: return createArgs();
      case SwrtjPackage.OUTPUT: return createOutput();
      case SwrtjPackage.BOOLEAN_CONSTANT: return createBooleanConstant();
      case SwrtjPackage.NUMBER: return createNumber();
      case SwrtjPackage.STRING_CONSTANT: return createStringConstant();
      case SwrtjPackage.THIS: return createThis();
      case SwrtjPackage.PARAMETER_REFERENCE: return createParameterReference();
      case SwrtjPackage.CONSTRUCTOR_INVOCATION: return createConstructorInvocation();
      case SwrtjPackage.CAST: return createCast();
      case SwrtjPackage.NESTED_EXPRESSION: return createNestedExpression();
      case SwrtjPackage.MESSAGE: return createMessage();
      case SwrtjPackage.METHOD_INVOCATION: return createMethodInvocation();
      case SwrtjPackage.FIELD_ACCESS: return createFieldAccess();
      case SwrtjPackage.PARAMETER_ASSIGNMENT: return createParameterAssignment();
      case SwrtjPackage.RECORD_EXCLUDE: return createRecordExclude();
      case SwrtjPackage.RECORD_RENAME: return createRecordRename();
      case SwrtjPackage.TRAIT_EXCLUDE: return createTraitExclude();
      case SwrtjPackage.TRAIT_ALIAS: return createTraitAlias();
      case SwrtjPackage.TRAIT_METHOD_RENAME: return createTraitMethodRename();
      case SwrtjPackage.TRAIT_FIELD_RENAME: return createTraitFieldRename();
      case SwrtjPackage.FIELD_DECLARATION: return createFieldDeclaration();
      case SwrtjPackage.REQUIRED_FIELD: return createRequiredField();
      case SwrtjPackage.REQUIRED_METHOD: return createRequiredMethod();
      case SwrtjPackage.PROVIDED_METHOD: return createProvidedMethod();
      case SwrtjPackage.FORMAL_PARAMETER: return createFormalParameter();
      case SwrtjPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case SwrtjPackage.LOCAL_PARAMETER: return createLocalParameter();
      case SwrtjPackage.EXPRESSION: return createExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Record createRecord()
  {
    RecordImpl record = new RecordImpl();
    return record;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait createTrait()
  {
    TraitImpl trait = new TraitImpl();
    return trait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.swrtj.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordExpression createRecordExpression()
  {
    RecordExpressionImpl recordExpression = new RecordExpressionImpl();
    return recordExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseRecord createBaseRecord()
  {
    BaseRecordImpl baseRecord = new BaseRecordImpl();
    return baseRecord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonimousRecord createAnonimousRecord()
  {
    AnonimousRecordImpl anonimousRecord = new AnonimousRecordImpl();
    return anonimousRecord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordName createRecordName()
  {
    RecordNameImpl recordName = new RecordNameImpl();
    return recordName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedRecordExpression createNestedRecordExpression()
  {
    NestedRecordExpressionImpl nestedRecordExpression = new NestedRecordExpressionImpl();
    return nestedRecordExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordOperation createRecordOperation()
  {
    RecordOperationImpl recordOperation = new RecordOperationImpl();
    return recordOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraitExpression createTraitExpression()
  {
    TraitExpressionImpl traitExpression = new TraitExpressionImpl();
    return traitExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseTrait createBaseTrait()
  {
    BaseTraitImpl baseTrait = new BaseTraitImpl();
    return baseTrait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonimousTrait createAnonimousTrait()
  {
    AnonimousTraitImpl anonimousTrait = new AnonimousTraitImpl();
    return anonimousTrait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraitName createTraitName()
  {
    TraitNameImpl traitName = new TraitNameImpl();
    return traitName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedTraitExpression createNestedTraitExpression()
  {
    NestedTraitExpressionImpl nestedTraitExpression = new NestedTraitExpressionImpl();
    return nestedTraitExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraitOperation createTraitOperation()
  {
    TraitOperationImpl traitOperation = new TraitOperationImpl();
    return traitOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraitElement createTraitElement()
  {
    TraitElementImpl traitElement = new TraitElementImpl();
    return traitElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor createConstructor()
  {
    ConstructorImpl constructor = new ConstructorImpl();
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldName createFieldName()
  {
    FieldNameImpl fieldName = new FieldNameImpl();
    return fieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodName createMethodName()
  {
    MethodNameImpl methodName = new MethodNameImpl();
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionStatement createExpressionStatement()
  {
    ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
    return expressionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfThenElseStatement createIfThenElseStatement()
  {
    IfThenElseStatementImpl ifThenElseStatement = new IfThenElseStatementImpl();
    return ifThenElseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStatement createWhileStatement()
  {
    WhileStatementImpl whileStatement = new WhileStatementImpl();
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericExpression createGenericExpression()
  {
    GenericExpressionImpl genericExpression = new GenericExpressionImpl();
    return genericExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanOperator createBooleanOperator()
  {
    BooleanOperatorImpl booleanOperator = new BooleanOperatorImpl();
    return booleanOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicBooleanExpression createAtomicBooleanExpression()
  {
    AtomicBooleanExpressionImpl atomicBooleanExpression = new AtomicBooleanExpressionImpl();
    return atomicBooleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleComparation createSimpleComparation()
  {
    SimpleComparationImpl simpleComparation = new SimpleComparationImpl();
    return simpleComparation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedBooleanExpression createNestedBooleanExpression()
  {
    NestedBooleanExpressionImpl nestedBooleanExpression = new NestedBooleanExpressionImpl();
    return nestedBooleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareOperator createCompareOperator()
  {
    CompareOperatorImpl compareOperator = new CompareOperatorImpl();
    return compareOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DottedExpression createDottedExpression()
  {
    DottedExpressionImpl dottedExpression = new DottedExpressionImpl();
    return dottedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Start createStart()
  {
    StartImpl start = new StartImpl();
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Null createNull()
  {
    NullImpl null_ = new NullImpl();
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Args createArgs()
  {
    ArgsImpl args = new ArgsImpl();
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanConstant createBooleanConstant()
  {
    BooleanConstantImpl booleanConstant = new BooleanConstantImpl();
    return booleanConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.swrtj.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public This createThis()
  {
    ThisImpl this_ = new ThisImpl();
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterReference createParameterReference()
  {
    ParameterReferenceImpl parameterReference = new ParameterReferenceImpl();
    return parameterReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorInvocation createConstructorInvocation()
  {
    ConstructorInvocationImpl constructorInvocation = new ConstructorInvocationImpl();
    return constructorInvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cast createCast()
  {
    CastImpl cast = new CastImpl();
    return cast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedExpression createNestedExpression()
  {
    NestedExpressionImpl nestedExpression = new NestedExpressionImpl();
    return nestedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodInvocation createMethodInvocation()
  {
    MethodInvocationImpl methodInvocation = new MethodInvocationImpl();
    return methodInvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldAccess createFieldAccess()
  {
    FieldAccessImpl fieldAccess = new FieldAccessImpl();
    return fieldAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterAssignment createParameterAssignment()
  {
    ParameterAssignmentImpl parameterAssignment = new ParameterAssignmentImpl();
    return parameterAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordExclude createRecordExclude()
  {
    RecordExcludeImpl recordExclude = new RecordExcludeImpl();
    return recordExclude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordRename createRecordRename()
  {
    RecordRenameImpl recordRename = new RecordRenameImpl();
    return recordRename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraitExclude createTraitExclude()
  {
    TraitExcludeImpl traitExclude = new TraitExcludeImpl();
    return traitExclude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraitAlias createTraitAlias()
  {
    TraitAliasImpl traitAlias = new TraitAliasImpl();
    return traitAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraitMethodRename createTraitMethodRename()
  {
    TraitMethodRenameImpl traitMethodRename = new TraitMethodRenameImpl();
    return traitMethodRename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraitFieldRename createTraitFieldRename()
  {
    TraitFieldRenameImpl traitFieldRename = new TraitFieldRenameImpl();
    return traitFieldRename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDeclaration createFieldDeclaration()
  {
    FieldDeclarationImpl fieldDeclaration = new FieldDeclarationImpl();
    return fieldDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredField createRequiredField()
  {
    RequiredFieldImpl requiredField = new RequiredFieldImpl();
    return requiredField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredMethod createRequiredMethod()
  {
    RequiredMethodImpl requiredMethod = new RequiredMethodImpl();
    return requiredMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidedMethod createProvidedMethod()
  {
    ProvidedMethodImpl providedMethod = new ProvidedMethodImpl();
    return providedMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalParameter createFormalParameter()
  {
    FormalParameterImpl formalParameter = new FormalParameterImpl();
    return formalParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalParameter createLocalParameter()
  {
    LocalParameterImpl localParameter = new LocalParameterImpl();
    return localParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwrtjPackage getSwrtjPackage()
  {
    return (SwrtjPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SwrtjPackage getPackage()
  {
    return SwrtjPackage.eINSTANCE;
  }

} //SwrtjFactoryImpl
