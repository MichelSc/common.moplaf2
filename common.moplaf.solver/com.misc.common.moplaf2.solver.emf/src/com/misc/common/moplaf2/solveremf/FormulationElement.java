/**
 */
package com.misc.common.moplaf2.solveremf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formulation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf2.solveremf.FormulationElement#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.common.moplaf2.solveremf.FormulationElement#getFormulation <em>Formulation</em>}</li>
 * </ul>
 *
 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getFormulationElement()
 * @model
 * @generated
 */
public interface FormulationElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getFormulationElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf2.solveremf.FormulationElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Formulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulation</em>' reference.
	 * @see #setFormulation(Formulation)
	 * @see com.misc.common.moplaf2.solveremf.SolverPackage#getFormulationElement_Formulation()
	 * @model required="true"
	 * @generated
	 */
	Formulation getFormulation();

	/**
	 * Sets the value of the '{@link com.misc.common.moplaf2.solveremf.FormulationElement#getFormulation <em>Formulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formulation</em>' reference.
	 * @see #getFormulation()
	 * @generated
	 */
	void setFormulation(Formulation value);

} // FormulationElement
