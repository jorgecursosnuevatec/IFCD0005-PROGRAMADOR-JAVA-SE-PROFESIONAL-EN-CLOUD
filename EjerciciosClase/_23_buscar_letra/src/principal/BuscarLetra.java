package principal;

import java.util.Scanner;

public class BuscarLetra {
	//Pide un texto y nos dice cuantas vocales tiene
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce texto");
		String texto=sc.nextLine();
		texto=texto.toLowerCase();//convertimos todo a minúscula
		int contador=0;
		for(int i=0;i<texto.length();i++) {
			switch(texto.charAt(i)) {
				case 'a','e','i','o','u':
					contador=contador+1;
			}
		}
		System.out.println(contador);
	}

}
