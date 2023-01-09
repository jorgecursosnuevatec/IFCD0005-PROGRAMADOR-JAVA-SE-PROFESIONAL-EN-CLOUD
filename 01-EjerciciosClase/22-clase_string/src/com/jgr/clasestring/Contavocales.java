package com.jgr.clasestring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * cuenta las vocales que aparecen
 */
public class Contavocales {
	
	
	public static void main(String[] args) {
		
		int contaA=0;
		int contaE=0;
		int contaI=0;
		int contaO=0;
		int contaU=0;
		
		System.out.println("Mete el texto->");
		Scanner sc=new Scanner(System.in);
		
		String texto = sc.nextLine();
		
		List<char[]> cadena = new ArrayList<>();
		
		cadena = Arrays.asList(texto.trim().toCharArray());
				
		for (int i = 0; i < texto.length(); i++) {


			
			switch (texto.charAt(i)) {
			case 'a':
				contaA++;
				break;
			case 'e':
				contaE++;
				break;
			case 'i':
				contaI++;
				break;
			case 'o':
				contaO++;
				break;
			case 'u':
				contaU++;
				break;

			}
		}
		
		System.out.printf("La A sale %1$d veces, la E %2$d, la I %3$d,la O %4$d y la U %5$d", 
				contaA, contaE, contaI, contaO,contaU);
		
		sc.close();

	}

}
