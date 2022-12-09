package com.jgr.paquete.num.mayor;

import javax.swing.JOptionPane;

public class LanzadoraNumMayor {

	public static void main(String[] args) {

		int[] numeros;
		int numero_maximo = Integer.MAX_VALUE;
		int numero_minimo = Integer.MIN_VALUE;
		numeros = new int[5];

		for (int i = 0; i < 5; i++) {

			numeros[i] = (int) (Math.random() * (numero_maximo + 1 - numero_minimo)) + numero_minimo;

		}

		String numeroStr = (String) JOptionPane.showInputDialog(null, "Numero",
				"Num mayores entre " + numero_minimo + " y " + numero_maximo, JOptionPane.INFORMATION_MESSAGE, null,
				null, null);

		try {

			int numero = Integer.parseInt(numeroStr);
			int contador = 0;

			for (int i = numero; i < numero_maximo; i++) {

				contador++;
			}

			String resultado = "Hay " + contador + " numeros mayores";
			JOptionPane.showMessageDialog(null, resultado);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error", numeroStr + " no es un numero valido",
					JOptionPane.ERROR_MESSAGE);

		}
		 

	}

}
