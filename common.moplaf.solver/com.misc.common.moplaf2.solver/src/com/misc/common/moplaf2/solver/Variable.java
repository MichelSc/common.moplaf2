package com.misc.common.moplaf2.solver;

public abstract class Variable<T> {
	private T tuple;
	
	public Variable<T> init(T tuple){
		this.tuple = tuple;
		return this;
	}
	
	public T getTuple() {
		return tuple;
	}

	public abstract String getName();
	
	public int getType() {
		return IFormulation.VAR_TYPE_CONTINUOUS;
	}
	public double getLowerBound() {
		return 0.0;
	}
	public double getUpperBound() {
		return 1.0;
	}

}
