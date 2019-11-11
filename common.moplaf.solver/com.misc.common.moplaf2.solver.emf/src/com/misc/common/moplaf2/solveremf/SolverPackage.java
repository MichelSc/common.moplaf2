/**
 */
package com.misc.common.moplaf2.solveremf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf2.solveremf.SolverFactory
 * @model kind="package"
 * @generated
 */
public interface SolverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "solveremf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/common/moplaf2/solver/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "slv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolverPackage eINSTANCE = com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf2.solveremf.impl.FormulationElementImpl <em>Formulation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf2.solveremf.impl.FormulationElementImpl
	 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getFormulationElement()
	 * @generated
	 */
	int FORMULATION_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_ELEMENT__FORMULATION = 1;

	/**
	 * The number of structural features of the '<em>Formulation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Formulation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf2.solveremf.impl.TupleImpl <em>Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf2.solveremf.impl.TupleImpl
	 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getTuple()
	 * @generated
	 */
	int TUPLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__NAME = FORMULATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__FORMULATION = FORMULATION_ELEMENT__FORMULATION;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__VARIABLES = FORMULATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__CONSTRAINTS = FORMULATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Tuples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__SUB_TUPLES = FORMULATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Tuple</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE__SUPER_TUPLE = FORMULATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_FEATURE_COUNT = FORMULATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_OPERATION_COUNT = FORMULATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf2.solveremf.impl.TupleElementImpl <em>Tuple Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf2.solveremf.impl.TupleElementImpl
	 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getTupleElement()
	 * @generated
	 */
	int TUPLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT__NAME = FORMULATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT__FORMULATION = FORMULATION_ELEMENT__FORMULATION;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT__TUPLE = FORMULATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT_FEATURE_COUNT = FORMULATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tuple Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ELEMENT_OPERATION_COUNT = FORMULATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf2.solveremf.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf2.solveremf.impl.VariableImpl
	 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = TUPLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FORMULATION = TUPLE_ELEMENT__FORMULATION;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TUPLE = TUPLE_ELEMENT__TUPLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = TUPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LOWER_BOUND = TUPLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__UPPER_BOUND = TUPLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TERMS = TUPLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = TUPLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = TUPLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf2.solveremf.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf2.solveremf.impl.ConstraintImpl
	 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = TUPLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__FORMULATION = TUPLE_ELEMENT__FORMULATION;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TUPLE = TUPLE_ELEMENT__TUPLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TYPE = TUPLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TERMS = TUPLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = TUPLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = TUPLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf2.solveremf.impl.FormulationImpl <em>Formulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf2.solveremf.impl.FormulationImpl
	 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getFormulation()
	 * @generated
	 */
	int FORMULATION = 5;

	/**
	 * The feature id for the '<em><b>Root Tuples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION__ROOT_TUPLES = 0;

	/**
	 * The number of structural features of the '<em>Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Construct</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION___CONSTRUCT__IFORMULATION = 0;

	/**
	 * The number of operations of the '<em>Formulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf2.solveremf.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf2.solveremf.impl.TermImpl
	 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 6;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CONSTRAINT = 1;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf2.solveremf.impl.LinearConstraintImpl <em>Linear Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf2.solveremf.impl.LinearConstraintImpl
	 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getLinearConstraint()
	 * @generated
	 */
	int LINEAR_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONSTRAINT__FORMULATION = CONSTRAINT__FORMULATION;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONSTRAINT__TUPLE = CONSTRAINT__TUPLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONSTRAINT__TYPE = CONSTRAINT__TYPE;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONSTRAINT__TERMS = CONSTRAINT__TERMS;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONSTRAINT__RIGHT_HAND_SIDE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linear Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Linear Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf2.solveremf.impl.LinearConstraintTermImpl <em>Linear Constraint Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf2.solveremf.impl.LinearConstraintTermImpl
	 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getLinearConstraintTerm()
	 * @generated
	 */
	int LINEAR_CONSTRAINT_TERM = 8;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONSTRAINT_TERM__VARIABLE = TERM__VARIABLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONSTRAINT_TERM__CONSTRAINT = TERM__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONSTRAINT_TERM__COEFFICIENT = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linear Constraint Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONSTRAINT_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Linear Constraint Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_CONSTRAINT_TERM_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf2.solveremf.VariableType <em>Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf2.solveremf.VariableType
	 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 9;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf2.solveremf.ConstraintType <em>Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf2.solveremf.ConstraintType
	 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getConstraintType()
	 * @generated
	 */
	int CONSTRAINT_TYPE = 10;


	/**
	 * The meta object id for the '<em>IFormulation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf2.solver.IFormulation
	 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getIFormulation()
	 * @generated
	 */
	int IFORMULATION = 11;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf2.solveremf.Tuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Tuple
	 * @generated
	 */
	EClass getTuple();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf2.solveremf.Tuple#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Tuple#getVariables()
	 * @see #getTuple()
	 * @generated
	 */
	EReference getTuple_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf2.solveremf.Tuple#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Tuple#getConstraints()
	 * @see #getTuple()
	 * @generated
	 */
	EReference getTuple_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf2.solveremf.Tuple#getSubTuples <em>Sub Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Tuples</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Tuple#getSubTuples()
	 * @see #getTuple()
	 * @generated
	 */
	EReference getTuple_SubTuples();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf2.solveremf.Tuple#getSuperTuple <em>Super Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Tuple</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Tuple#getSuperTuple()
	 * @see #getTuple()
	 * @generated
	 */
	EReference getTuple_SuperTuple();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf2.solveremf.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf2.solveremf.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf2.solveremf.Variable#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Variable#getLowerBound()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf2.solveremf.Variable#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Variable#getUpperBound()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_UpperBound();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.common.moplaf2.solveremf.Variable#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terms</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Variable#getTerms()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Terms();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf2.solveremf.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf2.solveremf.Constraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Constraint#getType()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf2.solveremf.Constraint#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Constraint#getTerms()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Terms();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf2.solveremf.TupleElement <em>Tuple Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Element</em>'.
	 * @see com.misc.common.moplaf2.solveremf.TupleElement
	 * @generated
	 */
	EClass getTupleElement();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf2.solveremf.TupleElement#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tuple</em>'.
	 * @see com.misc.common.moplaf2.solveremf.TupleElement#getTuple()
	 * @see #getTupleElement()
	 * @generated
	 */
	EReference getTupleElement_Tuple();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf2.solveremf.FormulationElement <em>Formulation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formulation Element</em>'.
	 * @see com.misc.common.moplaf2.solveremf.FormulationElement
	 * @generated
	 */
	EClass getFormulationElement();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf2.solveremf.FormulationElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.common.moplaf2.solveremf.FormulationElement#getName()
	 * @see #getFormulationElement()
	 * @generated
	 */
	EAttribute getFormulationElement_Name();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf2.solveremf.FormulationElement#getFormulation <em>Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formulation</em>'.
	 * @see com.misc.common.moplaf2.solveremf.FormulationElement#getFormulation()
	 * @see #getFormulationElement()
	 * @generated
	 */
	EReference getFormulationElement_Formulation();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf2.solveremf.Formulation <em>Formulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formulation</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Formulation
	 * @generated
	 */
	EClass getFormulation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.common.moplaf2.solveremf.Formulation#getRootTuples <em>Root Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Tuples</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Formulation#getRootTuples()
	 * @see #getFormulation()
	 * @generated
	 */
	EReference getFormulation_RootTuples();

	/**
	 * Returns the meta object for the '{@link com.misc.common.moplaf2.solveremf.Formulation#construct(com.misc.common.moplaf2.solver.IFormulation) <em>Construct</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construct</em>' operation.
	 * @see com.misc.common.moplaf2.solveremf.Formulation#construct(com.misc.common.moplaf2.solver.IFormulation)
	 * @generated
	 */
	EOperation getFormulation__Construct__IFormulation();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf2.solveremf.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the reference '{@link com.misc.common.moplaf2.solveremf.Term#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Term#getVariable()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Variable();

	/**
	 * Returns the meta object for the container reference '{@link com.misc.common.moplaf2.solveremf.Term#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Constraint</em>'.
	 * @see com.misc.common.moplaf2.solveremf.Term#getConstraint()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Constraint();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf2.solveremf.LinearConstraint <em>Linear Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Constraint</em>'.
	 * @see com.misc.common.moplaf2.solveremf.LinearConstraint
	 * @generated
	 */
	EClass getLinearConstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf2.solveremf.LinearConstraint#getRightHandSide <em>Right Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Hand Side</em>'.
	 * @see com.misc.common.moplaf2.solveremf.LinearConstraint#getRightHandSide()
	 * @see #getLinearConstraint()
	 * @generated
	 */
	EAttribute getLinearConstraint_RightHandSide();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf2.solveremf.LinearConstraintTerm <em>Linear Constraint Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Constraint Term</em>'.
	 * @see com.misc.common.moplaf2.solveremf.LinearConstraintTerm
	 * @generated
	 */
	EClass getLinearConstraintTerm();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf2.solveremf.LinearConstraintTerm#getCoefficient <em>Coefficient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coefficient</em>'.
	 * @see com.misc.common.moplaf2.solveremf.LinearConstraintTerm#getCoefficient()
	 * @see #getLinearConstraintTerm()
	 * @generated
	 */
	EAttribute getLinearConstraintTerm_Coefficient();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf2.solveremf.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Type</em>'.
	 * @see com.misc.common.moplaf2.solveremf.VariableType
	 * @generated
	 */
	EEnum getVariableType();

	/**
	 * Returns the meta object for enum '{@link com.misc.common.moplaf2.solveremf.ConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Type</em>'.
	 * @see com.misc.common.moplaf2.solveremf.ConstraintType
	 * @generated
	 */
	EEnum getConstraintType();

	/**
	 * Returns the meta object for data type '{@link com.misc.common.moplaf2.solver.IFormulation <em>IFormulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IFormulation</em>'.
	 * @see com.misc.common.moplaf2.solver.IFormulation
	 * @model instanceClass="com.misc.common.moplaf2.solver.IFormulation" serializeable="false"
	 * @generated
	 */
	EDataType getIFormulation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SolverFactory getSolverFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf2.solveremf.impl.TupleImpl <em>Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf2.solveremf.impl.TupleImpl
		 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getTuple()
		 * @generated
		 */
		EClass TUPLE = eINSTANCE.getTuple();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE__VARIABLES = eINSTANCE.getTuple_Variables();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE__CONSTRAINTS = eINSTANCE.getTuple_Constraints();

		/**
		 * The meta object literal for the '<em><b>Sub Tuples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE__SUB_TUPLES = eINSTANCE.getTuple_SubTuples();

		/**
		 * The meta object literal for the '<em><b>Super Tuple</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE__SUPER_TUPLE = eINSTANCE.getTuple_SuperTuple();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf2.solveremf.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf2.solveremf.impl.VariableImpl
		 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__LOWER_BOUND = eINSTANCE.getVariable_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__UPPER_BOUND = eINSTANCE.getVariable_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TERMS = eINSTANCE.getVariable_Terms();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf2.solveremf.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf2.solveremf.impl.ConstraintImpl
		 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__TYPE = eINSTANCE.getConstraint_Type();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__TERMS = eINSTANCE.getConstraint_Terms();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf2.solveremf.impl.TupleElementImpl <em>Tuple Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf2.solveremf.impl.TupleElementImpl
		 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getTupleElement()
		 * @generated
		 */
		EClass TUPLE_ELEMENT = eINSTANCE.getTupleElement();

		/**
		 * The meta object literal for the '<em><b>Tuple</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_ELEMENT__TUPLE = eINSTANCE.getTupleElement_Tuple();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf2.solveremf.impl.FormulationElementImpl <em>Formulation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf2.solveremf.impl.FormulationElementImpl
		 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getFormulationElement()
		 * @generated
		 */
		EClass FORMULATION_ELEMENT = eINSTANCE.getFormulationElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULATION_ELEMENT__NAME = eINSTANCE.getFormulationElement_Name();

		/**
		 * The meta object literal for the '<em><b>Formulation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULATION_ELEMENT__FORMULATION = eINSTANCE.getFormulationElement_Formulation();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf2.solveremf.impl.FormulationImpl <em>Formulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf2.solveremf.impl.FormulationImpl
		 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getFormulation()
		 * @generated
		 */
		EClass FORMULATION = eINSTANCE.getFormulation();

		/**
		 * The meta object literal for the '<em><b>Root Tuples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULATION__ROOT_TUPLES = eINSTANCE.getFormulation_RootTuples();

		/**
		 * The meta object literal for the '<em><b>Construct</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMULATION___CONSTRUCT__IFORMULATION = eINSTANCE.getFormulation__Construct__IFormulation();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf2.solveremf.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf2.solveremf.impl.TermImpl
		 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__VARIABLE = eINSTANCE.getTerm_Variable();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__CONSTRAINT = eINSTANCE.getTerm_Constraint();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf2.solveremf.impl.LinearConstraintImpl <em>Linear Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf2.solveremf.impl.LinearConstraintImpl
		 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getLinearConstraint()
		 * @generated
		 */
		EClass LINEAR_CONSTRAINT = eINSTANCE.getLinearConstraint();

		/**
		 * The meta object literal for the '<em><b>Right Hand Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_CONSTRAINT__RIGHT_HAND_SIDE = eINSTANCE.getLinearConstraint_RightHandSide();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf2.solveremf.impl.LinearConstraintTermImpl <em>Linear Constraint Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf2.solveremf.impl.LinearConstraintTermImpl
		 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getLinearConstraintTerm()
		 * @generated
		 */
		EClass LINEAR_CONSTRAINT_TERM = eINSTANCE.getLinearConstraintTerm();

		/**
		 * The meta object literal for the '<em><b>Coefficient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_CONSTRAINT_TERM__COEFFICIENT = eINSTANCE.getLinearConstraintTerm_Coefficient();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf2.solveremf.VariableType <em>Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf2.solveremf.VariableType
		 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getVariableType()
		 * @generated
		 */
		EEnum VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf2.solveremf.ConstraintType <em>Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf2.solveremf.ConstraintType
		 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getConstraintType()
		 * @generated
		 */
		EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

		/**
		 * The meta object literal for the '<em>IFormulation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf2.solver.IFormulation
		 * @see com.misc.common.moplaf2.solveremf.impl.SolverPackageImpl#getIFormulation()
		 * @generated
		 */
		EDataType IFORMULATION = eINSTANCE.getIFormulation();

	}

} //SolverPackage
