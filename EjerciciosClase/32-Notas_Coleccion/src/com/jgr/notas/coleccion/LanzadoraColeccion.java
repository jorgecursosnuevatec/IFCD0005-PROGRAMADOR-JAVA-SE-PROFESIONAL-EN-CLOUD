package com.jgr.notas.coleccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * The Class LanzadoraColeccion.
 * 
 * solicita la introduccion de una nota y guardarla
 * si es positiva la guarda y pide otra mas
 * si es negativa no la guarda y termina
 */
public class LanzadoraColeccion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean terminar = false;

		List<Integer> numeros = new ArrayList<>();
		int numero = 0;
		
		final int NUMERO_MAXIMO = 90000;// Integer.MAX_VALUE;
		final int NUMERO_MINIMO = 1;// Integer.MIN_VALUE;
		
		
		
		/*

		do {

			System.out.println("Introduce nota");
			numero = sc.nextInt();

			if (numero >= 0) {
				numeros.add(numero);
			} else {
				terminar = true;
			}

		} while (!terminar);

		//numeros.forEach(System.out::println);
//		numeros.sort((a,b)->a.compareTo(b));
		sc.close();
		*/
		
		for(int i=0;i<25;i++) {
			numeros.add((int) (Math.random() * (NUMERO_MAXIMO - NUMERO_MINIMO) + NUMERO_MINIMO));
			
		}
		
		Stream<Integer> streamNumeros= 
				numeros.stream()
				.filter(a->a>910)
				.map(a->a*a)
				//.peek(a->System.out.println("antes del distinct->"+a))
				.distinct()
				//.peek(a->System.out.println("despues del distinct->"+a))
				;
		
		
		Stream<Byte> enBytes=streamNumeros 
		.sorted().flatMap(a->{
			return Stream.of(a.byteValue());
					}
		);
		
		enBytes.forEach(System.out::println);
		

		
		
		
		
		
		

	}

}
