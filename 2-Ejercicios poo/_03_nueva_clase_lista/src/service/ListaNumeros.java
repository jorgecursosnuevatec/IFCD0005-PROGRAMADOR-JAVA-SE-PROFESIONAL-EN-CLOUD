package service;

import java.util.ArrayList;

public class ListaNumeros extends ArrayList<Integer>{
	
	public Integer first() {
		return this.get(0);
	}
	
	public Integer last() {
		return this.get(size()-1);
	}
	
	public Integer sum() {
		int suma=0;
		for(int i=0;i<size();i++) {
			suma=suma+get(i);
		}
		return suma;
	}
	//ahora: No permitirá añadir números repetidos
	@Override
	public boolean add(Integer e) {
		//si no lo contiene, lo añade
		if(!contains(e)) {
			return super.add(e);
		}
		return false;
	}
	
	
	
	
}
