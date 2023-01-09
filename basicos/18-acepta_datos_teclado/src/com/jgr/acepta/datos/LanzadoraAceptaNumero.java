package com.jgr.acepta.datos;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * The Class LanzadoraAceptaNumero.
 * acepta numero y nos dice si el numero es par/impar
 */
public class LanzadoraAceptaNumero {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("mete el numero:" );
		
		try {
			
			//int numero= Integer.parseUnsignedInt(datos);
			var datos = sc.nextInt();
			
			System.out.println("el numero " + datos + " es "
					+ (datos%2==0?" par": " impar" ));
			
		}catch( InputMismatchException j) {
			
			System.out.println("Eso no es un numero->"+ j);
			System.out.println("Eso no es un numero->"+ j.getCause());
			System.out.println("Eso no es un numero->"+ j.getStackTrace());
			System.out.println("Eso no es un numero->"+ j.fillInStackTrace());
		}
		
		
		
		
		
	}
	

}
