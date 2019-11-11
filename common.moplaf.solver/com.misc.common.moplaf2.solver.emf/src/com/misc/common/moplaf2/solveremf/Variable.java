/**
 */
package com.misc.common.moplaf2.solveremf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf2.solveremf.Variable#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf2.solveremf.Variable#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link com.misc.common.moplaf2.solveremf.Variable#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link com.misc.common.moplaf2.solveremf.Variable#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends TupleElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf2.solveremf.VariableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf2.solveremf.VariableType
	 * @see #setType(VariableType)
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getVariable_Type()
	 * @model
	 * @generated
	 */
	VariableType getType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf2.solveremf.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf2.solveremf.VariableType
	 * @see #getType()
	 * @generated
	 */
	void setType(VariableType value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(double)
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getVariable_LowerBound()
	 * @model
	 * @generated
	 */
	double getLowerBound();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf2.solveremf.Variable#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(double value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(double)
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getVariable_UpperBound()
	 * @model default="1.0"
	 * @generated
	 */
	double getUpperBound();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf2.solveremf.Variable#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(double value);

	/**
	 * Returns the value of the '<em><b>Terms</b></em>' reference list.
	 * The list contents are of type {@link com.misc.common.moplaf2.solveremf.Term}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf2.solveremf.Term#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' reference list.
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getVariable_Terms()
	 * @see com.misc.common.moplaf2.solveremf.Term#getVariable
	 * @model opposite="Variable"
	 * @generated
	 */
	EList<Term> getTerms();

} // Variable
