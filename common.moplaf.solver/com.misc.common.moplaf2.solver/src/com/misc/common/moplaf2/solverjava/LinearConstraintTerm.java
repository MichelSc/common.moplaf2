package com.misc.common.moplaf2.solverjava;

public class LinearConstraintTerm extends ConstraintTerm{
	Double coefficient;
	// constructor
	public LinearConstraintTerm(Constraint<?> cons, Variable<?> var, Double coefficient) {
		super(cons, var);
		this.coefficient = coefficient;
	}
	// getters
	public Double getCoefficient() {
		return coefficient;
	}	
}
