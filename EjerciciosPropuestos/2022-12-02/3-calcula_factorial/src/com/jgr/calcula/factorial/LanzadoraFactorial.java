package com.jgr.calcula.factorial;

import java.util.Scanner;

/**
 * The Class Lanzadora. 2.- Hacer un programa que dado un número que se
 * encuentra en una variable, calcule el factorial de dicho número
 * (multiplicación todos los números entre 1 y dicho número)
 * 
 */
public class LanzadoraFactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Mete el numero para calcular el factorial:");

		try {
			int datoEntrada = Integer.parseInt(sc.nextLine().trim());
			int i = 1;

			int acumulador = (datoEntrada <= 0 || datoEntrada == 1) ? 1 : datoEntrada;

			do {
				acumulador *= i;
				i++;

			} while (i < datoEntrada);
			System.out.println("El factorial de " + datoEntrada + " es " + acumulador);

		}

		catch (NumberFormatException e) {
			System.out.println("no es un numero");
		}

		sc.close();

	}

}
