package com.misc.common.moplaf2.solverjava;

import com.misc.common.moplaf2.solver.IFormulation;

public abstract class Variable<T> implements Constants {
	private T tuple;
	
	public Variable<T> init(Tuple<?> tuple){
		this.tuple = (T) tuple;
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
