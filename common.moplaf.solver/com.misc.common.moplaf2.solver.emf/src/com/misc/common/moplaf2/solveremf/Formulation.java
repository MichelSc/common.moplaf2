/**
 */
package com.misc.common.moplaf2.solveremf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import com.misc.common.moplaf2.solver.IFormulation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formulation</b></em>'.
 * @implements IFormulation
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf2.solveremf.Formulation#getRootTuples <em>Root Tuples</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getFormulation()
 * @model
 * @generated
 */
public interface Formulation extends EObject, IFormulation {
	/**
	 * Returns the value of the '<em><b>Root Tuples</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.common.moplaf2.solveremf.Tuple}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Tuples</em>' containment reference list.
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getFormulation_RootTuples()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tuple> getRootTuples();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model formulationDataType="com.misc.common.moplaf2.solveremf.IFormulation"
	 * @generated
	 */
	void construct(IFormulation formulation);

} // Formulation
