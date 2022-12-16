package com.jgr.mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * The Class HashMapMapas.
 */
public class HashMapMapas {

	
	public static void main(String[] args) {
		
		final int LIMITE = 10;
		/**
		SecureRandom random = new SecureRandom();
		String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
		String CHAR_UPPER = CHAR_LOWER.toUpperCase();
		String NUMBER = "0123456789";
		String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;

		Map<Integer, Object> mapa = new HashMap<>();

		List<Integer> listaEnteros = IntStream.iterate(1, i -> i + 1).limit(LIMITE).boxed()
				.collect(Collectors.toList());

		List<String> listaAleatoria = new ArrayList<>();
		int codigoAscii = 0;
		StringBuilder cadena = new StringBuilder();
		int caracter;

	
		for (int i = 0; i < LIMITE; i++) {
			cadena = new StringBuilder();

			for (int j = 0; j < LIMITE; j++) {

				caracter = (int) Math.floor(Math.random() * (122 - 97) + 97);

				cadena.append(String.valueOf((char) caracter));

			}

			listaAleatoria.add(cadena.toString());

		}
		 
		
		
		//listaAleatoria.forEach(System.out::println);

		for (int i = 0; i < LIMITE; i++) {

			mapa.put(listaEnteros.get(i), listaAleatoria.get(i));
		}
		
		
		

		for (Map.Entry<Integer, Object> par : mapa.entrySet()) {

			System.out.println("\nClave->" + par.getKey());
			System.out.println("Valor->" + par.getValue());

		}
		
		*/
		String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        char[] characterArray = CHAR_LOWER.toCharArray();
    	List<String> listaLetras = new ArrayList<>();
    	
    	Map<Integer, Object> mapa = new HashMap<>();

        for(char c : characterArray)//iterating through the character array
        	listaLetras.add(String.valueOf(c));
        
		
        List<Integer> listaEnteros = IntStream.iterate(1, i -> i + 1).limit(LIMITE).boxed()
				.collect(Collectors.toList());
        
		
		Set<Integer> indices= mapa.keySet();
		
		indices.forEach(System.out::println);
		
		Collection<Object> col=mapa.values();
		
	
		 
	}

}
