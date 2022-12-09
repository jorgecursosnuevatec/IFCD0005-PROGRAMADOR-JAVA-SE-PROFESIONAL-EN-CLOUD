package com.jgr.paquete.pares;

/**
 * The Class Principal. 1.- Realizar un programa que nos diga cuantos números
 * pares hay entre 127 y 346
 * 
 */
public class Principal {

	private final static int limInferior = 127;
	private final static int limSuperior = 346;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		int contador = 0;
		for (int i = limInferior; i < limSuperior; i++) {
			if (i % 2 == 0) {
				contador++;
				}
		}
		
		System.out.println("Hay " + contador + " numeros pares entre "+ limInferior +" y "+limSuperior);

	}

}
