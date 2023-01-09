package com.jgr.paquete;

/**
 * The Class Principal.
 */
public class Principal {

	/**
	 * The main method. sumatorio de los numeros comprendidos entre un rango
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int a = 90;
		int b = 33;
		int sumatorio = 0;

		if (b < a) {
			int temporal = 0;
			temporal =b;
			b = a;
			a = temporal;
		}

		System.out.println("valor a->"+a);
		System.out.println("valor b->"+b);
		
		for (int i = a; i <= b; i++) {

			sumatorio += i;

		}

		System.out.println("El resultado es->" + sumatorio);

	}

}
