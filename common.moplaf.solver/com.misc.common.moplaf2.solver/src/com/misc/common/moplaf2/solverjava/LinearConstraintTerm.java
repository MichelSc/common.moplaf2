package com.misc.common.moplaf2.solverjava;

public class LinearConstraintTerm {
	// members
	Constraint<?> cons;
	Variable<?> var;
	Double coefficient;
	// constructor
	public LinearConstraintTerm(Constraint<?> cons, Variable<?> var, Double coefficient) {
		super();
		this.cons = cons;
		this.var = var;
		this.coefficient = coefficient;
	}
	// getters
	public Constraint<?> getCons() {
		return cons;
	}
	public Variable<?> getVar() {
		return var;
	}
	public Double getCoefficient() {
		return coefficient;
	}	
}
