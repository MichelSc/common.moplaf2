package com.misc.common.moplaf2.solver;


public abstract class Tuple1<T1> implements ITuple{
	private T1 dimension1;
	
	public Tuple1() {
		super();
		this.dimension1 = null;
	}
	
	public Tuple1<T1> init(T1 t) {
		this.dimension1 = t;
		return this;
	}

	public T1 getDimension1() {
		return dimension1;
	}


}
