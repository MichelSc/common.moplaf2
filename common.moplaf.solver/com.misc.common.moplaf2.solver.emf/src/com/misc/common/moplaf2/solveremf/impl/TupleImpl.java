/**
 */
package com.misc.common.moplaf2.solveremf.impl;

import com.misc.common.moplaf2.solveremf.Constraint;
import com.misc.common.moplaf2.solveremf.SolverPackage;
import com.misc.common.moplaf2.solveremf.Tuple;
import com.misc.common.moplaf2.solveremf.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf2.solveremf.impl.TupleImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.misc.common.moplaf2.solveremf.impl.TupleImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.misc.common.moplaf2.solveremf.impl.TupleImpl#getSubTuples <em>Sub Tuples</em>}</li>
 *   <li>{@link com.misc.common.moplaf2.solveremf.impl.TupleImpl#getSuperTuple <em>Super Tuple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TupleImpl extends FormulationElementImpl implements Tuple {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getSubTuples() <em>Sub Tuples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTuples()
	 * @generated
	 * @ordered
	 */
	protected EList<Tuple> subTuples;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TupleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.TUPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, SolverPackage.TUPLE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, SolverPackage.TUPLE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tuple> getSubTuples() {
		if (subTuples == null) {
			subTuples = new EObjectContainmentWithInverseEList<Tuple>(Tuple.class, this, SolverPackage.TUPLE__SUB_TUPLES, SolverPackage.TUPLE__SUPER_TUPLE);
		}
		return subTuples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tuple getSuperTuple() {
		if (eContainerFeatureID() != SolverPackage.TUPLE__SUPER_TUPLE) return null;
		return (Tuple)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperTuple(Tuple newSuperTuple, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperTuple, SolverPackage.TUPLE__SUPER_TUPLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperTuple(Tuple newSuperTuple) {
		if (newSuperTuple != eInternalContainer() || (eContainerFeatureID() != SolverPackage.TUPLE__SUPER_TUPLE && newSuperTuple != null)) {
			if (EcoreUtil.isAncestor(this, newSuperTuple))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperTuple != null)
				msgs = ((InternalEObject)newSuperTuple).eInverseAdd(this, SolverPackage.TUPLE__SUB_TUPLES, Tuple.class, msgs);
			msgs = basicSetSuperTuple(newSuperTuple, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.TUPLE__SUPER_TUPLE, newSuperTuple, newSuperTuple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.TUPLE__SUB_TUPLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubTuples()).basicAdd(otherEnd, msgs);
			case SolverPackage.TUPLE__SUPER_TUPLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperTuple((Tuple)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolverPackage.TUPLE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case SolverPackage.TUPLE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case SolverPackage.TUPLE__SUB_TUPLES:
				return ((InternalEList<?>)getSubTuples()).basicRemove(otherEnd, msgs);
			case SolverPackage.TUPLE__SUPER_TUPLE:
				return basicSetSuperTuple(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SolverPackage.TUPLE__SUPER_TUPLE:
				return eInternalContainer().eInverseRemove(this, SolverPackage.TUPLE__SUB_TUPLES, Tuple.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.TUPLE__VARIABLES:
				return getVariables();
			case SolverPackage.TUPLE__CONSTRAINTS:
				return getConstraints();
			case SolverPackage.TUPLE__SUB_TUPLES:
				return getSubTuples();
			case SolverPackage.TUPLE__SUPER_TUPLE:
				return getSuperTuple();
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
			case SolverPackage.TUPLE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case SolverPackage.TUPLE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case SolverPackage.TUPLE__SUB_TUPLES:
				getSubTuples().clear();
				getSubTuples().addAll((Collection<? extends Tuple>)newValue);
				return;
			case SolverPackage.TUPLE__SUPER_TUPLE:
				setSuperTuple((Tuple)newValue);
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
			case SolverPackage.TUPLE__VARIABLES:
				getVariables().clear();
				return;
			case SolverPackage.TUPLE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case SolverPackage.TUPLE__SUB_TUPLES:
				getSubTuples().clear();
				return;
			case SolverPackage.TUPLE__SUPER_TUPLE:
				setSuperTuple((Tuple)null);
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
			case SolverPackage.TUPLE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case SolverPackage.TUPLE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case SolverPackage.TUPLE__SUB_TUPLES:
				return subTuples != null && !subTuples.isEmpty();
			case SolverPackage.TUPLE__SUPER_TUPLE:
				return getSuperTuple() != null;
		}
		return super.eIsSet(featureID);
	}

} //TupleImpl
