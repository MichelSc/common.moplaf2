package com.misc.common.moplaf2.solver;

import java.util.Collection;

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
		return var_typed.getName();
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
	public double getConstraintRighHandSide(Object cons) {
		Constraint<?> cons_typed = (Constraint<?>)cons;
		return cons_typed.getRightHandSide();
	}

}
