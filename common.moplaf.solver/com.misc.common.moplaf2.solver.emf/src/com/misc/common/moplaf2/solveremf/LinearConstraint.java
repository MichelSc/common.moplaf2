/**
 */
package com.misc.common.moplaf2.solveremf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf2.solveremf.LinearConstraint#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getLinearConstraint()
 * @model
 * @generated
 */
public interface LinearConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Right Hand Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Side</em>' attribute.
	 * @see #setRightHandSide(double)
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getLinearConstraint_RightHandSide()
	 * @model required="true"
	 * @generated
	 */
	double getRightHandSide();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf2.solveremf.LinearConstraint#getRightHandSide <em>Right Hand Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand Side</em>' attribute.
	 * @see #getRightHandSide()
	 * @generated
	 */
	void setRightHandSide(double value);

} // LinearConstraint
