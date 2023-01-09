package com.jgr.edades.teclado;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The Class LanzadoraEdades.
 * acepta una lista de edades
 * 
 */
public class LanzadoraEdades {

	
	public static void main(String[] args) {
		
		final int MAX_EDADES = 5;
		int [] edades = new int[MAX_EDADES];
		int acumulador=0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tienes que meter 5 edades ");
		
		for (int i=0;i<MAX_EDADES;i++) {
			
			System.out.println("Introduce edad " +(i+1) );
			
			try {
				
				//int numero= Integer.parseUnsignedInt(datos);
				var datos = sc.nextInt();
				edades[i] = datos;
				acumulador+=datos;
			}catch( InputMismatchException j) {
				
				System.out.println("Eso no es un numero->"+ j);
				System.out.println("Eso no es un numero->"+ j.getCause());
				System.out.println("Eso no es un numero->"+ j.getStackTrace());
				System.out.println("Eso no es un numero->"+ j.fillInStackTrace());
			}
			
		}
		int media= acumulador/MAX_EDADES;
		
		// definimos variable con %numVariable$tipoDato
		System.out.printf("Has introducido %1$d edades y la media es %2$2d",
				MAX_EDADES, media);

		
		

	}

}
