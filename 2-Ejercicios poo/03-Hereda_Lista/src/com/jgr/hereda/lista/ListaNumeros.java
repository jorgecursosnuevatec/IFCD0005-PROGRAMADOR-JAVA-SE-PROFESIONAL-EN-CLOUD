package com.jgr.hereda.lista;

import java.util.ArrayList;
import java.util.List;

public class ListaNumeros extends ArrayList<Integer> {
	
	
	public Integer devuelveFirst() {
		return this.get(0);
	}
	
	public Integer devuelveLast() {		
		
		return this.get(this.size()-1);
	}
	
	public Integer devuelveSuma() {
		return  this.
				stream().
				reduce(0, Integer::sum);
	}
	@Override
	public boolean add(Integer e) {
		
		boolean existe=this.stream().findAny().equals(e); 
		
		if(!existe) {
			this.add(e);
		}
		
		return existe;
	}
	
	
	

}
