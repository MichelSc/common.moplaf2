package com.misc.common.moplaf2.solver;

public abstract class Tuple2<T1,T2> implements ITuple{
	private T1 dimension1;
	private T2 dimension2;

	public Tuple2() {
		this.dimension1 = null;
		this.dimension2 = null;
	}

	public Tuple2<T1,T2> init(T1 dimension1, T2 dimension2) {
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
		return this;
	}

	public T1 getDimension1() {
		return dimension1;
	}
	
	public T2 getDimension2() {
		return dimension2;
	}


}
