package com.misc.common.moplaf2.solver;

import java.util.ArrayList;
import java.util.Collection;

public class Tuple<S extends TupleOwner> extends TupleOwner{
	// members
	S owner;
	ArrayList<Variable<?>> vars = new ArrayList<>();
	
	// modifiers
	public Tuple<S> init(TupleOwner owner){
		this.owner = (S) owner;
		this.collectVars();
		return this;
	}
	public void collectVars() {
		// default does nothing
	}
	
	// getters
	public S getOwner() {
		return owner;
	}

	// variables
	public Collection<Variable<?>> getVariables(){ 
		return this.vars;
	}
	public <V extends Variable<?>> V addVariable(Class<V> c){
		try {
			// if this tuple is not of type T, we are trying to create a var of another tuple-> error
			V new_var = c.newInstance();
			new_var.init(this); 
			this.vars.add(new_var);
			return new_var;
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	public <V extends Variable<?>> V getVariable(Class<V> c){
		Variable<?> var = this.vars.stream().filter(v -> c.isInstance(v)).findAny().orElse(null);
		return (V) var;
	}
	
	// constraints
	public Collection<? extends Constraint<?>> getConstraints(){ return null;}
}
