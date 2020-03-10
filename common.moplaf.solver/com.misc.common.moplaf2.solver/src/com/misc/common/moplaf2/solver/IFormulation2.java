package com.misc.common.moplaf2.solver;

// TODO
// this is a type object oriented version of IFormulation
// it is more expressive
// it is more difficult to implement
//    I need to make classes of the right type
// it is stronger than IFormulation
//    I can easily make an IFormulation from IFormulation2
//        with the overhead of just one cast
// I cannot make a IFormulation2 from IFormulation
//    it is more constrained
//    thus more expressive
import java.util.Collection;

public interface IFormulation2 extends Constants{
	public interface ITuple {
		public Collection<? extends ITuple> getTupleSubTuples(ITuple tuple);
		Collection<? extends IVariable> getTupleVariables(ITuple tuple);
		Collection<? extends IConstraint> getTupleConstraints(ITuple tuple);
	}
	public interface IVariable {
		String getVariableName();
		int getVariableType();
		double getVariableLowerBound();
		double getVariableUpperBound();
	}
	public interface IConstraint {
		String getConstraintName();
		int getConstraintType();
		Collection<? extends ITerm> getConstraintTerms();
	}
	public interface ILinearConstraint extends IConstraint {
		double getLinearConstraintRighHandSide();
	}
	public interface ITerm {
		Object getTermVar();
	}
	public interface ILinearTerm extends ITerm {
		double getLinearTermCoefficient();
	}

	// this is the formulation
	Collection<? extends ITuple> getRootTuples();
}
