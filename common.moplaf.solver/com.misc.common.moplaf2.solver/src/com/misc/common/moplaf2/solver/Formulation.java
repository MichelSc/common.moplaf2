package com.misc.common.moplaf2.solver;

import java.util.Collection;

public class Formulation extends TupleOwner implements IFormulation {
	@Override
	public Collection<?> getRootTuples() {
		return this.getTuples();
	}

	@Override
	public Collection<?> getTupleSubTuples(Object tuple) {
		Tuple<?> tuple_typed = (Tuple<?>)tuple;
		return tuple_typed.getTuples();
	}
	
	public Formulation init() {
		this.collectTuples();
		return this;
	}

//	default Collection<? extends Variable<?>> getTupleVariables(Tuple tuple) {
//		Tuple tuple_typed = (Tuple)tuple;
//		Collection<? extends Variable<?>> vars_typed = tuple_typed.getVariables();
//		return vars_typed;
//	}
//
//	@Override
//	default Collection<?> getTupleVariables(Object tuple) {
//		Tuple tuple_typed = (Tuple)tuple;
//		Collection<? extends Variable<?>> vars_typed = this.getTupleVariables(tuple_typed);
//		return vars_typed;
//	}
//
//	default Variable<?> getTupleVariable(Class<? extends Variable<?>> c, Tuple tuple) {
//		Collection<? extends Variable<?>> vars = this.getTupleVariables(tuple);
//		Variable<?> var = vars.stream().filter(v -> c.isInstance(v)).findAny().orElse(null);
//		return var;
//	}
//
//	@Override
//	default Collection<?> getTupleConstraints(Object tuple) {
//		Tuple tuple_typed = (Tuple)tuple;
//		Collection<? extends Variable<?>> vars_typed = tuple_typed.getVariables();
//		return vars_typed;
//	}
//
//	@Override
//	default int getVariableType(Object var) {
//		Variable<?> var_typed = (Variable<?>)var;
//		return var_typed.getType();
//	}
//
//	@Override
//	default String getVariableName(Object var) {
//		Variable<?> var_typed = (Variable<?>)var;
//		return var_typed.getName();
//	}
//
//	@Override
//	default double getVariableLowerBound(Object var) {
//		Variable<?> var_typed = (Variable<?>)var;
//		return var_typed.getLowerBound();
//	}
//
//	@Override
//	default double getVariableUpperBound(Object var) {
//		Variable<?> var_typed = (Variable<?>)var;
//		return var_typed.getUpperBound();
//	}
//	@Override
//	default String getConstraintName(Object cons) {
//		Constraint<?> cons_typed = (Constraint<?>)cons;
//		return cons_typed.getName();
//	}
//	@Override
//	default int getConstraintType(Object cons) {
//		Constraint<?> cons_typed = (Constraint<?>)cons;
//		return cons_typed.getType();
//	}
//	@Override
//	default double getConstraintRighHandSide(Object cons) {
//		Constraint<?> cons_typed = (Constraint<?>)cons;
//		return cons_typed.getRightHandSide();
//	}

}
