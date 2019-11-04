package com.misc.common.moplaf2.solver;

import java.util.Collection;

public interface ITuple {
	default public Collection<? extends ITuple> getSubTuples(){ return null;}
	default public Collection<? extends Variable<?>> getVariables(){ return null;}
	default public Collection<? extends Constraint<?>> getConstraints(){ return null;}
	default public <T extends ITuple> Variable<T> createVariable(Class<? extends Variable<T>> c){
		try {
			// if this tuple is not of type T, we are trying to create a var of another tuple-> error
			T this_tuple = (T)this;
			Variable<T> new_var = c.newInstance().init(this_tuple); 
			return new_var;
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
