package com.misc.common.moplaf2.solver;


public abstract class Tuple0<S extends TupleOwner> extends Tuple<S>{
	
	@Override
	public Tuple0<S> init(TupleOwner owner) {
		super.init(owner);
		return this;
	}

}
