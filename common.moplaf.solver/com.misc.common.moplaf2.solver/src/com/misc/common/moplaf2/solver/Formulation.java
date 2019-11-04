package com.misc.common.moplaf2.solver;

import java.util.Collection;

public interface Formulation extends IFormulation{
	
	default public <T1> Tuple1<T1> createTuple(Class<? extends Tuple1<T1>> c, T1 t1){
		try {
			Tuple1<T1> new_tuple = c.newInstance().init(t1);
			return new_tuple;
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	default public <T1, T2> Tuple2<T1,T2> createTuple(Class<? extends Tuple2<T1,T2>> c, T1 t1,T2 t2){
		try {
			Tuple2<T1,T2> new_tuple = c.newInstance().init(t1, t2);
			return new_tuple;
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	


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

	default Collection<? extends Variable<?>> getTupleVariables(ITuple tuple) {
		ITuple tuple_typed = (ITuple)tuple;
		Collection<? extends Variable<?>> vars_typed = tuple_typed.getVariables();
		return vars_typed;
	}

	@Override
	default Collection<?> getTupleVariables(Object tuple) {
		ITuple tuple_typed = (ITuple)tuple;
		Collection<? extends Variable<?>> vars_typed = this.getTupleVariables(tuple_typed);
		return vars_typed;
	}

	default Variable<?> getTupleVariable(Class<? extends Variable<?>> c, ITuple tuple) {
		Collection<? extends Variable<?>> vars = this.getTupleVariables(tuple);
		Variable<?> var = vars.stream().filter(v -> c.isInstance(v)).findAny().orElse(null);
		return var;
	}

	@Override
	default Collection<?> getTupleConstraints(Object tuple) {
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
	default String getVariableName(Object var) {
		Variable<?> var_typed = (Variable<?>)var;
		return var_typed.getName();
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
	@Override
	default String getConstraintName(Object cons) {
		Constraint<?> cons_typed = (Constraint<?>)cons;
		return cons_typed.getName();
	}
	@Override
	default int getConstraintType(Object cons) {
		Constraint<?> cons_typed = (Constraint<?>)cons;
		return cons_typed.getType();
	}
	@Override
	default double getConstraintRighHandSide(Object cons) {
		Constraint<?> cons_typed = (Constraint<?>)cons;
		return cons_typed.getRightHandSide();
	}

}
