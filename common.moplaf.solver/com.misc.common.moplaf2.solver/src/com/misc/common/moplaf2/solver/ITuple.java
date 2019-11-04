package com.misc.common.moplaf2.solver;

import java.util.Collection;

public interface ITuple {
	default public Collection<? extends ITuple> getSubTuples(){ return null;}
	default public Collection<? extends Variable<?>> getVariables(){ return null;}
}
