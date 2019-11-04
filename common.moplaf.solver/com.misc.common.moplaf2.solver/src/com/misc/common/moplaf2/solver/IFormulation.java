package com.misc.common.moplaf2.solver;

import java.util.Collection;

public interface IFormulation {
	static int VAR_TYPE_CONTINUOUS = 1;
	static int VAR_TYPE_INTEGER = 2;
	Collection<?> getRootTuples();
	Collection<?> getTupleSubTuples(Object tuple);
	Collection<?> getTupleVariables(Object tuple);
	String getVariableName(Object var);
	int getVariableType(Object var);
	double getVariableLowerBound(Object var);
	double getVariableUpperBound(Object var);
}
