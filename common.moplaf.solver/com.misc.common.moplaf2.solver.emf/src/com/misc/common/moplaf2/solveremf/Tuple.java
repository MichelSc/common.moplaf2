/**
 */
package com.misc.common.moplaf2.solveremf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf2.solveremf.Tuple#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.misc.common.moplaf2.solveremf.Tuple#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.misc.common.moplaf2.solveremf.Tuple#getSubTuples <em>Sub Tuples</em>}</li>
 *   <li>{@link com.misc.common.moplaf2.solveremf.Tuple#getSuperTuple <em>Super Tuple</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getTuple()
 * @model
 * @generated
 */
public interface Tuple extends FormulationElement {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf2.solveremf.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getTuple_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf2.solveremf.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getTuple_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Sub Tuples</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf2.solveremf.Tuple}.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf2.solveremf.Tuple#getSuperTuple <em>Super Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Tuples</em>' containment reference list.
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getTuple_SubTuples()
	 * @see com.misc.common.moplaf2.solveremf.Tuple#getSuperTuple
	 * @model opposite="SuperTuple" containment="true"
	 * @generated
	 */
	EList<Tuple> getSubTuples();

	/**
	 * Returns the value of the '<em><b>Super Tuple</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.misc.common.moplaf2.solveremf.Tuple#getSubTuples <em>Sub Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Tuple</em>' container reference.
	 * @see #setSuperTuple(Tuple)
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getTuple_SuperTuple()
	 * @see com.misc.common.moplaf2.solveremf.Tuple#getSubTuples
	 * @model opposite="SubTuples" transient="false"
	 * @generated
	 */
	Tuple getSuperTuple();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf2.solveremf.Tuple#getSuperTuple <em>Super Tuple</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Tuple</em>' container reference.
	 * @see #getSuperTuple()
	 * @generated
	 */
	void setSuperTuple(Tuple value);

} // Tuple
