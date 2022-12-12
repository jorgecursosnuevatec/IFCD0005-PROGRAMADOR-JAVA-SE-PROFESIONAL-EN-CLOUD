package com.jgr.clasestring;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * The Class Ejercicio.
 * realizar un programa que solicite la introducción de un texto y nos diga cuantas veces aparece la letra 'a' en ese texto
 */
public class Ejercicio {

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String caracter = "a";
		
		System.out.println("Introduce texto :" );
		String texto = sc.nextLine();
		
		int contador=0;
		
		for (int i=0;i<texto.length();i++) {
			
			
			if (texto.trim().substring(i, i+1).equalsIgnoreCase(caracter))
				contador++; 
			}	
		
		System.out.println("la letra a sale->"+ contador);
		sc.close();
		
		
		
		
		
		
		
		
		
	}

}
