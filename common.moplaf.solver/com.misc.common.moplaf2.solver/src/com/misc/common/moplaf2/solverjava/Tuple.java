package com.misc.common.moplaf2.solverjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Tuple<S extends TupleOwner> extends TupleOwner{
	// members
	S owner;
	ArrayList<Variable<?>> vars = new ArrayList<>();
	ArrayList<Constraint<?>> cons = new ArrayList<>();
	
	// modifiers
	public Tuple<S> init(TupleOwner owner){
		this.owner = (S) owner;
		this.collectVars();
		this.collectConstraints();
		return this;
	}
	public void collectVars() {
		// default does nothing
	}
	public void collectConstraints() {
		// default does nothing
	}
	public void collectDimensionNames(List<String> names) {
		if ( this.owner instanceof Tuple ) {
			Tuple<?> owner_astuple = (Tuple<?>)this.owner;
			owner_astuple.collectDimensionNames(names);
		}
	}
	
	// getters
	public S getOwner() {
		return owner;
	}
	public abstract String getRole();
	public String getDimensionsAsString() {
		ArrayList<String> names = new ArrayList<String>();
		this.collectDimensionNames(names);
		return names.stream().collect( Collectors.joining( "," ));
		
	}
	public String getName() {
		String name = String.format("%s(%s)", this.getRole(), this.getDimensionsAsString());
		return name;
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
	public Collection<? extends Constraint<?>> getConstraints(){ 
		return this.cons;
	}
	public <C extends Constraint<?>> C addConstraint(Class<C> c){
	try {
		// if this tuple is not of type T, we are trying to create a var of another tuple-> error
		C new_cons = c.newInstance();
		new_cons.init(this); 
		this.cons.add(new_cons);
		return new_cons;
	} catch (InstantiationException | IllegalAccessException e) {
		e.printStackTrace();
	}
	return null;
	}
	public <C extends Constraint<?>> C getConstraint(Class<C> c){
		Constraint<?> cons = this.cons.stream().filter(v -> c.isInstance(v)).findAny().orElse(null);
		return (C) cons;
	}
}
