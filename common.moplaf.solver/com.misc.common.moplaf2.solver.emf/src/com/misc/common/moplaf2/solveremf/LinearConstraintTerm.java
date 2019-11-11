/**
 */
package com.misc.common.moplaf2.solveremf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Constraint Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf2.solveremf.LinearConstraintTerm#getCoefficient <em>Coefficient</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getLinearConstraintTerm()
 * @model
 * @generated
 */
public interface LinearConstraintTerm extends Term {
	/**
	 * Returns the value of the '<em><b>Coefficient</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficient</em>' attribute.
	 * @see #setCoefficient(double)
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getLinearConstraintTerm_Coefficient()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getCoefficient();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf2.solveremf.LinearConstraintTerm#getCoefficient <em>Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficient</em>' attribute.
	 * @see #getCoefficient()
	 * @generated
	 */
	void setCoefficient(double value);

} // LinearConstraintTerm
