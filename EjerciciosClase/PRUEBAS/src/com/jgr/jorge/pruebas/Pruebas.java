package com.jgr.jorge.pruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The Class Pruebas.
 */
public class Pruebas {

	
	public static void main(String[] args) {
		
		String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
		String CHAR_UPPER = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
		String CHAR_TODO = CHAR_LOWER+CHAR_UPPER;
        char[] characterArray = CHAR_TODO.toCharArray();
    	List<String> listaLetras = new ArrayList<>();
		final int LIMITE = 10;
    	
    	Map<Integer, Object> mapa = new HashMap<>();

        for(char c : characterArray)//iterating through the character array
        	listaLetras.add(String.valueOf(c));
        
		//listaLetras.forEach(System.out::println);
		
        List<Integer> listaEnteros = IntStream.iterate(1, i -> i + 1).limit(listaLetras.size()).boxed()
				.collect(Collectors.toList());
        
//        System.out.println("letras->"+listaLetras.size());
//        System.out.println("numeros->"+listaEnteros.size());
        
		for (int i = 0; i < listaLetras.size(); i++) {
			mapa.put(listaEnteros.get(i), listaLetras.get(i));
		}

		for (Entry<Integer, Object> par : mapa.entrySet()) {
			System.out.println("clave->" + par.getKey());
			System.out.println("valor->" + par.getValue());

		}
		 
	}

}
