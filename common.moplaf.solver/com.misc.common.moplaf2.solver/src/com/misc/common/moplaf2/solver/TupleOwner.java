package com.misc.common.moplaf2.solver;

import java.util.ArrayList;
import java.util.Collection;

public class TupleOwner {
	// members
	ArrayList<Tuple0<?>> tuple0s = new ArrayList<Tuple0<?>>();
	ArrayList<Tuple1<?,?>> tuple1s = new ArrayList<Tuple1<?,?>>();
	ArrayList<Tuple2<?,?,?>> tuple2s = new ArrayList<Tuple2<?,?,?>>();
	
	// getters
	public Collection<? extends Tuple<?>> getTuples(){ 
		ArrayList<Tuple<?>> list = new ArrayList<>();
		list.addAll(this.tuple0s);
		list.addAll(this.tuple1s);
		list.addAll(this.tuple2s);
		return list;
	}
	public <N extends Tuple0<? extends TupleOwner>> N getTuple0(Class<N> c) { 
		Tuple0<?> tuple = this.tuple0s.stream().filter(t -> c.isInstance(t)).findAny().orElse(null);
		return (N) tuple;
		}
	
	public <N extends Tuple1<?, T1>, T1> N getTuple1(Class<N> c, T1 t1) { 
		Tuple1<?, ?> tuple = this.tuple1s.stream().filter(t -> c.isInstance(t) && t.getDimension1()==t1).findAny().orElse(null);
		return (N) tuple;
	}
	
	public <N extends Tuple2<?, T1, T2>, T1, T2> N getTuple2(Class<N> c, T1 t1, T2 t2) { 
		Tuple2<?, ?, ?> tuple = this.tuple2s.stream().filter(t -> c.isInstance(t) && t.getDimension1()==t1&&t.getDimension2()==t2).findAny().orElse(null);
		return (N) tuple;
		}

	// modifiers
	public void collectTuples() {
		// default does nothing
	}
	public <N extends Tuple0<? extends TupleOwner>, T1> N addTuple0(Class<N> c){
		try {
			N new_tuple = c.newInstance();
			new_tuple.init(this);
			this.tuple0s.add(new_tuple);
			return new_tuple;
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public <N extends Tuple1<? extends TupleOwner, T1>, T1> N addTuple1(Class<N> c, T1 t1){
		try {
			N new_tuple = c.newInstance();
			new_tuple.init(this, t1);
			this.tuple1s.add(new_tuple);
			return new_tuple;
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public <N extends Tuple2<? extends TupleOwner, T1, T2>, T1, T2> N addTuple2(Class<N> c, T1 t1, T2 t2){
		try {
			N new_tuple = c.newInstance();
			new_tuple.init(this, t1, t2);
			this.tuple2s.add(new_tuple);
			return new_tuple;
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
