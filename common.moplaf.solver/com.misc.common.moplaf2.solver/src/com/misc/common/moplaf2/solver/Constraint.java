package com.misc.common.moplaf2.solver;

public abstract class Constraint<T> implements Constants{
	private T tuple;
	
	public Constraint<T> init(T tuple){
		this.tuple = tuple;
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

}
