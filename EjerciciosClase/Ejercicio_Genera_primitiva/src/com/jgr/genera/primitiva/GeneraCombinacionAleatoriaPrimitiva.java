package com.jgr.genera.primitiva;


/**
 * The Class GeneraCombinacionAleatoriaPrimitiva.
 * Generar 6 numerosaleatorios que no se repitan entre el 1 y el 49
 * 
 */
public class GeneraCombinacionAleatoriaPrimitiva {

	public static void main(String[] args) {

		final int TOPE_APUESTAS = 6;
		int[] ganadora = new int[TOPE_APUESTAS];
		final int NUMERO_MAXIMO = 49;// Integer.MAX_VALUE;
		final int NUMERO_MINIMO = 1;// Integer.MIN_VALUE;
		boolean existe = false;
		int numApuestas = 0;
		int numero = 0;
		int contaveces = 0;

		do {
			numero = (int) (Math.random() * (NUMERO_MAXIMO - NUMERO_MINIMO) + NUMERO_MINIMO);
//			System.out.println("entro en do while numero generado->" + numero);
			existe = false;

			for (int i = 0; (i < ganadora.length && !existe && ganadora[i]!=0); i++) {

				if (ganadora[i] == numero) {
					existe = true;
//					System.out.println("existe ->" + numero + " en->" + ganadora[i]);
				}
			}

			if (!existe) {
				ganadora[numApuestas] = numero;
				numApuestas++;
				/*
				 * // System.out.println("tengo cargadas " + numApuestas); //
				 * System.out.println("*****GUARDADO " + numero);
				 */
			}
			/*
			 * else { System.out.println(" el numero existe->" + numero);
			 * 
			 * }
			 */
			contaveces++;

			if (contaveces > 500) {
				break;
			}

		} while (numApuestas < TOPE_APUESTAS);

		System.out.println("veces que ha hecho el bucle->" + contaveces);
		
		/*
		 * for (Integer numeroLoteria : ganadora) { System.out.println("ANTES ORDENAR->"
		 * + numeroLoteria); }
		 */

		int aux = 0;
		for (int i = 0; i < ganadora.length - 1; i++) {
			for (int j = 0; j < ganadora.length - i - 1; j++) {
				if (ganadora[j + 1] < ganadora[j]) {
					aux = ganadora[j + 1];
					ganadora[j + 1] = ganadora[j];
					ganadora[j] = aux;
				}
			}
		}

		for (Integer numeroLoteria : ganadora) {
			System.out.println("numero->" + numeroLoteria);

		}

	}

}
