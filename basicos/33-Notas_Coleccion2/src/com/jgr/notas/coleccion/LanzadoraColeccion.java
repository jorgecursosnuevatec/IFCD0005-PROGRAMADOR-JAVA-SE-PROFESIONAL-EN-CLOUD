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
 * saca nota media
 * nota mas baja
 * nota mas alta
 * media
 */
public class LanzadoraColeccion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean terminar = false;

		List<Integer> numeros = new ArrayList<>();
		int numero = 0;
		
		final int NUMERO_MAXIMO = 90000;// Integer.MAX_VALUE;
		final int NUMERO_MINIMO = 1;// Integer.MIN_VALUE;
		
		int aniadido=0;
		int media=0;
		int notaAlta=0;
		int notaBaja=0;
		int aprobados=0;
		do {

			System.out.println("Introduce nota");
			numero = sc.nextInt();

			if (numero >= 0 && numero<=10) {
				numeros.add(numero);
				aniadido++;
				media+=numero;
				notaAlta=numero>notaAlta?numero:notaAlta;
				notaBaja=(numero<notaBaja&&numero!=0)?notaBaja:numero;
				aprobados+=numero>=5?1:0;
			} else {
				terminar = true;
			}

		} while (!terminar);

		//numeros.forEach(System.out::println);
		numeros.sort((a,b)->a.compareTo(b));
		sc.close();
		/*
		System.out.println("nota Media->"+ (media/aniadido));
		System.out.println("aprobados->"+ aprobados);
		System.out.println("nota Alta->"+ notaAlta);
		System.out.println("nota Baja->"+ notaBaja);
		*/
		aniadido=0;
		media=0;
		notaAlta=0;
		notaBaja=10;
		aprobados=0;
		
		for (int i=0;i<numeros.size();i++) {
			numero=numeros.get(i);
			
			aniadido++;
			media+=numero;
			notaAlta=numero>notaAlta?numero:notaAlta;
			notaBaja=Math.min(notaBaja, numero);
			//notaBaja=(numero<notaBaja&&numero!=0)?notaBaja:numero;
			aprobados+=numero>=5?1:0;
			
		}
		
		System.out.println("nota Media2->"+ (media/aniadido));
		System.out.println("aprobados3->"+ aprobados);
		System.out.println("nota Alta4->"+ notaAlta);
		System.out.println("nota Baja5->"+ notaBaja);		
		
		/*
		long numAprobados= numeros.stream().filter(a->a>=5).count();
		System.out.println("Aprobados->" + numAprobados);
		
		*/
		/*
		
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
		
*/
		
		
		
		
		
		

	}

}
