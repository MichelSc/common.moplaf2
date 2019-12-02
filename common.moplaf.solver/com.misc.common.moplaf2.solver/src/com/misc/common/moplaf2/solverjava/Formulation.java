package com.misc.common.moplaf2.solverjava;

import java.util.Collection;

import com.misc.common.moplaf2.solver.IFormulation;

public class Formulation extends TupleOwner implements IFormulation {
	public Formulation init() {
		this.collectTuples();
		return this;
	}

	@Override
	public Collection<?> getRootTuples() {
		return this.getTuples();
	}

	@Override
	public Collection<?> getTupleSubTuples(Object tuple) {
		Tuple<?> tuple_typed = (Tuple<?>)tuple;
		return tuple_typed.getTuples();
	}
	
	@Override
	public Collection<?> getTupleVariables(Object tuple) {
		Tuple<?> tuple_typed = (Tuple<?>)tuple;
		Collection<Variable<?>> vars_typed = tuple_typed.getVariables();
		return vars_typed;
	}
	@Override
	public int getVariableType(Object var) {
		Variable<?> var_typed = (Variable<?>)var;
		return var_typed.getType();
	}

	@Override
	public String getVariableName(Object var) {
		Variable<?> var_typed = (Variable<?>)var;
		return var_typed.getRole();
	}

	@Override
	public double getVariableLowerBound(Object var) {
		Variable<?> var_typed = (Variable<?>)var;
		return var_typed.getLowerBound();
	}

	@Override
	public double getVariableUpperBound(Object var) {
		Variable<?> var_typed = (Variable<?>)var;
		return var_typed.getUpperBound();
	}
	@Override
	public Collection<?> getTupleConstraints(Object tuple) {
		Tuple tuple_typed = (Tuple)tuple;
		Collection<? extends Constraint<?>> cons_typed = tuple_typed.getConstraints();
		return cons_typed;
	}

	@Override
	public String getConstraintName(Object cons) {
		Constraint<?> cons_typed = (Constraint<?>)cons;
		return cons_typed.getName();
	}
	@Override
	public int getConstraintType(Object cons) {
		Constraint<?> cons_typed = (Constraint<?>)cons;
		return cons_typed.getType();
	}
	@Override
	public double getLinearConstraintRighHandSide(Object cons) {
		Constraint<?> cons_typed = (Constraint<?>)cons;
		return cons_typed.getRightHandSide();
	}

	@Override
	public Collection<?> getConstraintTerms(Object cons) {
		Constraint<?> cons_typed = (Constraint<?>)cons;
		return cons_typed.getLinearConstraintTerms();
	}

	@Override
	public Object getTermVar(Object term) {
		LinearConstraintTerm term_typed = (LinearConstraintTerm) term;
		return term_typed.getVar();
	}

	@Override
	public double getLinearTermCoefficient(Object term) {
		LinearConstraintTerm term_typed = (LinearConstraintTerm) term;
		return term_typed.getCoefficient();
	}

}
