package com.jgr.leer.pares;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Class Lanzadora.
 * aceptar 5 numeros pares y calcular la media
 */
public class Lanzadora {

	public static void main(String[] args) {
		int media = 0;
		Scanner sc = new Scanner(System.in);
		int[] pares = new int[5];
		int num; // aquí guardamos número leído
		/*
		 * for(int i=0;i<pares.length;i++) { System.out.println("Introduce un par");
		 * num=sc.nextInt(); //si es par se guarda if(num%2==0) { pares[i]=num; }else {
		 * 
		 * } }
		 */
		int validos = 0; // esta variable lleva la cuenta de los pares leídos
		while (validos < pares.length) {
			System.out.println("Introduce un par");
			num = sc.nextInt();
			// si es par se guarda y como hay un nuevo par, se incrementa la variable
			if (num % 2 == 0) {
				pares[validos] = num;
				validos++;
			}
		}
		// media de los números que tenemos en el array
		for (int i = 0; i < pares.length; i++) {
			media = media + pares[i];
		}

		media = media / pares.length;
		System.out.println("La media de números es: " + media);

		List<Integer> enteros = Arrays.stream(pares).boxed().collect(Collectors.toList());

		System.out.println("media->" + Arrays.stream(pares).average()

				);

	}

}
