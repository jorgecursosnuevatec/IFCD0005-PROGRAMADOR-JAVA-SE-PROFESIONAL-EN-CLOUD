package com.jgr.numeros.pares;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * The Class LeeParesTeclado.
 * Realizar un programa que lea 5 números pares del teclado. Si alguno de los números
introducidos no es par, se volverá a solicitar, así hasta conseguir 5 pares. Después, el programa
mostrará la media de los números introducidos.
 */
public class LeeParesTeclado {


	public static void main(String[] args) {
		
		
		int[] numerosQueVanATocar;	
		final int NUMERO_APUESTAS =6;
		//int dato=0;
		int guardadas=0;
		int numero=0;

		Scanner sc = new Scanner(System.in);		
		numerosQueVanATocar = new int[NUMERO_APUESTAS];		
		
		do {
			System.out.println("Introduce un numero entero PAR->");			
			numero = sc.nextInt();
			
			if(numero%2==0) {
				numerosQueVanATocar[guardadas] = numero;
				guardadas++;
			}else {
				System.out.println("Ese numero NO es par, te faltan aun "+ (NUMERO_APUESTAS - guardadas));
			}
			
		}while(guardadas<NUMERO_APUESTAS);
		sc.close();
		
		IntStream intStream= Arrays.stream(numerosQueVanATocar);
		
		System.out.println("La media es->" +intStream.mapToDouble(p->p).average().orElse(0));
		

	}

}
