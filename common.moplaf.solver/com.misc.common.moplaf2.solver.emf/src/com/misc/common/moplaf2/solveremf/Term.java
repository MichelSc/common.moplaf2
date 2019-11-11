/**
 */
package com.misc.common.moplaf2.solveremf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf2.solveremf.Term#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.misc.common.moplaf2.solveremf.Term#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf2.solveremf.Variable#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getTerm_Variable()
	 * @see com.misc.common.moplaf2.solveremf.Variable#getTerms
	 * @model opposite="Terms" required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf2.solveremf.Term#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf2.solveremf.Constraint#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' container reference.
	 * @see #setConstraint(Constraint)
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getTerm_Constraint()
	 * @see com.misc.common.moplaf2.solveremf.Constraint#getTerms
	 * @model opposite="Terms" required="true" transient="false"
	 * @generated
	 */
	Constraint getConstraint();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf2.solveremf.Term#getConstraint <em>Constraint</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' container reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Constraint value);

} // Term
