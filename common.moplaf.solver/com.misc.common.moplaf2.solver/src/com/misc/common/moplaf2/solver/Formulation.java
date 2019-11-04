package com.misc.common.moplaf2.solver;

import java.util.Collection;

public interface Formulation extends IFormulation{

	@Override
	default public Collection<?> getRootTuples() {
		return null;
	}

	@Override
	default public Collection<?> getTupleSubTuples(Object tuple) {
		ITuple tuple_typed = (ITuple)tuple;
		Collection<? extends ITuple> tuples_typed = tuple_typed.getSubTuples();
		return tuples_typed;
	}

	@Override
	default Collection<?> getTupleVariables(Object tuple) {
		ITuple tuple_typed = (ITuple)tuple;
		Collection<? extends Variable<?>> vars_typed = tuple_typed.getVariables();
		return vars_typed;
	}

	@Override
	default int getVariableType(Object var) {
		Variable<?> var_typed = (Variable<?>)var;
		return var_typed.getType();
	}

	@Override
	default double getVariableLowerBound(Object var) {
		Variable<?> var_typed = (Variable<?>)var;
		return var_typed.getLowerBound();
	}

	@Override
	default double getVariableUpperBound(Object var) {
		Variable<?> var_typed = (Variable<?>)var;
		return var_typed.getUpperBound();
	}
	
	
	
}
