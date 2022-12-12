package com.jgr.clasestring;

import java.util.Scanner;

/**
 * The Class BuscaCadena.
 * si tiene @.
 */
public class BuscaCadena {

	
	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("Introduce texto :" );
		String texto = sc.nextLine();
		texto=texto.trim();
		
		String textoBusca="@.";
		
		int buscarroba =texto.indexOf("@"); 
		System.out.println("buscarroba->" + buscarroba);
		
		System.out.println("texto buscarroba->"+ texto.substring(buscarroba));
		System.out.println("texto buscarroba+1->"+ texto.substring(buscarroba+1,buscarroba+2));
		
		if (buscarroba>=0 && texto.substring(buscarroba+1, buscarroba+2).equals(".")) {
			System.out.println("Si es un email");		
			
		}
		
		if(texto.indexOf("@")!=-1&&texto.indexOf(".")!=-1) {//si pos !=-1 significa que contiene ese caracter
			System.out.println("Email válido");
		}else {
			System.out.println("Email no válido");
		}
		
		
		String dividido[] = texto.split(textoBusca);
		
		System.out.println("tamanio string->" + dividido.length);
		
		for (int i = 0;i<dividido.length;i++) {
			System.out.println(dividido[i]);
			
		}
		sc.close();
				

	}

}
