package com.misc.common.moplaf2.solver;

import java.util.Collection;

public interface IFormulation extends Constants{
	Collection<?> getRootTuples();
	Collection<?> getTupleSubTuples(Object tuple);
	Collection<?> getTupleVariables(Object tuple);
	Collection<?> getTupleConstraints(Object tuple);
	
	String getVariableName(Object var);
	int getVariableType(Object var);
	double getVariableLowerBound(Object var);
	double getVariableUpperBound(Object var);
	
	String getConstraintName(Object var);
	int getConstraintType(Object var);
	double getConstraintRighHandSide(Object var);
}
