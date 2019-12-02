package com.misc.common.moplaf2.solverjava;

import com.misc.common.moplaf2.solver.Constants;
import com.misc.common.moplaf2.solver.IFormulation;

public abstract class Variable<T extends Tuple<?>> implements Constants {
	private T tuple;
	
	public Variable<T> init(Tuple<?> tuple){
		this.tuple = (T) tuple;
		return this;
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
		return IFormulation.VAR_TYPE_CONTINUOUS;
	}
	public double getLowerBound() {
		return 0.0;
	}
	public double getUpperBound() {
		return 1.0;
	}
}
