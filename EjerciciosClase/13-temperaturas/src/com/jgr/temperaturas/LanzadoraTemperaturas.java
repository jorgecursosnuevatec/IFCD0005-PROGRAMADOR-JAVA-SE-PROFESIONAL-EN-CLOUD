package com.jgr.temperaturas;

/**
 * The Class LanzadoraTemperaturas. dada una serie de temperaturas tenemos que
 * ver cuantas hay superiores a la media
 */
public class LanzadoraTemperaturas {

	public static void main(String[] args) {

		double[] tempera = { 23.7, 11.3, 18.4, 30.1, 28.5, 16.2 };

		double mediaTemp = 0;
		double acumTemp = 0;
		int totOcurr = tempera.length;

		for (int i = 0; i < tempera.length; i++) {
			acumTemp += tempera[i];

		}

		mediaTemp = acumTemp / totOcurr;

		System.out.println("ocurrencias array->" + totOcurr);
		System.out.println("totalTemp->" + acumTemp);
		System.out.println("media->" + mediaTemp);

		int contador = 0;

		for (int i = 0; i < tempera.length; i++) {

			contador += tempera[i] > mediaTemp ? 0 : 1;

		}

		// definimos variable con %numVariable$tipoDato
		System.out.printf("Hay %1$d ciudades de las cuales %2$d tienen temperatura superior a la media que es %3$.2f",
				totOcurr, contador, mediaTemp);

		// System.exit(0);

	}

}
