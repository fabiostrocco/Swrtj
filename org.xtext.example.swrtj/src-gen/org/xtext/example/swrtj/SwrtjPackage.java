/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.swrtj.SwrtjFactory
 * @model kind="package"
 * @generated
 */
public interface SwrtjPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "swrtj";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/Swrtj";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "swrtj";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SwrtjPackage eINSTANCE = org.xtext.example.swrtj.impl.SwrtjPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.FileImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getFile()
   * @generated
   */
  int FILE = 0;

  /**
   * The feature id for the '<em><b>Import List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__IMPORT_LIST = 0;

  /**
   * The feature id for the '<em><b>Element List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__ELEMENT_LIST = 1;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ImportImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ElementImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Construct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__CONSTRUCT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.InterfaceImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 3;

  /**
   * The feature id for the '<em><b>Construct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__CONSTRUCT = ELEMENT__CONSTRUCT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Extends List</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__EXTENDS_LIST = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Required Method List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__REQUIRED_METHOD_LIST = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.RecordImpl <em>Record</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.RecordImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRecord()
   * @generated
   */
  int RECORD = 4;

  /**
   * The feature id for the '<em><b>Construct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__CONSTRUCT = ELEMENT__CONSTRUCT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__EXPRESSION = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Record</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.TraitImpl <em>Trait</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.TraitImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTrait()
   * @generated
   */
  int TRAIT = 5;

  /**
   * The feature id for the '<em><b>Construct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT__CONSTRUCT = ELEMENT__CONSTRUCT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT__EXPRESSION = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trait</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ClassImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 6;

  /**
   * The feature id for the '<em><b>Construct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__CONSTRUCT = ELEMENT__CONSTRUCT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Implements List</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__IMPLEMENTS_LIST = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Record Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__RECORD_EXPRESSION = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Trait Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__TRAIT_EXPRESSION = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Constructor List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__CONSTRUCTOR_LIST = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ProgramImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 7;

  /**
   * The feature id for the '<em><b>Construct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__CONSTRUCT = ELEMENT__CONSTRUCT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__BLOCK = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.RecordExpressionImpl <em>Record Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.RecordExpressionImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRecordExpression()
   * @generated
   */
  int RECORD_EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>Record List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_EXPRESSION__RECORD_LIST = 0;

  /**
   * The number of structural features of the '<em>Record Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.BaseRecordImpl <em>Base Record</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.BaseRecordImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getBaseRecord()
   * @generated
   */
  int BASE_RECORD = 9;

  /**
   * The feature id for the '<em><b>Operation List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_RECORD__OPERATION_LIST = 0;

  /**
   * The number of structural features of the '<em>Base Record</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_RECORD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.AnonimousRecordImpl <em>Anonimous Record</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.AnonimousRecordImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getAnonimousRecord()
   * @generated
   */
  int ANONIMOUS_RECORD = 10;

  /**
   * The feature id for the '<em><b>Operation List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONIMOUS_RECORD__OPERATION_LIST = BASE_RECORD__OPERATION_LIST;

  /**
   * The feature id for the '<em><b>Declaration List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONIMOUS_RECORD__DECLARATION_LIST = BASE_RECORD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Anonimous Record</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONIMOUS_RECORD_FEATURE_COUNT = BASE_RECORD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.RecordNameImpl <em>Record Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.RecordNameImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRecordName()
   * @generated
   */
  int RECORD_NAME = 11;

  /**
   * The feature id for the '<em><b>Operation List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_NAME__OPERATION_LIST = BASE_RECORD__OPERATION_LIST;

  /**
   * The feature id for the '<em><b>Record</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_NAME__RECORD = BASE_RECORD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Record Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_NAME_FEATURE_COUNT = BASE_RECORD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.NestedRecordExpressionImpl <em>Nested Record Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.NestedRecordExpressionImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getNestedRecordExpression()
   * @generated
   */
  int NESTED_RECORD_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Operation List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_RECORD_EXPRESSION__OPERATION_LIST = BASE_RECORD__OPERATION_LIST;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_RECORD_EXPRESSION__EXPRESSION = BASE_RECORD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nested Record Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_RECORD_EXPRESSION_FEATURE_COUNT = BASE_RECORD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.RecordOperationImpl <em>Record Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.RecordOperationImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRecordOperation()
   * @generated
   */
  int RECORD_OPERATION = 13;

  /**
   * The number of structural features of the '<em>Record Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_OPERATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.TraitExpressionImpl <em>Trait Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.TraitExpressionImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitExpression()
   * @generated
   */
  int TRAIT_EXPRESSION = 14;

  /**
   * The feature id for the '<em><b>Trait List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_EXPRESSION__TRAIT_LIST = 0;

  /**
   * The number of structural features of the '<em>Trait Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.BaseTraitImpl <em>Base Trait</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.BaseTraitImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getBaseTrait()
   * @generated
   */
  int BASE_TRAIT = 15;

  /**
   * The feature id for the '<em><b>Operation List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_TRAIT__OPERATION_LIST = 0;

  /**
   * The number of structural features of the '<em>Base Trait</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_TRAIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.AnonimousTraitImpl <em>Anonimous Trait</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.AnonimousTraitImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getAnonimousTrait()
   * @generated
   */
  int ANONIMOUS_TRAIT = 16;

  /**
   * The feature id for the '<em><b>Operation List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONIMOUS_TRAIT__OPERATION_LIST = BASE_TRAIT__OPERATION_LIST;

  /**
   * The feature id for the '<em><b>Definition List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONIMOUS_TRAIT__DEFINITION_LIST = BASE_TRAIT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Anonimous Trait</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONIMOUS_TRAIT_FEATURE_COUNT = BASE_TRAIT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.TraitNameImpl <em>Trait Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.TraitNameImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitName()
   * @generated
   */
  int TRAIT_NAME = 17;

  /**
   * The feature id for the '<em><b>Operation List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_NAME__OPERATION_LIST = BASE_TRAIT__OPERATION_LIST;

  /**
   * The feature id for the '<em><b>Trait</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_NAME__TRAIT = BASE_TRAIT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trait Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_NAME_FEATURE_COUNT = BASE_TRAIT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.NestedTraitExpressionImpl <em>Nested Trait Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.NestedTraitExpressionImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getNestedTraitExpression()
   * @generated
   */
  int NESTED_TRAIT_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Operation List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRAIT_EXPRESSION__OPERATION_LIST = BASE_TRAIT__OPERATION_LIST;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRAIT_EXPRESSION__EXPRESSION = BASE_TRAIT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nested Trait Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRAIT_EXPRESSION_FEATURE_COUNT = BASE_TRAIT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.TraitOperationImpl <em>Trait Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.TraitOperationImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitOperation()
   * @generated
   */
  int TRAIT_OPERATION = 19;

  /**
   * The number of structural features of the '<em>Trait Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_OPERATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.TraitElementImpl <em>Trait Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.TraitElementImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitElement()
   * @generated
   */
  int TRAIT_ELEMENT = 20;

  /**
   * The number of structural features of the '<em>Trait Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.FieldImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getField()
   * @generated
   */
  int FIELD = 21;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = TRAIT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__FIELD_REF = TRAIT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = TRAIT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.MethodImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 22;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__RETURN_TYPE = TRAIT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__METHOD_REF = TRAIT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMETER_LIST = TRAIT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = TRAIT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ConstructorImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__PARAMETER_LIST = 1;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__BLOCK = 2;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ReturnStatementImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 24;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ParameterImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 25;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.FieldNameImpl <em>Field Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.FieldNameImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getFieldName()
   * @generated
   */
  int FIELD_NAME = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Field Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.MethodNameImpl <em>Method Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.MethodNameImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getMethodName()
   * @generated
   */
  int METHOD_NAME = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Method Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.TypeImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getType()
   * @generated
   */
  int TYPE = 28;

  /**
   * The feature id for the '<em><b>Interface Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__INTERFACE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__PRIMITIVE_TYPE = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.BlockImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 29;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__PARAMETER_LIST = 0;

  /**
   * The feature id for the '<em><b>Statement List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENT_LIST = 1;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.StatementImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 30;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ExpressionStatementImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getExpressionStatement()
   * @generated
   */
  int EXPRESSION_STATEMENT = 31;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.IfThenElseStatementImpl <em>If Then Else Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.IfThenElseStatementImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getIfThenElseStatement()
   * @generated
   */
  int IF_THEN_ELSE_STATEMENT = 32;

  /**
   * The feature id for the '<em><b>Condiction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_STATEMENT__CONDICTION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>True Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_STATEMENT__TRUE_BRANCH = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>False Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_STATEMENT__FALSE_BRANCH = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Then Else Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.WhileStatementImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getWhileStatement()
   * @generated
   */
  int WHILE_STATEMENT = 33;

  /**
   * The feature id for the '<em><b>Condiction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__CONDICTION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>While Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__WHILE_BLOCK = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.GenericExpressionImpl <em>Generic Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.GenericExpressionImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getGenericExpression()
   * @generated
   */
  int GENERIC_EXPRESSION = 34;

  /**
   * The number of structural features of the '<em>Generic Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.BooleanOperatorImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getBooleanOperator()
   * @generated
   */
  int BOOLEAN_OPERATOR = 35;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_OPERATOR__OPERATOR = 0;

  /**
   * The number of structural features of the '<em>Boolean Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_OPERATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.AtomicBooleanExpressionImpl <em>Atomic Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.AtomicBooleanExpressionImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getAtomicBooleanExpression()
   * @generated
   */
  int ATOMIC_BOOLEAN_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>Negated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_BOOLEAN_EXPRESSION__NEGATED = 0;

  /**
   * The number of structural features of the '<em>Atomic Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_BOOLEAN_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.SimpleComparationImpl <em>Simple Comparation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.SimpleComparationImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getSimpleComparation()
   * @generated
   */
  int SIMPLE_COMPARATION = 37;

  /**
   * The feature id for the '<em><b>Negated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_COMPARATION__NEGATED = ATOMIC_BOOLEAN_EXPRESSION__NEGATED;

  /**
   * The feature id for the '<em><b>Left Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_COMPARATION__LEFT_EXPRESSION = ATOMIC_BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Compare</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_COMPARATION__COMPARE = ATOMIC_BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_COMPARATION__RIGHT_EXPRESSION = ATOMIC_BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Simple Comparation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_COMPARATION_FEATURE_COUNT = ATOMIC_BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.NestedBooleanExpressionImpl <em>Nested Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.NestedBooleanExpressionImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getNestedBooleanExpression()
   * @generated
   */
  int NESTED_BOOLEAN_EXPRESSION = 38;

  /**
   * The feature id for the '<em><b>Negated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_BOOLEAN_EXPRESSION__NEGATED = ATOMIC_BOOLEAN_EXPRESSION__NEGATED;

  /**
   * The feature id for the '<em><b>Nested Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_BOOLEAN_EXPRESSION__NESTED_EXPRESSION = ATOMIC_BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nested Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_BOOLEAN_EXPRESSION_FEATURE_COUNT = ATOMIC_BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.CompareOperatorImpl <em>Compare Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.CompareOperatorImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getCompareOperator()
   * @generated
   */
  int COMPARE_OPERATOR = 39;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_OPERATOR__OPERATOR = 0;

  /**
   * The number of structural features of the '<em>Compare Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_OPERATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.DottedExpressionImpl <em>Dotted Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.DottedExpressionImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getDottedExpression()
   * @generated
   */
  int DOTTED_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOTTED_EXPRESSION__START = 0;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOTTED_EXPRESSION__RECEIVER = 1;

  /**
   * The feature id for the '<em><b>Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOTTED_EXPRESSION__MESSAGE = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOTTED_EXPRESSION__VALUE = 3;

  /**
   * The number of structural features of the '<em>Dotted Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOTTED_EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.StartImpl <em>Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.StartImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getStart()
   * @generated
   */
  int START = 41;

  /**
   * The number of structural features of the '<em>Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.NullImpl <em>Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.NullImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getNull()
   * @generated
   */
  int NULL = 42;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL__NULL = START_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_FEATURE_COUNT = START_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.InputImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getInput()
   * @generated
   */
  int INPUT = 43;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__INPUT = START_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = START_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ArgsImpl <em>Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ArgsImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getArgs()
   * @generated
   */
  int ARGS = 44;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGS__ARGS = START_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Args</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGS_FEATURE_COUNT = START_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.OutputImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 45;

  /**
   * The feature id for the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__OUTPUT = START_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = START_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.BooleanConstantImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getBooleanConstant()
   * @generated
   */
  int BOOLEAN_CONSTANT = 46;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT__VALUE = START_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONSTANT_FEATURE_COUNT = START_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.NumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.NumberImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getNumber()
   * @generated
   */
  int NUMBER = 47;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__VALUE = START_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = START_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.StringConstantImpl <em>String Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.StringConstantImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getStringConstant()
   * @generated
   */
  int STRING_CONSTANT = 48;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT__VALUE = START_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTANT_FEATURE_COUNT = START_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ThisImpl <em>This</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ThisImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getThis()
   * @generated
   */
  int THIS = 49;

  /**
   * The feature id for the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS__THIS = START_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>This</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_FEATURE_COUNT = START_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ParameterReferenceImpl <em>Parameter Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ParameterReferenceImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getParameterReference()
   * @generated
   */
  int PARAMETER_REFERENCE = 50;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REFERENCE__PARAMETER = START_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REFERENCE_FEATURE_COUNT = START_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ConstructorInvocationImpl <em>Constructor Invocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ConstructorInvocationImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getConstructorInvocation()
   * @generated
   */
  int CONSTRUCTOR_INVOCATION = 51;

  /**
   * The feature id for the '<em><b>Class Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_INVOCATION__CLASS_REF = START_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_INVOCATION__ARGUMENT_LIST = START_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constructor Invocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_INVOCATION_FEATURE_COUNT = START_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.CastImpl <em>Cast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.CastImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getCast()
   * @generated
   */
  int CAST = 52;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__TYPE = START_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__START = START_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_FEATURE_COUNT = START_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.NestedExpressionImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getNestedExpression()
   * @generated
   */
  int NESTED_EXPRESSION = 53;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION__EXPRESSION = START_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nested Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION_FEATURE_COUNT = START_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.MessageImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 54;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.MethodInvocationImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getMethodInvocation()
   * @generated
   */
  int METHOD_INVOCATION = 55;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__METHOD = MESSAGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__ARGUMENT_LIST = MESSAGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Invocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.FieldAccessImpl <em>Field Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.FieldAccessImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getFieldAccess()
   * @generated
   */
  int FIELD_ACCESS = 56;

  /**
   * The feature id for the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS__FIELD = MESSAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Field Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ParameterAssignmentImpl <em>Parameter Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ParameterAssignmentImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getParameterAssignment()
   * @generated
   */
  int PARAMETER_ASSIGNMENT = 57;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ASSIGNMENT__PARAMETER = START_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ASSIGNMENT__VALUE = START_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ASSIGNMENT_FEATURE_COUNT = START_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.RecordExcludeImpl <em>Record Exclude</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.RecordExcludeImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRecordExclude()
   * @generated
   */
  int RECORD_EXCLUDE = 58;

  /**
   * The feature id for the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_EXCLUDE__FIELD = RECORD_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Record Exclude</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_EXCLUDE_FEATURE_COUNT = RECORD_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.RecordRenameImpl <em>Record Rename</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.RecordRenameImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRecordRename()
   * @generated
   */
  int RECORD_RENAME = 59;

  /**
   * The feature id for the '<em><b>Original Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_RENAME__ORIGINAL_FIELD = RECORD_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>New Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_RENAME__NEW_FIELD = RECORD_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Record Rename</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_RENAME_FEATURE_COUNT = RECORD_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.TraitExcludeImpl <em>Trait Exclude</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.TraitExcludeImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitExclude()
   * @generated
   */
  int TRAIT_EXCLUDE = 60;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_EXCLUDE__METHOD = TRAIT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trait Exclude</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_EXCLUDE_FEATURE_COUNT = TRAIT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.TraitAliasImpl <em>Trait Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.TraitAliasImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitAlias()
   * @generated
   */
  int TRAIT_ALIAS = 61;

  /**
   * The feature id for the '<em><b>Original Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_ALIAS__ORIGINAL_METHOD = TRAIT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>New Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_ALIAS__NEW_METHOD = TRAIT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Trait Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_ALIAS_FEATURE_COUNT = TRAIT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.TraitMethodRenameImpl <em>Trait Method Rename</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.TraitMethodRenameImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitMethodRename()
   * @generated
   */
  int TRAIT_METHOD_RENAME = 62;

  /**
   * The feature id for the '<em><b>Original Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_METHOD_RENAME__ORIGINAL_METHOD = TRAIT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>New Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_METHOD_RENAME__NEW_METHOD = TRAIT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Trait Method Rename</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_METHOD_RENAME_FEATURE_COUNT = TRAIT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.TraitFieldRenameImpl <em>Trait Field Rename</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.TraitFieldRenameImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitFieldRename()
   * @generated
   */
  int TRAIT_FIELD_RENAME = 63;

  /**
   * The feature id for the '<em><b>Original Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_FIELD_RENAME__ORIGINAL_FIELD = TRAIT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>New Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_FIELD_RENAME__NEW_FIELD = TRAIT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Trait Field Rename</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_FIELD_RENAME_FEATURE_COUNT = TRAIT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.FieldDeclarationImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getFieldDeclaration()
   * @generated
   */
  int FIELD_DECLARATION = 64;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__TYPE = FIELD__TYPE;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__FIELD_REF = FIELD__FIELD_REF;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__MODIFIER = FIELD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Field Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.RequiredFieldImpl <em>Required Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.RequiredFieldImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRequiredField()
   * @generated
   */
  int REQUIRED_FIELD = 65;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_FIELD__TYPE = FIELD__TYPE;

  /**
   * The feature id for the '<em><b>Field Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_FIELD__FIELD_REF = FIELD__FIELD_REF;

  /**
   * The number of structural features of the '<em>Required Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.RequiredMethodImpl <em>Required Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.RequiredMethodImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRequiredMethod()
   * @generated
   */
  int REQUIRED_METHOD = 66;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_METHOD__RETURN_TYPE = METHOD__RETURN_TYPE;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_METHOD__METHOD_REF = METHOD__METHOD_REF;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_METHOD__PARAMETER_LIST = METHOD__PARAMETER_LIST;

  /**
   * The number of structural features of the '<em>Required Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ProvidedMethodImpl <em>Provided Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ProvidedMethodImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getProvidedMethod()
   * @generated
   */
  int PROVIDED_METHOD = 67;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_METHOD__RETURN_TYPE = METHOD__RETURN_TYPE;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_METHOD__METHOD_REF = METHOD__METHOD_REF;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_METHOD__PARAMETER_LIST = METHOD__PARAMETER_LIST;

  /**
   * The feature id for the '<em><b>Is Synchronized</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_METHOD__IS_SYNCHRONIZED = METHOD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_METHOD__BLOCK = METHOD_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Return Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_METHOD__RETURN_STATEMENT = METHOD_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Provided Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.FormalParameterImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getFormalParameter()
   * @generated
   */
  int FORMAL_PARAMETER = 68;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__TYPE = PARAMETER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__NAME = PARAMETER__NAME;

  /**
   * The number of structural features of the '<em>Formal Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.BooleanExpressionImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getBooleanExpression()
   * @generated
   */
  int BOOLEAN_EXPRESSION = 69;

  /**
   * The feature id for the '<em><b>Atomic List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__ATOMIC_LIST = GENERIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Boolean Operator List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR_LIST = GENERIC_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_FEATURE_COUNT = GENERIC_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.LocalParameterImpl <em>Local Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.LocalParameterImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getLocalParameter()
   * @generated
   */
  int LOCAL_PARAMETER = 70;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PARAMETER__TYPE = PARAMETER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PARAMETER__NAME = PARAMETER__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PARAMETER__VALUE = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.swrtj.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.swrtj.impl.ExpressionImpl
   * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 71;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__SIGN = GENERIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Term List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TERM_LIST = GENERIC_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Operator List</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERATOR_LIST = GENERIC_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = GENERIC_EXPRESSION_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.xtext.example.swrtj.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.File#getImportList <em>Import List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Import List</em>'.
   * @see org.xtext.example.swrtj.File#getImportList()
   * @see #getFile()
   * @generated
   */
  EReference getFile_ImportList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.File#getElementList <em>Element List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element List</em>'.
   * @see org.xtext.example.swrtj.File#getElementList()
   * @see #getFile()
   * @generated
   */
  EReference getFile_ElementList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.xtext.example.swrtj.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.xtext.example.swrtj.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.xtext.example.swrtj.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.Element#getConstruct <em>Construct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Construct</em>'.
   * @see org.xtext.example.swrtj.Element#getConstruct()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Construct();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.swrtj.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see org.xtext.example.swrtj.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.swrtj.Interface#getExtendsList <em>Extends List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Extends List</em>'.
   * @see org.xtext.example.swrtj.Interface#getExtendsList()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_ExtendsList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.Interface#getRequiredMethodList <em>Required Method List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Required Method List</em>'.
   * @see org.xtext.example.swrtj.Interface#getRequiredMethodList()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_RequiredMethodList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Record <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record</em>'.
   * @see org.xtext.example.swrtj.Record
   * @generated
   */
  EClass getRecord();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.Record#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.swrtj.Record#getExpression()
   * @see #getRecord()
   * @generated
   */
  EReference getRecord_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Trait <em>Trait</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait</em>'.
   * @see org.xtext.example.swrtj.Trait
   * @generated
   */
  EClass getTrait();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.Trait#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.swrtj.Trait#getExpression()
   * @see #getTrait()
   * @generated
   */
  EReference getTrait_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see org.xtext.example.swrtj.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.swrtj.Class#getImplementsList <em>Implements List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Implements List</em>'.
   * @see org.xtext.example.swrtj.Class#getImplementsList()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_ImplementsList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.Class#getRecordExpression <em>Record Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record Expression</em>'.
   * @see org.xtext.example.swrtj.Class#getRecordExpression()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_RecordExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.Class#getTraitExpression <em>Trait Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trait Expression</em>'.
   * @see org.xtext.example.swrtj.Class#getTraitExpression()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_TraitExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.Class#getConstructorList <em>Constructor List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructor List</em>'.
   * @see org.xtext.example.swrtj.Class#getConstructorList()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_ConstructorList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.xtext.example.swrtj.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.Program#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.swrtj.Program#getBlock()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.RecordExpression <em>Record Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Expression</em>'.
   * @see org.xtext.example.swrtj.RecordExpression
   * @generated
   */
  EClass getRecordExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.RecordExpression#getRecordList <em>Record List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Record List</em>'.
   * @see org.xtext.example.swrtj.RecordExpression#getRecordList()
   * @see #getRecordExpression()
   * @generated
   */
  EReference getRecordExpression_RecordList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.BaseRecord <em>Base Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Record</em>'.
   * @see org.xtext.example.swrtj.BaseRecord
   * @generated
   */
  EClass getBaseRecord();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.BaseRecord#getOperationList <em>Operation List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation List</em>'.
   * @see org.xtext.example.swrtj.BaseRecord#getOperationList()
   * @see #getBaseRecord()
   * @generated
   */
  EReference getBaseRecord_OperationList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.AnonimousRecord <em>Anonimous Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anonimous Record</em>'.
   * @see org.xtext.example.swrtj.AnonimousRecord
   * @generated
   */
  EClass getAnonimousRecord();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.AnonimousRecord#getDeclarationList <em>Declaration List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declaration List</em>'.
   * @see org.xtext.example.swrtj.AnonimousRecord#getDeclarationList()
   * @see #getAnonimousRecord()
   * @generated
   */
  EReference getAnonimousRecord_DeclarationList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.RecordName <em>Record Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Name</em>'.
   * @see org.xtext.example.swrtj.RecordName
   * @generated
   */
  EClass getRecordName();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.RecordName#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Record</em>'.
   * @see org.xtext.example.swrtj.RecordName#getRecord()
   * @see #getRecordName()
   * @generated
   */
  EReference getRecordName_Record();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.NestedRecordExpression <em>Nested Record Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Record Expression</em>'.
   * @see org.xtext.example.swrtj.NestedRecordExpression
   * @generated
   */
  EClass getNestedRecordExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.NestedRecordExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.swrtj.NestedRecordExpression#getExpression()
   * @see #getNestedRecordExpression()
   * @generated
   */
  EReference getNestedRecordExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.RecordOperation <em>Record Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Operation</em>'.
   * @see org.xtext.example.swrtj.RecordOperation
   * @generated
   */
  EClass getRecordOperation();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.TraitExpression <em>Trait Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait Expression</em>'.
   * @see org.xtext.example.swrtj.TraitExpression
   * @generated
   */
  EClass getTraitExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.TraitExpression#getTraitList <em>Trait List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trait List</em>'.
   * @see org.xtext.example.swrtj.TraitExpression#getTraitList()
   * @see #getTraitExpression()
   * @generated
   */
  EReference getTraitExpression_TraitList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.BaseTrait <em>Base Trait</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Trait</em>'.
   * @see org.xtext.example.swrtj.BaseTrait
   * @generated
   */
  EClass getBaseTrait();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.BaseTrait#getOperationList <em>Operation List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation List</em>'.
   * @see org.xtext.example.swrtj.BaseTrait#getOperationList()
   * @see #getBaseTrait()
   * @generated
   */
  EReference getBaseTrait_OperationList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.AnonimousTrait <em>Anonimous Trait</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anonimous Trait</em>'.
   * @see org.xtext.example.swrtj.AnonimousTrait
   * @generated
   */
  EClass getAnonimousTrait();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.AnonimousTrait#getDefinitionList <em>Definition List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definition List</em>'.
   * @see org.xtext.example.swrtj.AnonimousTrait#getDefinitionList()
   * @see #getAnonimousTrait()
   * @generated
   */
  EReference getAnonimousTrait_DefinitionList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.TraitName <em>Trait Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait Name</em>'.
   * @see org.xtext.example.swrtj.TraitName
   * @generated
   */
  EClass getTraitName();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.TraitName#getTrait <em>Trait</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Trait</em>'.
   * @see org.xtext.example.swrtj.TraitName#getTrait()
   * @see #getTraitName()
   * @generated
   */
  EReference getTraitName_Trait();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.NestedTraitExpression <em>Nested Trait Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Trait Expression</em>'.
   * @see org.xtext.example.swrtj.NestedTraitExpression
   * @generated
   */
  EClass getNestedTraitExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.NestedTraitExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.swrtj.NestedTraitExpression#getExpression()
   * @see #getNestedTraitExpression()
   * @generated
   */
  EReference getNestedTraitExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.TraitOperation <em>Trait Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait Operation</em>'.
   * @see org.xtext.example.swrtj.TraitOperation
   * @generated
   */
  EClass getTraitOperation();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.TraitElement <em>Trait Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait Element</em>'.
   * @see org.xtext.example.swrtj.TraitElement
   * @generated
   */
  EClass getTraitElement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.xtext.example.swrtj.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.swrtj.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.Field#getFieldRef <em>Field Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field Ref</em>'.
   * @see org.xtext.example.swrtj.Field#getFieldRef()
   * @see #getField()
   * @generated
   */
  EReference getField_FieldRef();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see org.xtext.example.swrtj.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.Method#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see org.xtext.example.swrtj.Method#getReturnType()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.Method#getMethodRef <em>Method Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method Ref</em>'.
   * @see org.xtext.example.swrtj.Method#getMethodRef()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_MethodRef();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.Method#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter List</em>'.
   * @see org.xtext.example.swrtj.Method#getParameterList()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_ParameterList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see org.xtext.example.swrtj.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.Constructor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.swrtj.Constructor#getName()
   * @see #getConstructor()
   * @generated
   */
  EAttribute getConstructor_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.Constructor#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter List</em>'.
   * @see org.xtext.example.swrtj.Constructor#getParameterList()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_ParameterList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.Constructor#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.swrtj.Constructor#getBlock()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Block();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see org.xtext.example.swrtj.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.ReturnStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.swrtj.ReturnStatement#getExpression()
   * @see #getReturnStatement()
   * @generated
   */
  EReference getReturnStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.example.swrtj.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.swrtj.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.swrtj.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.FieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Name</em>'.
   * @see org.xtext.example.swrtj.FieldName
   * @generated
   */
  EClass getFieldName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.FieldName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.swrtj.FieldName#getName()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.MethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Name</em>'.
   * @see org.xtext.example.swrtj.MethodName
   * @generated
   */
  EClass getMethodName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.MethodName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.swrtj.MethodName#getName()
   * @see #getMethodName()
   * @generated
   */
  EAttribute getMethodName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.example.swrtj.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.Type#getInterfaceType <em>Interface Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interface Type</em>'.
   * @see org.xtext.example.swrtj.Type#getInterfaceType()
   * @see #getType()
   * @generated
   */
  EReference getType_InterfaceType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.Type#getPrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primitive Type</em>'.
   * @see org.xtext.example.swrtj.Type#getPrimitiveType()
   * @see #getType()
   * @generated
   */
  EAttribute getType_PrimitiveType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.xtext.example.swrtj.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.Block#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter List</em>'.
   * @see org.xtext.example.swrtj.Block#getParameterList()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_ParameterList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.Block#getStatementList <em>Statement List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement List</em>'.
   * @see org.xtext.example.swrtj.Block#getStatementList()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_StatementList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.example.swrtj.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.ExpressionStatement <em>Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Statement</em>'.
   * @see org.xtext.example.swrtj.ExpressionStatement
   * @generated
   */
  EClass getExpressionStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.ExpressionStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.swrtj.ExpressionStatement#getExpression()
   * @see #getExpressionStatement()
   * @generated
   */
  EReference getExpressionStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.IfThenElseStatement <em>If Then Else Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Else Statement</em>'.
   * @see org.xtext.example.swrtj.IfThenElseStatement
   * @generated
   */
  EClass getIfThenElseStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.IfThenElseStatement#getCondiction <em>Condiction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condiction</em>'.
   * @see org.xtext.example.swrtj.IfThenElseStatement#getCondiction()
   * @see #getIfThenElseStatement()
   * @generated
   */
  EReference getIfThenElseStatement_Condiction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.IfThenElseStatement#getTrueBranch <em>True Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>True Branch</em>'.
   * @see org.xtext.example.swrtj.IfThenElseStatement#getTrueBranch()
   * @see #getIfThenElseStatement()
   * @generated
   */
  EReference getIfThenElseStatement_TrueBranch();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.IfThenElseStatement#getFalseBranch <em>False Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>False Branch</em>'.
   * @see org.xtext.example.swrtj.IfThenElseStatement#getFalseBranch()
   * @see #getIfThenElseStatement()
   * @generated
   */
  EReference getIfThenElseStatement_FalseBranch();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see org.xtext.example.swrtj.WhileStatement
   * @generated
   */
  EClass getWhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.WhileStatement#getCondiction <em>Condiction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condiction</em>'.
   * @see org.xtext.example.swrtj.WhileStatement#getCondiction()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Condiction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.WhileStatement#getWhileBlock <em>While Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While Block</em>'.
   * @see org.xtext.example.swrtj.WhileStatement#getWhileBlock()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_WhileBlock();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.GenericExpression <em>Generic Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Expression</em>'.
   * @see org.xtext.example.swrtj.GenericExpression
   * @generated
   */
  EClass getGenericExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.BooleanOperator <em>Boolean Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Operator</em>'.
   * @see org.xtext.example.swrtj.BooleanOperator
   * @generated
   */
  EClass getBooleanOperator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.BooleanOperator#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.xtext.example.swrtj.BooleanOperator#getOperator()
   * @see #getBooleanOperator()
   * @generated
   */
  EAttribute getBooleanOperator_Operator();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.AtomicBooleanExpression <em>Atomic Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Boolean Expression</em>'.
   * @see org.xtext.example.swrtj.AtomicBooleanExpression
   * @generated
   */
  EClass getAtomicBooleanExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.AtomicBooleanExpression#isNegated <em>Negated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negated</em>'.
   * @see org.xtext.example.swrtj.AtomicBooleanExpression#isNegated()
   * @see #getAtomicBooleanExpression()
   * @generated
   */
  EAttribute getAtomicBooleanExpression_Negated();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.SimpleComparation <em>Simple Comparation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Comparation</em>'.
   * @see org.xtext.example.swrtj.SimpleComparation
   * @generated
   */
  EClass getSimpleComparation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.SimpleComparation#getLeftExpression <em>Left Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Expression</em>'.
   * @see org.xtext.example.swrtj.SimpleComparation#getLeftExpression()
   * @see #getSimpleComparation()
   * @generated
   */
  EReference getSimpleComparation_LeftExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.SimpleComparation#getCompare <em>Compare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compare</em>'.
   * @see org.xtext.example.swrtj.SimpleComparation#getCompare()
   * @see #getSimpleComparation()
   * @generated
   */
  EReference getSimpleComparation_Compare();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.SimpleComparation#getRightExpression <em>Right Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Expression</em>'.
   * @see org.xtext.example.swrtj.SimpleComparation#getRightExpression()
   * @see #getSimpleComparation()
   * @generated
   */
  EReference getSimpleComparation_RightExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.NestedBooleanExpression <em>Nested Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Boolean Expression</em>'.
   * @see org.xtext.example.swrtj.NestedBooleanExpression
   * @generated
   */
  EClass getNestedBooleanExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.NestedBooleanExpression#getNestedExpression <em>Nested Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nested Expression</em>'.
   * @see org.xtext.example.swrtj.NestedBooleanExpression#getNestedExpression()
   * @see #getNestedBooleanExpression()
   * @generated
   */
  EReference getNestedBooleanExpression_NestedExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.CompareOperator <em>Compare Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare Operator</em>'.
   * @see org.xtext.example.swrtj.CompareOperator
   * @generated
   */
  EClass getCompareOperator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.CompareOperator#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.xtext.example.swrtj.CompareOperator#getOperator()
   * @see #getCompareOperator()
   * @generated
   */
  EAttribute getCompareOperator_Operator();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.DottedExpression <em>Dotted Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dotted Expression</em>'.
   * @see org.xtext.example.swrtj.DottedExpression
   * @generated
   */
  EClass getDottedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.DottedExpression#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see org.xtext.example.swrtj.DottedExpression#getStart()
   * @see #getDottedExpression()
   * @generated
   */
  EReference getDottedExpression_Start();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.DottedExpression#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Receiver</em>'.
   * @see org.xtext.example.swrtj.DottedExpression#getReceiver()
   * @see #getDottedExpression()
   * @generated
   */
  EReference getDottedExpression_Receiver();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.DottedExpression#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Message</em>'.
   * @see org.xtext.example.swrtj.DottedExpression#getMessage()
   * @see #getDottedExpression()
   * @generated
   */
  EReference getDottedExpression_Message();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.DottedExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.swrtj.DottedExpression#getValue()
   * @see #getDottedExpression()
   * @generated
   */
  EReference getDottedExpression_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start</em>'.
   * @see org.xtext.example.swrtj.Start
   * @generated
   */
  EClass getStart();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null</em>'.
   * @see org.xtext.example.swrtj.Null
   * @generated
   */
  EClass getNull();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.Null#isNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see org.xtext.example.swrtj.Null#isNull()
   * @see #getNull()
   * @generated
   */
  EAttribute getNull_Null();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see org.xtext.example.swrtj.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.Input#isInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see org.xtext.example.swrtj.Input#isInput()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Input();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Args <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Args</em>'.
   * @see org.xtext.example.swrtj.Args
   * @generated
   */
  EClass getArgs();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.Args#isArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Args</em>'.
   * @see org.xtext.example.swrtj.Args#isArgs()
   * @see #getArgs()
   * @generated
   */
  EAttribute getArgs_Args();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see org.xtext.example.swrtj.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.Output#isOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output</em>'.
   * @see org.xtext.example.swrtj.Output#isOutput()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Output();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.BooleanConstant <em>Boolean Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Constant</em>'.
   * @see org.xtext.example.swrtj.BooleanConstant
   * @generated
   */
  EClass getBooleanConstant();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.BooleanConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.swrtj.BooleanConstant#getValue()
   * @see #getBooleanConstant()
   * @generated
   */
  EAttribute getBooleanConstant_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see org.xtext.example.swrtj.Number
   * @generated
   */
  EClass getNumber();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.Number#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.swrtj.Number#getValue()
   * @see #getNumber()
   * @generated
   */
  EAttribute getNumber_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.StringConstant <em>String Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Constant</em>'.
   * @see org.xtext.example.swrtj.StringConstant
   * @generated
   */
  EClass getStringConstant();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.StringConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.swrtj.StringConstant#getValue()
   * @see #getStringConstant()
   * @generated
   */
  EAttribute getStringConstant_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.This <em>This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This</em>'.
   * @see org.xtext.example.swrtj.This
   * @generated
   */
  EClass getThis();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.This#isThis <em>This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>This</em>'.
   * @see org.xtext.example.swrtj.This#isThis()
   * @see #getThis()
   * @generated
   */
  EAttribute getThis_This();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.ParameterReference <em>Parameter Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Reference</em>'.
   * @see org.xtext.example.swrtj.ParameterReference
   * @generated
   */
  EClass getParameterReference();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.ParameterReference#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see org.xtext.example.swrtj.ParameterReference#getParameter()
   * @see #getParameterReference()
   * @generated
   */
  EReference getParameterReference_Parameter();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.ConstructorInvocation <em>Constructor Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor Invocation</em>'.
   * @see org.xtext.example.swrtj.ConstructorInvocation
   * @generated
   */
  EClass getConstructorInvocation();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.ConstructorInvocation#getClassRef <em>Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class Ref</em>'.
   * @see org.xtext.example.swrtj.ConstructorInvocation#getClassRef()
   * @see #getConstructorInvocation()
   * @generated
   */
  EReference getConstructorInvocation_ClassRef();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.ConstructorInvocation#getArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Argument List</em>'.
   * @see org.xtext.example.swrtj.ConstructorInvocation#getArgumentList()
   * @see #getConstructorInvocation()
   * @generated
   */
  EReference getConstructorInvocation_ArgumentList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Cast <em>Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast</em>'.
   * @see org.xtext.example.swrtj.Cast
   * @generated
   */
  EClass getCast();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.Cast#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.swrtj.Cast#getType()
   * @see #getCast()
   * @generated
   */
  EReference getCast_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.Cast#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see org.xtext.example.swrtj.Cast#getStart()
   * @see #getCast()
   * @generated
   */
  EReference getCast_Start();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.NestedExpression <em>Nested Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Expression</em>'.
   * @see org.xtext.example.swrtj.NestedExpression
   * @generated
   */
  EClass getNestedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.NestedExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.swrtj.NestedExpression#getExpression()
   * @see #getNestedExpression()
   * @generated
   */
  EReference getNestedExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see org.xtext.example.swrtj.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.MethodInvocation <em>Method Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Invocation</em>'.
   * @see org.xtext.example.swrtj.MethodInvocation
   * @generated
   */
  EClass getMethodInvocation();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.MethodInvocation#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see org.xtext.example.swrtj.MethodInvocation#getMethod()
   * @see #getMethodInvocation()
   * @generated
   */
  EReference getMethodInvocation_Method();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.MethodInvocation#getArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Argument List</em>'.
   * @see org.xtext.example.swrtj.MethodInvocation#getArgumentList()
   * @see #getMethodInvocation()
   * @generated
   */
  EReference getMethodInvocation_ArgumentList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.FieldAccess <em>Field Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Access</em>'.
   * @see org.xtext.example.swrtj.FieldAccess
   * @generated
   */
  EClass getFieldAccess();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.FieldAccess#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Field</em>'.
   * @see org.xtext.example.swrtj.FieldAccess#getField()
   * @see #getFieldAccess()
   * @generated
   */
  EReference getFieldAccess_Field();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.ParameterAssignment <em>Parameter Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Assignment</em>'.
   * @see org.xtext.example.swrtj.ParameterAssignment
   * @generated
   */
  EClass getParameterAssignment();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.ParameterAssignment#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see org.xtext.example.swrtj.ParameterAssignment#getParameter()
   * @see #getParameterAssignment()
   * @generated
   */
  EReference getParameterAssignment_Parameter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.ParameterAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.swrtj.ParameterAssignment#getValue()
   * @see #getParameterAssignment()
   * @generated
   */
  EReference getParameterAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.RecordExclude <em>Record Exclude</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Exclude</em>'.
   * @see org.xtext.example.swrtj.RecordExclude
   * @generated
   */
  EClass getRecordExclude();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.RecordExclude#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Field</em>'.
   * @see org.xtext.example.swrtj.RecordExclude#getField()
   * @see #getRecordExclude()
   * @generated
   */
  EReference getRecordExclude_Field();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.RecordRename <em>Record Rename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Rename</em>'.
   * @see org.xtext.example.swrtj.RecordRename
   * @generated
   */
  EClass getRecordRename();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.RecordRename#getOriginalField <em>Original Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Original Field</em>'.
   * @see org.xtext.example.swrtj.RecordRename#getOriginalField()
   * @see #getRecordRename()
   * @generated
   */
  EReference getRecordRename_OriginalField();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.RecordRename#getNewField <em>New Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Field</em>'.
   * @see org.xtext.example.swrtj.RecordRename#getNewField()
   * @see #getRecordRename()
   * @generated
   */
  EReference getRecordRename_NewField();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.TraitExclude <em>Trait Exclude</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait Exclude</em>'.
   * @see org.xtext.example.swrtj.TraitExclude
   * @generated
   */
  EClass getTraitExclude();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.TraitExclude#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see org.xtext.example.swrtj.TraitExclude#getMethod()
   * @see #getTraitExclude()
   * @generated
   */
  EReference getTraitExclude_Method();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.TraitAlias <em>Trait Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait Alias</em>'.
   * @see org.xtext.example.swrtj.TraitAlias
   * @generated
   */
  EClass getTraitAlias();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.TraitAlias#getOriginalMethod <em>Original Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Original Method</em>'.
   * @see org.xtext.example.swrtj.TraitAlias#getOriginalMethod()
   * @see #getTraitAlias()
   * @generated
   */
  EReference getTraitAlias_OriginalMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.TraitAlias#getNewMethod <em>New Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Method</em>'.
   * @see org.xtext.example.swrtj.TraitAlias#getNewMethod()
   * @see #getTraitAlias()
   * @generated
   */
  EReference getTraitAlias_NewMethod();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.TraitMethodRename <em>Trait Method Rename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait Method Rename</em>'.
   * @see org.xtext.example.swrtj.TraitMethodRename
   * @generated
   */
  EClass getTraitMethodRename();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.TraitMethodRename#getOriginalMethod <em>Original Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Original Method</em>'.
   * @see org.xtext.example.swrtj.TraitMethodRename#getOriginalMethod()
   * @see #getTraitMethodRename()
   * @generated
   */
  EReference getTraitMethodRename_OriginalMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.TraitMethodRename#getNewMethod <em>New Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Method</em>'.
   * @see org.xtext.example.swrtj.TraitMethodRename#getNewMethod()
   * @see #getTraitMethodRename()
   * @generated
   */
  EReference getTraitMethodRename_NewMethod();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.TraitFieldRename <em>Trait Field Rename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait Field Rename</em>'.
   * @see org.xtext.example.swrtj.TraitFieldRename
   * @generated
   */
  EClass getTraitFieldRename();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.swrtj.TraitFieldRename#getOriginalField <em>Original Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Original Field</em>'.
   * @see org.xtext.example.swrtj.TraitFieldRename#getOriginalField()
   * @see #getTraitFieldRename()
   * @generated
   */
  EReference getTraitFieldRename_OriginalField();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.TraitFieldRename#getNewField <em>New Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Field</em>'.
   * @see org.xtext.example.swrtj.TraitFieldRename#getNewField()
   * @see #getTraitFieldRename()
   * @generated
   */
  EReference getTraitFieldRename_NewField();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.FieldDeclaration <em>Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Declaration</em>'.
   * @see org.xtext.example.swrtj.FieldDeclaration
   * @generated
   */
  EClass getFieldDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.FieldDeclaration#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see org.xtext.example.swrtj.FieldDeclaration#getModifier()
   * @see #getFieldDeclaration()
   * @generated
   */
  EAttribute getFieldDeclaration_Modifier();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.RequiredField <em>Required Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Field</em>'.
   * @see org.xtext.example.swrtj.RequiredField
   * @generated
   */
  EClass getRequiredField();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.RequiredMethod <em>Required Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Method</em>'.
   * @see org.xtext.example.swrtj.RequiredMethod
   * @generated
   */
  EClass getRequiredMethod();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.ProvidedMethod <em>Provided Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provided Method</em>'.
   * @see org.xtext.example.swrtj.ProvidedMethod
   * @generated
   */
  EClass getProvidedMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.ProvidedMethod#isIsSynchronized <em>Is Synchronized</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Synchronized</em>'.
   * @see org.xtext.example.swrtj.ProvidedMethod#isIsSynchronized()
   * @see #getProvidedMethod()
   * @generated
   */
  EAttribute getProvidedMethod_IsSynchronized();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.ProvidedMethod#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.example.swrtj.ProvidedMethod#getBlock()
   * @see #getProvidedMethod()
   * @generated
   */
  EReference getProvidedMethod_Block();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.ProvidedMethod#getReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Statement</em>'.
   * @see org.xtext.example.swrtj.ProvidedMethod#getReturnStatement()
   * @see #getProvidedMethod()
   * @generated
   */
  EReference getProvidedMethod_ReturnStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.FormalParameter <em>Formal Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Parameter</em>'.
   * @see org.xtext.example.swrtj.FormalParameter
   * @generated
   */
  EClass getFormalParameter();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Expression</em>'.
   * @see org.xtext.example.swrtj.BooleanExpression
   * @generated
   */
  EClass getBooleanExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.BooleanExpression#getAtomicList <em>Atomic List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atomic List</em>'.
   * @see org.xtext.example.swrtj.BooleanExpression#getAtomicList()
   * @see #getBooleanExpression()
   * @generated
   */
  EReference getBooleanExpression_AtomicList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.BooleanExpression#getBooleanOperatorList <em>Boolean Operator List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Operator List</em>'.
   * @see org.xtext.example.swrtj.BooleanExpression#getBooleanOperatorList()
   * @see #getBooleanExpression()
   * @generated
   */
  EReference getBooleanExpression_BooleanOperatorList();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.LocalParameter <em>Local Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Parameter</em>'.
   * @see org.xtext.example.swrtj.LocalParameter
   * @generated
   */
  EClass getLocalParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.swrtj.LocalParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.swrtj.LocalParameter#getValue()
   * @see #getLocalParameter()
   * @generated
   */
  EReference getLocalParameter_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.swrtj.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.example.swrtj.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.swrtj.Expression#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see org.xtext.example.swrtj.Expression#getSign()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Sign();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.swrtj.Expression#getTermList <em>Term List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Term List</em>'.
   * @see org.xtext.example.swrtj.Expression#getTermList()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_TermList();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.swrtj.Expression#getOperatorList <em>Operator List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operator List</em>'.
   * @see org.xtext.example.swrtj.Expression#getOperatorList()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_OperatorList();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SwrtjFactory getSwrtjFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.FileImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>Import List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__IMPORT_LIST = eINSTANCE.getFile_ImportList();

    /**
     * The meta object literal for the '<em><b>Element List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__ELEMENT_LIST = eINSTANCE.getFile_ElementList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ImportImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ElementImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Construct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__CONSTRUCT = eINSTANCE.getElement_Construct();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.InterfaceImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Extends List</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__EXTENDS_LIST = eINSTANCE.getInterface_ExtendsList();

    /**
     * The meta object literal for the '<em><b>Required Method List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__REQUIRED_METHOD_LIST = eINSTANCE.getInterface_RequiredMethodList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.RecordImpl <em>Record</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.RecordImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRecord()
     * @generated
     */
    EClass RECORD = eINSTANCE.getRecord();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD__EXPRESSION = eINSTANCE.getRecord_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.TraitImpl <em>Trait</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.TraitImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTrait()
     * @generated
     */
    EClass TRAIT = eINSTANCE.getTrait();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT__EXPRESSION = eINSTANCE.getTrait_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ClassImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Implements List</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__IMPLEMENTS_LIST = eINSTANCE.getClass_ImplementsList();

    /**
     * The meta object literal for the '<em><b>Record Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__RECORD_EXPRESSION = eINSTANCE.getClass_RecordExpression();

    /**
     * The meta object literal for the '<em><b>Trait Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__TRAIT_EXPRESSION = eINSTANCE.getClass_TraitExpression();

    /**
     * The meta object literal for the '<em><b>Constructor List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__CONSTRUCTOR_LIST = eINSTANCE.getClass_ConstructorList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ProgramImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__BLOCK = eINSTANCE.getProgram_Block();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.RecordExpressionImpl <em>Record Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.RecordExpressionImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRecordExpression()
     * @generated
     */
    EClass RECORD_EXPRESSION = eINSTANCE.getRecordExpression();

    /**
     * The meta object literal for the '<em><b>Record List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_EXPRESSION__RECORD_LIST = eINSTANCE.getRecordExpression_RecordList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.BaseRecordImpl <em>Base Record</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.BaseRecordImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getBaseRecord()
     * @generated
     */
    EClass BASE_RECORD = eINSTANCE.getBaseRecord();

    /**
     * The meta object literal for the '<em><b>Operation List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASE_RECORD__OPERATION_LIST = eINSTANCE.getBaseRecord_OperationList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.AnonimousRecordImpl <em>Anonimous Record</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.AnonimousRecordImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getAnonimousRecord()
     * @generated
     */
    EClass ANONIMOUS_RECORD = eINSTANCE.getAnonimousRecord();

    /**
     * The meta object literal for the '<em><b>Declaration List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANONIMOUS_RECORD__DECLARATION_LIST = eINSTANCE.getAnonimousRecord_DeclarationList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.RecordNameImpl <em>Record Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.RecordNameImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRecordName()
     * @generated
     */
    EClass RECORD_NAME = eINSTANCE.getRecordName();

    /**
     * The meta object literal for the '<em><b>Record</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_NAME__RECORD = eINSTANCE.getRecordName_Record();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.NestedRecordExpressionImpl <em>Nested Record Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.NestedRecordExpressionImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getNestedRecordExpression()
     * @generated
     */
    EClass NESTED_RECORD_EXPRESSION = eINSTANCE.getNestedRecordExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_RECORD_EXPRESSION__EXPRESSION = eINSTANCE.getNestedRecordExpression_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.RecordOperationImpl <em>Record Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.RecordOperationImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRecordOperation()
     * @generated
     */
    EClass RECORD_OPERATION = eINSTANCE.getRecordOperation();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.TraitExpressionImpl <em>Trait Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.TraitExpressionImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitExpression()
     * @generated
     */
    EClass TRAIT_EXPRESSION = eINSTANCE.getTraitExpression();

    /**
     * The meta object literal for the '<em><b>Trait List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_EXPRESSION__TRAIT_LIST = eINSTANCE.getTraitExpression_TraitList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.BaseTraitImpl <em>Base Trait</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.BaseTraitImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getBaseTrait()
     * @generated
     */
    EClass BASE_TRAIT = eINSTANCE.getBaseTrait();

    /**
     * The meta object literal for the '<em><b>Operation List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASE_TRAIT__OPERATION_LIST = eINSTANCE.getBaseTrait_OperationList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.AnonimousTraitImpl <em>Anonimous Trait</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.AnonimousTraitImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getAnonimousTrait()
     * @generated
     */
    EClass ANONIMOUS_TRAIT = eINSTANCE.getAnonimousTrait();

    /**
     * The meta object literal for the '<em><b>Definition List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANONIMOUS_TRAIT__DEFINITION_LIST = eINSTANCE.getAnonimousTrait_DefinitionList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.TraitNameImpl <em>Trait Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.TraitNameImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitName()
     * @generated
     */
    EClass TRAIT_NAME = eINSTANCE.getTraitName();

    /**
     * The meta object literal for the '<em><b>Trait</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_NAME__TRAIT = eINSTANCE.getTraitName_Trait();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.NestedTraitExpressionImpl <em>Nested Trait Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.NestedTraitExpressionImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getNestedTraitExpression()
     * @generated
     */
    EClass NESTED_TRAIT_EXPRESSION = eINSTANCE.getNestedTraitExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_TRAIT_EXPRESSION__EXPRESSION = eINSTANCE.getNestedTraitExpression_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.TraitOperationImpl <em>Trait Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.TraitOperationImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitOperation()
     * @generated
     */
    EClass TRAIT_OPERATION = eINSTANCE.getTraitOperation();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.TraitElementImpl <em>Trait Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.TraitElementImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitElement()
     * @generated
     */
    EClass TRAIT_ELEMENT = eINSTANCE.getTraitElement();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.FieldImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Field Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__FIELD_REF = eINSTANCE.getField_FieldRef();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.MethodImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

    /**
     * The meta object literal for the '<em><b>Method Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__METHOD_REF = eINSTANCE.getMethod_MethodRef();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMETER_LIST = eINSTANCE.getMethod_ParameterList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ConstructorImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR__NAME = eINSTANCE.getConstructor_Name();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__PARAMETER_LIST = eINSTANCE.getConstructor_ParameterList();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__BLOCK = eINSTANCE.getConstructor_Block();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ReturnStatementImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getReturnStatement()
     * @generated
     */
    EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_STATEMENT__EXPRESSION = eINSTANCE.getReturnStatement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ParameterImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.FieldNameImpl <em>Field Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.FieldNameImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getFieldName()
     * @generated
     */
    EClass FIELD_NAME = eINSTANCE.getFieldName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__NAME = eINSTANCE.getFieldName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.MethodNameImpl <em>Method Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.MethodNameImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getMethodName()
     * @generated
     */
    EClass METHOD_NAME = eINSTANCE.getMethodName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_NAME__NAME = eINSTANCE.getMethodName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.TypeImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Interface Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__INTERFACE_TYPE = eINSTANCE.getType_InterfaceType();

    /**
     * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__PRIMITIVE_TYPE = eINSTANCE.getType_PrimitiveType();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.BlockImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__PARAMETER_LIST = eINSTANCE.getBlock_ParameterList();

    /**
     * The meta object literal for the '<em><b>Statement List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STATEMENT_LIST = eINSTANCE.getBlock_StatementList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.StatementImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ExpressionStatementImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getExpressionStatement()
     * @generated
     */
    EClass EXPRESSION_STATEMENT = eINSTANCE.getExpressionStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_STATEMENT__EXPRESSION = eINSTANCE.getExpressionStatement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.IfThenElseStatementImpl <em>If Then Else Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.IfThenElseStatementImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getIfThenElseStatement()
     * @generated
     */
    EClass IF_THEN_ELSE_STATEMENT = eINSTANCE.getIfThenElseStatement();

    /**
     * The meta object literal for the '<em><b>Condiction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE_STATEMENT__CONDICTION = eINSTANCE.getIfThenElseStatement_Condiction();

    /**
     * The meta object literal for the '<em><b>True Branch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE_STATEMENT__TRUE_BRANCH = eINSTANCE.getIfThenElseStatement_TrueBranch();

    /**
     * The meta object literal for the '<em><b>False Branch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE_STATEMENT__FALSE_BRANCH = eINSTANCE.getIfThenElseStatement_FalseBranch();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.WhileStatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.WhileStatementImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getWhileStatement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

    /**
     * The meta object literal for the '<em><b>Condiction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__CONDICTION = eINSTANCE.getWhileStatement_Condiction();

    /**
     * The meta object literal for the '<em><b>While Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__WHILE_BLOCK = eINSTANCE.getWhileStatement_WhileBlock();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.GenericExpressionImpl <em>Generic Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.GenericExpressionImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getGenericExpression()
     * @generated
     */
    EClass GENERIC_EXPRESSION = eINSTANCE.getGenericExpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.BooleanOperatorImpl <em>Boolean Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.BooleanOperatorImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getBooleanOperator()
     * @generated
     */
    EClass BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_OPERATOR__OPERATOR = eINSTANCE.getBooleanOperator_Operator();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.AtomicBooleanExpressionImpl <em>Atomic Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.AtomicBooleanExpressionImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getAtomicBooleanExpression()
     * @generated
     */
    EClass ATOMIC_BOOLEAN_EXPRESSION = eINSTANCE.getAtomicBooleanExpression();

    /**
     * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_BOOLEAN_EXPRESSION__NEGATED = eINSTANCE.getAtomicBooleanExpression_Negated();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.SimpleComparationImpl <em>Simple Comparation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.SimpleComparationImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getSimpleComparation()
     * @generated
     */
    EClass SIMPLE_COMPARATION = eINSTANCE.getSimpleComparation();

    /**
     * The meta object literal for the '<em><b>Left Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_COMPARATION__LEFT_EXPRESSION = eINSTANCE.getSimpleComparation_LeftExpression();

    /**
     * The meta object literal for the '<em><b>Compare</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_COMPARATION__COMPARE = eINSTANCE.getSimpleComparation_Compare();

    /**
     * The meta object literal for the '<em><b>Right Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_COMPARATION__RIGHT_EXPRESSION = eINSTANCE.getSimpleComparation_RightExpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.NestedBooleanExpressionImpl <em>Nested Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.NestedBooleanExpressionImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getNestedBooleanExpression()
     * @generated
     */
    EClass NESTED_BOOLEAN_EXPRESSION = eINSTANCE.getNestedBooleanExpression();

    /**
     * The meta object literal for the '<em><b>Nested Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_BOOLEAN_EXPRESSION__NESTED_EXPRESSION = eINSTANCE.getNestedBooleanExpression_NestedExpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.CompareOperatorImpl <em>Compare Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.CompareOperatorImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getCompareOperator()
     * @generated
     */
    EClass COMPARE_OPERATOR = eINSTANCE.getCompareOperator();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARE_OPERATOR__OPERATOR = eINSTANCE.getCompareOperator_Operator();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.DottedExpressionImpl <em>Dotted Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.DottedExpressionImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getDottedExpression()
     * @generated
     */
    EClass DOTTED_EXPRESSION = eINSTANCE.getDottedExpression();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOTTED_EXPRESSION__START = eINSTANCE.getDottedExpression_Start();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOTTED_EXPRESSION__RECEIVER = eINSTANCE.getDottedExpression_Receiver();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOTTED_EXPRESSION__MESSAGE = eINSTANCE.getDottedExpression_Message();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOTTED_EXPRESSION__VALUE = eINSTANCE.getDottedExpression_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.StartImpl <em>Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.StartImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getStart()
     * @generated
     */
    EClass START = eINSTANCE.getStart();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.NullImpl <em>Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.NullImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getNull()
     * @generated
     */
    EClass NULL = eINSTANCE.getNull();

    /**
     * The meta object literal for the '<em><b>Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NULL__NULL = eINSTANCE.getNull_Null();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.InputImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__INPUT = eINSTANCE.getInput_Input();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ArgsImpl <em>Args</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ArgsImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getArgs()
     * @generated
     */
    EClass ARGS = eINSTANCE.getArgs();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGS__ARGS = eINSTANCE.getArgs_Args();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.OutputImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__OUTPUT = eINSTANCE.getOutput_Output();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.BooleanConstantImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getBooleanConstant()
     * @generated
     */
    EClass BOOLEAN_CONSTANT = eINSTANCE.getBooleanConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_CONSTANT__VALUE = eINSTANCE.getBooleanConstant_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.NumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.NumberImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getNumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getNumber();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.StringConstantImpl <em>String Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.StringConstantImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getStringConstant()
     * @generated
     */
    EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ThisImpl <em>This</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ThisImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getThis()
     * @generated
     */
    EClass THIS = eINSTANCE.getThis();

    /**
     * The meta object literal for the '<em><b>This</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THIS__THIS = eINSTANCE.getThis_This();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ParameterReferenceImpl <em>Parameter Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ParameterReferenceImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getParameterReference()
     * @generated
     */
    EClass PARAMETER_REFERENCE = eINSTANCE.getParameterReference();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_REFERENCE__PARAMETER = eINSTANCE.getParameterReference_Parameter();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ConstructorInvocationImpl <em>Constructor Invocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ConstructorInvocationImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getConstructorInvocation()
     * @generated
     */
    EClass CONSTRUCTOR_INVOCATION = eINSTANCE.getConstructorInvocation();

    /**
     * The meta object literal for the '<em><b>Class Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_INVOCATION__CLASS_REF = eINSTANCE.getConstructorInvocation_ClassRef();

    /**
     * The meta object literal for the '<em><b>Argument List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_INVOCATION__ARGUMENT_LIST = eINSTANCE.getConstructorInvocation_ArgumentList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.CastImpl <em>Cast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.CastImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getCast()
     * @generated
     */
    EClass CAST = eINSTANCE.getCast();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST__TYPE = eINSTANCE.getCast_Type();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST__START = eINSTANCE.getCast_Start();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.NestedExpressionImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getNestedExpression()
     * @generated
     */
    EClass NESTED_EXPRESSION = eINSTANCE.getNestedExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_EXPRESSION__EXPRESSION = eINSTANCE.getNestedExpression_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.MessageImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.MethodInvocationImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getMethodInvocation()
     * @generated
     */
    EClass METHOD_INVOCATION = eINSTANCE.getMethodInvocation();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_INVOCATION__METHOD = eINSTANCE.getMethodInvocation_Method();

    /**
     * The meta object literal for the '<em><b>Argument List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_INVOCATION__ARGUMENT_LIST = eINSTANCE.getMethodInvocation_ArgumentList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.FieldAccessImpl <em>Field Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.FieldAccessImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getFieldAccess()
     * @generated
     */
    EClass FIELD_ACCESS = eINSTANCE.getFieldAccess();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_ACCESS__FIELD = eINSTANCE.getFieldAccess_Field();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ParameterAssignmentImpl <em>Parameter Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ParameterAssignmentImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getParameterAssignment()
     * @generated
     */
    EClass PARAMETER_ASSIGNMENT = eINSTANCE.getParameterAssignment();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_ASSIGNMENT__PARAMETER = eINSTANCE.getParameterAssignment_Parameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_ASSIGNMENT__VALUE = eINSTANCE.getParameterAssignment_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.RecordExcludeImpl <em>Record Exclude</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.RecordExcludeImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRecordExclude()
     * @generated
     */
    EClass RECORD_EXCLUDE = eINSTANCE.getRecordExclude();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_EXCLUDE__FIELD = eINSTANCE.getRecordExclude_Field();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.RecordRenameImpl <em>Record Rename</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.RecordRenameImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRecordRename()
     * @generated
     */
    EClass RECORD_RENAME = eINSTANCE.getRecordRename();

    /**
     * The meta object literal for the '<em><b>Original Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_RENAME__ORIGINAL_FIELD = eINSTANCE.getRecordRename_OriginalField();

    /**
     * The meta object literal for the '<em><b>New Field</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_RENAME__NEW_FIELD = eINSTANCE.getRecordRename_NewField();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.TraitExcludeImpl <em>Trait Exclude</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.TraitExcludeImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitExclude()
     * @generated
     */
    EClass TRAIT_EXCLUDE = eINSTANCE.getTraitExclude();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_EXCLUDE__METHOD = eINSTANCE.getTraitExclude_Method();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.TraitAliasImpl <em>Trait Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.TraitAliasImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitAlias()
     * @generated
     */
    EClass TRAIT_ALIAS = eINSTANCE.getTraitAlias();

    /**
     * The meta object literal for the '<em><b>Original Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_ALIAS__ORIGINAL_METHOD = eINSTANCE.getTraitAlias_OriginalMethod();

    /**
     * The meta object literal for the '<em><b>New Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_ALIAS__NEW_METHOD = eINSTANCE.getTraitAlias_NewMethod();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.TraitMethodRenameImpl <em>Trait Method Rename</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.TraitMethodRenameImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitMethodRename()
     * @generated
     */
    EClass TRAIT_METHOD_RENAME = eINSTANCE.getTraitMethodRename();

    /**
     * The meta object literal for the '<em><b>Original Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_METHOD_RENAME__ORIGINAL_METHOD = eINSTANCE.getTraitMethodRename_OriginalMethod();

    /**
     * The meta object literal for the '<em><b>New Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_METHOD_RENAME__NEW_METHOD = eINSTANCE.getTraitMethodRename_NewMethod();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.TraitFieldRenameImpl <em>Trait Field Rename</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.TraitFieldRenameImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getTraitFieldRename()
     * @generated
     */
    EClass TRAIT_FIELD_RENAME = eINSTANCE.getTraitFieldRename();

    /**
     * The meta object literal for the '<em><b>Original Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_FIELD_RENAME__ORIGINAL_FIELD = eINSTANCE.getTraitFieldRename_OriginalField();

    /**
     * The meta object literal for the '<em><b>New Field</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_FIELD_RENAME__NEW_FIELD = eINSTANCE.getTraitFieldRename_NewField();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.FieldDeclarationImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getFieldDeclaration()
     * @generated
     */
    EClass FIELD_DECLARATION = eINSTANCE.getFieldDeclaration();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_DECLARATION__MODIFIER = eINSTANCE.getFieldDeclaration_Modifier();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.RequiredFieldImpl <em>Required Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.RequiredFieldImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRequiredField()
     * @generated
     */
    EClass REQUIRED_FIELD = eINSTANCE.getRequiredField();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.RequiredMethodImpl <em>Required Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.RequiredMethodImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getRequiredMethod()
     * @generated
     */
    EClass REQUIRED_METHOD = eINSTANCE.getRequiredMethod();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ProvidedMethodImpl <em>Provided Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ProvidedMethodImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getProvidedMethod()
     * @generated
     */
    EClass PROVIDED_METHOD = eINSTANCE.getProvidedMethod();

    /**
     * The meta object literal for the '<em><b>Is Synchronized</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVIDED_METHOD__IS_SYNCHRONIZED = eINSTANCE.getProvidedMethod_IsSynchronized();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_METHOD__BLOCK = eINSTANCE.getProvidedMethod_Block();

    /**
     * The meta object literal for the '<em><b>Return Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROVIDED_METHOD__RETURN_STATEMENT = eINSTANCE.getProvidedMethod_ReturnStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.FormalParameterImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getFormalParameter()
     * @generated
     */
    EClass FORMAL_PARAMETER = eINSTANCE.getFormalParameter();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.BooleanExpressionImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getBooleanExpression()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

    /**
     * The meta object literal for the '<em><b>Atomic List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION__ATOMIC_LIST = eINSTANCE.getBooleanExpression_AtomicList();

    /**
     * The meta object literal for the '<em><b>Boolean Operator List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION__BOOLEAN_OPERATOR_LIST = eINSTANCE.getBooleanExpression_BooleanOperatorList();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.LocalParameterImpl <em>Local Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.LocalParameterImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getLocalParameter()
     * @generated
     */
    EClass LOCAL_PARAMETER = eINSTANCE.getLocalParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_PARAMETER__VALUE = eINSTANCE.getLocalParameter_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.swrtj.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.swrtj.impl.ExpressionImpl
     * @see org.xtext.example.swrtj.impl.SwrtjPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__SIGN = eINSTANCE.getExpression_Sign();

    /**
     * The meta object literal for the '<em><b>Term List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__TERM_LIST = eINSTANCE.getExpression_TermList();

    /**
     * The meta object literal for the '<em><b>Operator List</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OPERATOR_LIST = eINSTANCE.getExpression_OperatorList();

  }

} //SwrtjPackage
