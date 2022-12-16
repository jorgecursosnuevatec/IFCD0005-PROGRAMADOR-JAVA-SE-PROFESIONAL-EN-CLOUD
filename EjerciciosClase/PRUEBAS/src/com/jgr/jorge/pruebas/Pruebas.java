package com.jgr.jorge.pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



/**
 * The Class Pruebas.
 */
public class Pruebas {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		final int NUMERO_MAXIMO = 5;// Integer.MAX_VALUE;
		final int NUMERO_MINIMO = 1;// Integer.MIN_VALUE;
		
		
		 List <Integer> listaEnteros = new ArrayList<>();
		 
		 for (int i=0;i<10;i++) {
			 listaEnteros.add(i);
			 listaEnteros.add(i);
		 }
		 
		 listaEnteros.forEach(System.out::println);
		 listaEnteros.removeIf(p->p==2);
		 System.out.println("\n despues");
		 listaEnteros.forEach(System.out::println);
	}

}
