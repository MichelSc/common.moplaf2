package com.misc.common.moplaf2.solverjava;

import java.util.ArrayList;
import java.util.Collection;

import com.misc.common.moplaf2.solver.Constants;

public abstract class Constraint<T extends Tuple<?>> implements Constants{
	private T tuple;
	
	public class Terms extends ArrayList<LinearConstraintTerm>{
		public void addTerm(Variable<?> var, double coefficient) {
			Constraint<T> cons = Constraint.this;
			this.add(new LinearConstraintTerm(cons, var, coefficient));
		}
	}
	// modifiers
	public Constraint<T> init(Tuple<?> tuple){
		this.tuple = (T) tuple;
		return this;
	}
	protected void collectTerms(Terms terms) {
		// default does nothing
	}
	// getters
	public T getTuple() {
		return tuple;
	}
	public abstract String getRole();
	public String getName() {
		String name = String.format("%s(%s)", this.getRole(), this.tuple.getDimensionsAsString());
		return name;
	}
	public int getType() {
		return CONS_TYPE_LINEAR_EQ;
	}
	public double getRightHandSide() {
		return 0.0;
	}
	public Collection<LinearConstraintTerm> getLinearConstraintTerms(){
		Constraint<T>.Terms terms = new Terms();
		this.collectTerms(terms);
		return terms;
	}
}
