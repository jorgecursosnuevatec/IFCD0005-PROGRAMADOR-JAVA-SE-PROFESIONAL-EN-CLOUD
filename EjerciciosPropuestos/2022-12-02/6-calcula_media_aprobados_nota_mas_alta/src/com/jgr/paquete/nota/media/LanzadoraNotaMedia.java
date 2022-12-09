package com.jgr.paquete.nota.media;

public class LanzadoraNotaMedia {

	public static void main(String[] args) {
		int[] numeros;
		int numero_maximo = 0;
		int numero_minimo = 10;
		final int limite =15;
		final int minAprobado=5;
		
		numeros = new int[15];

		for (int i = 0; i < limite; i++) {

			numeros[i] = (int) (Math.random() * (numero_maximo + 1 - numero_minimo)) + numero_minimo;
			System.out.println("numeros:"+ numeros[i]);

		}
		
		int notaMedia=0;
		int aprobados=0;
		int notaAlta=0;
		
		for (int i=0;i<limite;i++) {
			
			notaAlta=(numeros[i]>notaAlta)?numeros[i]:notaAlta;			
			notaMedia+=numeros[i];
			aprobados=(numeros[i]>=minAprobado)?++aprobados:aprobados;
		}
		
		
		System.out.println("nota mas alta->"+notaAlta);
		System.out.println("aprobados->"+aprobados);
		System.out.println("media->"+ Double.valueOf(notaMedia/limite));
		


	}

}
