package com.misc.common.moplaf2.solverjava;


public abstract class Tuple0<S extends TupleOwner> extends Tuple<S>{
	
	@Override
	public Tuple0<S> init(TupleOwner owner) {
		super.init(owner);
		return this;
	}
}
