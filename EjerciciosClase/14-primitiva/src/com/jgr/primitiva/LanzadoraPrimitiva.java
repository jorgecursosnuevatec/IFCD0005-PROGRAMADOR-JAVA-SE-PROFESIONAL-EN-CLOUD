package com.jgr.primitiva;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Class LanzadoraPrimitiva. Dada una combinacion de numeros verifica
 * cuantos has acertado y el premio que nos ha tocado
 */
public class LanzadoraPrimitiva {

	public static void main(String[] args) {

		int[] ganadora;
		int numero_maximo = 0;// Integer.MAX_VALUE;
		int numero_minimo = 45;// Integer.MIN_VALUE;
		ganadora = new int[6];

		int[] jugada;
		jugada = new int[6];

		for (int i = 0; i < ganadora.length; i++) {
			ganadora[i] = (int) (Math.random() * (numero_maximo + 1 - numero_minimo)) + numero_minimo;

		}

		for (int i = 0; i < jugada.length; i++) {
			jugada[i] = (int) (Math.random() * (numero_maximo + 1 - numero_minimo)) + numero_minimo;

		}

		int contadorAciertos = 0;

		for (int i = 0; i < ganadora.length && i < jugada.length; i++) {

			contadorAciertos = ganadora[i] == jugada[i] ? 1 : 0;

		}

		System.out.println("combinacion ganadora");
		List<?> listaGanadora = Arrays.stream(ganadora).mapToObj(i -> i).collect(Collectors.toList());
		listaGanadora.forEach(System.out::println);
		System.out.println("combinacion jugada");
		List<?> listaJugada = Arrays.stream(jugada).mapToObj(i -> i).collect(Collectors.toList());
		listaJugada.forEach(System.out::println);

		System.out.println("Aciertos->" + contadorAciertos);

		int[] premios = { 0, 0, 8, 200, 35000, 150000 };

		contadorAciertos = contadorAciertos == 0 ? 1 : contadorAciertos--;

		//buscando el premio en el array usando el numero de aciertos como indice
		System.out.println("El premio es->" + premios[contadorAciertos]);

	}

}
