package com.misc.common.moplaf2.solver;

import java.util.Collection;

public class Tuple<S extends TupleOwner> extends TupleOwner{
	// owner
	S owner;
	
	public Tuple<S> init(TupleOwner owner){
		this.owner = (S) owner;
		this.collectTuples();
		return this;
	}
	
	// variables
	public Collection<? extends Variable<?>> getVariables(){ return null;}
	public <T extends Tuple<S>> Variable<T> createVariable(Class<? extends Variable<T>> c){
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
	
	// constraints
	public Collection<? extends Constraint<?>> getConstraints(){ return null;}
}
