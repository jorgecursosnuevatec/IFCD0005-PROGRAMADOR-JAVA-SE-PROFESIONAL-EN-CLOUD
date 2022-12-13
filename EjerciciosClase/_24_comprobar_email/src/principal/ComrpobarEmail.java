package principal;

import java.util.Scanner;

public class ComrpobarEmail {
	/*Realizar un programa que solicite la introducción de una dirección de correo electrónico, 
	y nos indique si es o no válida (tiene que tener @ y .)*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String email;
		System.out.println("Introduce un email");
		email=sc.nextLine();
		if(email.indexOf("@")!=-1&&email.indexOf(".")!=-1) {//si pos !=-1 significa que contiene ese caracter
			System.out.println("Email válido");
		}else {
			System.out.println("Email no válido");
		}
	}

}
