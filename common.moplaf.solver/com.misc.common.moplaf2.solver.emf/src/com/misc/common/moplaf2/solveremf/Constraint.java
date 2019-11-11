/**
 */
package com.misc.common.moplaf2.solveremf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf2.solveremf.Constraint#getType <em>Type</em>}</li>
 *   <li>{@link com.misc.common.moplaf2.solveremf.Constraint#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends TupleElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.misc.common.moplaf2.solveremf.ConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf2.solveremf.ConstraintType
	 * @see #setType(ConstraintType)
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getConstraint_Type()
	 * @model
	 * @generated
	 */
	ConstraintType getType();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf2.solveremf.Constraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.misc.common.moplaf2.solveremf.ConstraintType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConstraintType value);

	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf2.solveremf.Term}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf2.solveremf.Term#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getConstraint_Terms()
	 * @see com.misc.common.moplaf2.solveremf.Term#getConstraint
	 * @model opposite="Constraint" containment="true"
	 * @generated
	 */
	EList<Term> getTerms();

} // Constraint
