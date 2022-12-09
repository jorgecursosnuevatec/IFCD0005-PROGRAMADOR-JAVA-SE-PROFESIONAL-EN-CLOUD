package com.jgr.numeros.suma;

/**
 * The Class NumerosSuma. cuantos numeros tenemos que sumar hasta que superemos
 * 1000?;
 */
public class NumerosSuma {
	public static void main(String[] args) {

		int n = 0;
		int suma = 0;

		while (suma <= 1000) {

			n++;
			suma += n;

			System.out.println("dentro bucle n->" + n);
			System.out.println("dentro bucle suma->" + suma);

		}

		System.out.println("Valor de n->" + n);
		System.out.println("Valor de j->" + suma);

	}

}
