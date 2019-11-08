package com.misc.common.moplaf2.solver;


public abstract class Tuple1<S extends TupleOwner, T1> extends Tuple0<S>{
	private T1 dimension1;
	
	public Tuple1() {
		super();
		this.dimension1 = null;
	}
	
	public Tuple1<S, T1> init(TupleOwner owner, T1 t) {
		super.init(owner);
		this.dimension1 = t;
		return this;
	}

	public T1 getDimension1() {
		return dimension1;
	}


}
