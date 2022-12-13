package com.jgr.busca.joven.lista;

/**
 * The Class BuscaElMasJoven. 10.- Tenemos la siguiente variable String: String
 * data="Carlos-25,Marta-34,Alex-31,Mónica-19,Marcos-27"; Hacer un programa que
 * nos muestre el nombre de la persona más joven
 */
public class BuscaElMasJoven {

	public static void main(String[] args) {

		String datos = "Carlos-25,Marta-34,Alex-31,Monica-19,Marcos-27";
		String reg = "\\-|,";

		String[] cadenaFormateada = datos.split(reg);
		int numeroAnt = 0;
		int posicion = 0;

		for (int i = 0; i < cadenaFormateada.length; i++) {
			// System.out.println("posicion->"+i+ "-"+ cadenaFormateada[i]);
			// en los pares va el nombre
			if (i % 2 == 0) {
				System.out.println("numero Par->" + cadenaFormateada[i]);
			}
			// al hacer el split en los pares se queda el nombre y en los impares el numero
			if (i % 2 != 0) {
				if (Integer.parseInt(cadenaFormateada[i]) > numeroAnt) {
					numeroAnt = Integer.parseInt(cadenaFormateada[i]);
					posicion = i;
				}
			}

		}
		System.out.println("El mayor es->" + cadenaFormateada[posicion - 1]);

	}

}
