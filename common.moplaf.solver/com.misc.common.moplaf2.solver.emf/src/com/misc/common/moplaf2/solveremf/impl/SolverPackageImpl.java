/**
 */
package com.misc.common.moplaf2.solveremf.impl;

import com.misc.common.moplaf2.solver.IFormulation;
import com.misc.common.moplaf2.solveremf.Constraint;
import com.misc.common.moplaf2.solveremf.ConstraintType;
import com.misc.common.moplaf2.solveremf.Formulation;
import com.misc.common.moplaf2.solveremf.FormulationElement;
import com.misc.common.moplaf2.solveremf.LinearConstraint;
import com.misc.common.moplaf2.solveremf.LinearConstraintTerm;
import com.misc.common.moplaf2.solveremf.SolverFactory;
import com.misc.common.moplaf2.solveremf.SolverPackage;
import com.misc.common.moplaf2.solveremf.Term;
import com.misc.common.moplaf2.solveremf.Tuple;
import com.misc.common.moplaf2.solveremf.TupleElement;
import com.misc.common.moplaf2.solveremf.Variable;
import com.misc.common.moplaf2.solveremf.VariableType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverPackageImpl extends EPackageImpl implements SolverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearConstraintTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iFormulationEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SolverPackageImpl() {
		super(eNS_URI, SolverFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SolverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SolverPackage init() {
		if (isInited) return (SolverPackage)EPackage.Registry.INSTANCE.getEPackage(SolverPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSolverPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SolverPackageImpl theSolverPackage = registeredSolverPackage instanceof SolverPackageImpl ? (SolverPackageImpl)registeredSolverPackage : new SolverPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSolverPackage.createPackageContents();

		// Initialize created meta-data
		theSolverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSolverPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SolverPackage.eNS_URI, theSolverPackage);
		return theSolverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTuple() {
		return tupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTuple_Variables() {
		return (EReference)tupleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTuple_Constraints() {
		return (EReference)tupleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTuple_SubTuples() {
		return (EReference)tupleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTuple_SuperTuple() {
		return (EReference)tupleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_LowerBound() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_UpperBound() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_Terms() {
		return (EReference)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstraint_Type() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraint_Terms() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTupleElement() {
		return tupleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTupleElement_Tuple() {
		return (EReference)tupleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormulationElement() {
		return formulationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormulationElement_Name() {
		return (EAttribute)formulationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormulationElement_Formulation() {
		return (EReference)formulationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormulation() {
		return formulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormulation_RootTuples() {
		return (EReference)formulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFormulation__Construct__IFormulation() {
		return formulationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerm_Variable() {
		return (EReference)termEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerm_Constraint() {
		return (EReference)termEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinearConstraint() {
		return linearConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinearConstraint_RightHandSide() {
		return (EAttribute)linearConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinearConstraintTerm() {
		return linearConstraintTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinearConstraintTerm_Coefficient() {
		return (EAttribute)linearConstraintTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVariableType() {
		return variableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConstraintType() {
		return constraintTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIFormulation() {
		return iFormulationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolverFactory getSolverFactory() {
		return (SolverFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tupleEClass = createEClass(TUPLE);
		createEReference(tupleEClass, TUPLE__VARIABLES);
		createEReference(tupleEClass, TUPLE__CONSTRAINTS);
		createEReference(tupleEClass, TUPLE__SUB_TUPLES);
		createEReference(tupleEClass, TUPLE__SUPER_TUPLE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__LOWER_BOUND);
		createEAttribute(variableEClass, VARIABLE__UPPER_BOUND);
		createEReference(variableEClass, VARIABLE__TERMS);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__TYPE);
		createEReference(constraintEClass, CONSTRAINT__TERMS);

		tupleElementEClass = createEClass(TUPLE_ELEMENT);
		createEReference(tupleElementEClass, TUPLE_ELEMENT__TUPLE);

		formulationElementEClass = createEClass(FORMULATION_ELEMENT);
		createEAttribute(formulationElementEClass, FORMULATION_ELEMENT__NAME);
		createEReference(formulationElementEClass, FORMULATION_ELEMENT__FORMULATION);

		formulationEClass = createEClass(FORMULATION);
		createEReference(formulationEClass, FORMULATION__ROOT_TUPLES);
		createEOperation(formulationEClass, FORMULATION___CONSTRUCT__IFORMULATION);

		termEClass = createEClass(TERM);
		createEReference(termEClass, TERM__VARIABLE);
		createEReference(termEClass, TERM__CONSTRAINT);

		linearConstraintEClass = createEClass(LINEAR_CONSTRAINT);
		createEAttribute(linearConstraintEClass, LINEAR_CONSTRAINT__RIGHT_HAND_SIDE);

		linearConstraintTermEClass = createEClass(LINEAR_CONSTRAINT_TERM);
		createEAttribute(linearConstraintTermEClass, LINEAR_CONSTRAINT_TERM__COEFFICIENT);

		// Create enums
		variableTypeEEnum = createEEnum(VARIABLE_TYPE);
		constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);

		// Create data types
		iFormulationEDataType = createEDataType(IFORMULATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tupleEClass.getESuperTypes().add(this.getFormulationElement());
		variableEClass.getESuperTypes().add(this.getTupleElement());
		constraintEClass.getESuperTypes().add(this.getTupleElement());
		tupleElementEClass.getESuperTypes().add(this.getFormulationElement());
		linearConstraintEClass.getESuperTypes().add(this.getConstraint());
		linearConstraintTermEClass.getESuperTypes().add(this.getTerm());

		// Initialize classes, features, and operations; add parameters
		initEClass(tupleEClass, Tuple.class, "Tuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTuple_Variables(), this.getVariable(), null, "Variables", null, 0, -1, Tuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTuple_Constraints(), this.getConstraint(), null, "Constraints", null, 0, -1, Tuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTuple_SubTuples(), this.getTuple(), this.getTuple_SuperTuple(), "SubTuples", null, 0, -1, Tuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTuple_SuperTuple(), this.getTuple(), this.getTuple_SubTuples(), "SuperTuple", null, 0, 1, Tuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Type(), this.getVariableType(), "Type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_LowerBound(), ecorePackage.getEDouble(), "LowerBound", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_UpperBound(), ecorePackage.getEDouble(), "UpperBound", "1.0", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Terms(), this.getTerm(), this.getTerm_Variable(), "Terms", null, 0, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Type(), this.getConstraintType(), "Type", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Terms(), this.getTerm(), this.getTerm_Constraint(), "Terms", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleElementEClass, TupleElement.class, "TupleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleElement_Tuple(), this.getTuple(), null, "Tuple", null, 1, 1, TupleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formulationElementEClass, FormulationElement.class, "FormulationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormulationElement_Name(), ecorePackage.getEString(), "Name", null, 0, 1, FormulationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormulationElement_Formulation(), this.getFormulation(), null, "Formulation", null, 1, 1, FormulationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formulationEClass, Formulation.class, "Formulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormulation_RootTuples(), this.getTuple(), null, "RootTuples", null, 0, -1, Formulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getFormulation__Construct__IFormulation(), null, "construct", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIFormulation(), "formulation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerm_Variable(), this.getVariable(), this.getVariable_Terms(), "Variable", null, 1, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_Constraint(), this.getConstraint(), this.getConstraint_Terms(), "Constraint", null, 1, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearConstraintEClass, LinearConstraint.class, "LinearConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearConstraint_RightHandSide(), ecorePackage.getEDouble(), "RightHandSide", null, 1, 1, LinearConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearConstraintTermEClass, LinearConstraintTerm.class, "LinearConstraintTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearConstraintTerm_Coefficient(), ecorePackage.getEDouble(), "Coefficient", "1.0", 1, 1, LinearConstraintTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(variableTypeEEnum, VariableType.class, "VariableType");
		addEEnumLiteral(variableTypeEEnum, VariableType.CONTINUOUS);
		addEEnumLiteral(variableTypeEEnum, VariableType.INTEGER);

		initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.EQUAL);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.SMALLER_THAN_OR_EQUAL);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.GREATER_THAN_OR_EQUAL);

		// Initialize data types
		initEDataType(iFormulationEDataType, IFormulation.class, "IFormulation", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SolverPackageImpl
