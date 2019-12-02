package com.misc.common.moplaf2.solver;

// TODO
// question: should we give the all path in the query 
//   instead of the root element
//   this would allow us to implement the interface with indexes
//   optionally

import java.util.Collection;

public interface IFormulation extends Constants{
	// tuple elements
	Collection<?> getRootTuples();
	Collection<?> getTupleSubTuples(Object tuple);
	Collection<?> getTupleVariables(Object tuple);
	Collection<?> getTupleConstraints(Object tuple);
	
	// var elements
	String getVariableName(Object var);
	int getVariableType(Object var);
	double getVariableLowerBound(Object var);
	double getVariableUpperBound(Object var);
	
	// cons elements
	String getConstraintName(Object cons);
	int getConstraintType(Object cons);
	Collection<?> getConstraintTerms(Object cons);
	Object getTermVar(Object term);
	// from here on, specific to linear formulation
	double getLinearConstraintRighHandSide(Object cons);
	double getLinearTermCoefficient(Object term);
}
