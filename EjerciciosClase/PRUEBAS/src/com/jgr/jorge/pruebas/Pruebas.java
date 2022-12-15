package com.jgr.jorge.pruebas;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// TODO: Auto-generated Javadoc
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
		List <Integer> lista =Stream.generate(()-> new Random()
				.nextInt())
				.limit(50)//10 elementos
				.collect(Collectors.toList());
	
		lista.forEach(System.out::println);

	}

}
