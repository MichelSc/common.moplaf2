/**
 */
package com.misc.common.moplaf2.solveremf.impl;

import com.misc.common.moplaf2.solveremf.SolverPackage;
import com.misc.common.moplaf2.solveremf.Tuple;
import com.misc.common.moplaf2.solveremf.TupleElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuple Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf2.solveremf.impl.TupleElementImpl#getTuple <em>Tuple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TupleElementImpl extends FormulationElementImpl implements TupleElement {
	/**
	 * The cached value of the '{@link #getTuple() <em>Tuple</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuple()
	 * @generated
	 * @ordered
	 */
	protected Tuple tuple;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TupleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.TUPLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tuple getTuple() {
		if (tuple != null && tuple.eIsProxy()) {
			InternalEObject oldTuple = (InternalEObject)tuple;
			tuple = (Tuple)eResolveProxy(oldTuple);
			if (tuple != oldTuple) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.TUPLE_ELEMENT__TUPLE, oldTuple, tuple));
			}
		}
		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple basicGetTuple() {
		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTuple(Tuple newTuple) {
		Tuple oldTuple = tuple;
		tuple = newTuple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.TUPLE_ELEMENT__TUPLE, oldTuple, tuple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.TUPLE_ELEMENT__TUPLE:
				if (resolve) return getTuple();
				return basicGetTuple();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolverPackage.TUPLE_ELEMENT__TUPLE:
				setTuple((Tuple)newValue);
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
			case SolverPackage.TUPLE_ELEMENT__TUPLE:
				setTuple((Tuple)null);
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
			case SolverPackage.TUPLE_ELEMENT__TUPLE:
				return tuple != null;
		}
		return super.eIsSet(featureID);
	}

} //TupleElementImpl
