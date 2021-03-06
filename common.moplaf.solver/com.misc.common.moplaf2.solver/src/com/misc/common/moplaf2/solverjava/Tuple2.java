package com.misc.common.moplaf2.solverjava;

import java.util.List;

public abstract class Tuple2<S extends TupleOwner, T1,T2> extends Tuple1<S, T1>{
	private T2 dimension2;

	public Tuple2() {
		this.dimension2 = null;
	}
	public Tuple2<S, T1,T2> init(TupleOwner owner, T1 dimension1, T2 dimension2) {
		super.init(owner, dimension1);
		this.dimension2 = dimension2;
		return this;
	}
	public T2 getDimension2() {
		return dimension2;
	}
	public String getDimension2AsName() {
		return dimension2.toString();
	}
	@Override
	public void collectDimensionNames(List<String> names) {
		super.collectDimensionNames(names);
		names.add(this.getDimension2AsName());
	}
}
