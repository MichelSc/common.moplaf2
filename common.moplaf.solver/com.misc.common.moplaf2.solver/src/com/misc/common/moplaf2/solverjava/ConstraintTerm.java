package com.misc.common.moplaf2.solverjava;

public class ConstraintTerm {
	public Constraint<?> cons;
	public Variable<?> var;

	// constructor
	public ConstraintTerm(Constraint<?> cons, Variable<?> var) {
		super();
		this.cons = cons;
		this.var = var;
	}
	// getters
	public Constraint<?> getCons() {
		return cons;
	}
	public Variable<?> getVar() {
		return var;
	}
}