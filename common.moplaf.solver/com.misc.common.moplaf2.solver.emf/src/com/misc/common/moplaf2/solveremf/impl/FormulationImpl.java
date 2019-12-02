/**
 */
package com.misc.common.moplaf2.solveremf.impl;

import com.misc.common.moplaf2.solver.IFormulation;
import com.misc.common.moplaf2.solveremf.Constraint;
import com.misc.common.moplaf2.solveremf.Formulation;
import com.misc.common.moplaf2.solveremf.LinearConstraint;
import com.misc.common.moplaf2.solveremf.LinearConstraintTerm;
import com.misc.common.moplaf2.solveremf.SolverPackage;
import com.misc.common.moplaf2.solveremf.Term;
import com.misc.common.moplaf2.solveremf.Tuple;
import com.misc.common.moplaf2.solveremf.Variable;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf2.solveremf.impl.FormulationImpl#getRootTuples <em>Root Tuples</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulationImpl extends MinimalEObjectImpl.Container implements Formulation {
	/**
	 * The cached value of the '{@link #getRootTuples() <em>Root Tuples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootTuples()
	 * @generated
	 * @ordered
	 */
	protected EList<Tuple> rootTuples;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.FORMULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tuple> getRootTuples() {
		if (rootTuples == null) {
			rootTuples = new EObjectContainmentEList<Tuple>(Tuple.class, this, SolverPackage.FORMULATION__ROOT_TUPLES);
		}
		return rootTuples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void construct(IFormulation formulation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.FORMULATION__ROOT_TUPLES:
				return ((InternalEList<?>)getRootTuples()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.FORMULATION__ROOT_TUPLES:
				return getRootTuples();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolverPackage.FORMULATION__ROOT_TUPLES:
				getRootTuples().clear();
				getRootTuples().addAll((Collection<? extends Tuple>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SolverPackage.FORMULATION__ROOT_TUPLES:
				getRootTuples().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SolverPackage.FORMULATION__ROOT_TUPLES:
				return rootTuples != null && !rootTuples.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SolverPackage.FORMULATION___CONSTRUCT__IFORMULATION:
				construct((IFormulation)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public Collection<?> getTupleSubTuples(Object tuple) {
		Tuple tuple_typed = (Tuple) tuple;
		return tuple_typed.getSubTuples();
	}

	@Override
	public Collection<?> getTupleVariables(Object tuple) {
		Tuple tuple_typed = (Tuple) tuple;
		return tuple_typed.getVariables();
	}

	@Override
	public Collection<?> getTupleConstraints(Object tuple) {
		Tuple tuple_typed = (Tuple) tuple;
		return tuple_typed.getConstraints();
	}

	@Override
	public String getVariableName(Object var) {
		Variable var_typed = (Variable) var;
		return var_typed.getName();
	}

	@Override
	public int getVariableType(Object var) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getVariableLowerBound(Object var) {
		Variable var_typed = (Variable) var;
		return var_typed.getLowerBound();
	}

	@Override
	public double getVariableUpperBound(Object var) {
		Variable var_typed = (Variable) var;
		return var_typed.getUpperBound();
	}

	@Override
	public String getConstraintName(Object cons) {
		Constraint cons_typed = (Constraint) cons;
		return cons_typed.getName();
	}

	@Override
	public int getConstraintType(Object cons) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getLinearConstraintRighHandSide(Object cons) {
		LinearConstraint cons_typed = (LinearConstraint) cons;
		return cons_typed.getRightHandSide();
	}

	@Override
	public Collection<?> getConstraintTerms(Object cons) {
		LinearConstraint cons_typed = (LinearConstraint) cons;
		return cons_typed.getTerms();
	}

	@Override
	public Object getTermVar(Object term) {
		Term term_typed = (Term) term;
		return term_typed.getVariable();
	}

	@Override
	public double getLinearTermCoefficient(Object term) {
		LinearConstraintTerm term_typed = (LinearConstraintTerm) term;
		return term_typed.getCoefficient();
	}

} //FormulationImpl
