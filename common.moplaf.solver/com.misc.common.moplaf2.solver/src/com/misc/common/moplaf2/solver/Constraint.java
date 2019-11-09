package com.misc.common.moplaf2.solver;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Constraint<T> implements Constants{
	private T tuple;
	
	public class Terms extends ArrayList<LinearConstraintTerm>{
		public void addTerm(Variable<?> var, double coefficient) {
			Constraint<T> cons = Constraint.this;
			this.add(new LinearConstraintTerm(cons, var, coefficient));
		}
	}
	
	public Constraint<T> init(Tuple<?> tuple){
		this.tuple = (T) tuple;
		return this;
	}
	
	public T getTuple() {
		return tuple;
	}

	public abstract String getName();
	
	public int getType() {
		return CONS_TYPE_EQUAL;
	}
	public double getRightHandSide() {
		return 0.0;
	}
	public Collection<LinearConstraintTerm> getLinearConstraintTerms(){
		Constraint<T>.Terms terms = new Terms();
		this.collectTerms(terms);
		return terms;
	}
	
	protected void collectTerms(Terms terms) {
		// default does nothing
	}
}
