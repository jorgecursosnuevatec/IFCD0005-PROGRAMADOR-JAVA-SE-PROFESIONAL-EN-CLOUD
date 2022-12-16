package com.jgr.mapas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Auxiliar {
	
	static Map<Integer, String> agenda = new HashMap<>();
	
	public boolean altaTlf(int tlf, String nombre) {
		
		boolean alta=true;
		
		
		if(agenda.get(tlf)==null) {			
			agenda.put(tlf, nombre.toUpperCase());			
		}else {
			alta=false;
		}
		
		return alta;
		
	}
	
	public int buscarNombre(String nombre) {
		int retorno = 0;
		
		List<Integer>claves = agenda.keySet().stream().collect(Collectors.toList());		
		List<String> valores = agenda.values().stream().collect(Collectors.toList());
		
		if (agenda.containsValue(nombre.toUpperCase())) {
			for (Entry<Integer, String> par : agenda.entrySet()) {
				if (par.getValue().equalsIgnoreCase(nombre)) {
					retorno = par.getKey();
				}
			}
		}
			return retorno;
	}
	
	
	
	

}
