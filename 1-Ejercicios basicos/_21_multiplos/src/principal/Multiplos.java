package principal;

import java.util.Scanner;

public class Multiplos {
	//Realizar un programa que lea 5 números. Después, el programa analizará cada número y 
	//nos dirá si es múltiplo de 2, de 3, de 5 o de ninguno de ellos
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		for(int i=1;i<=5;i++) {
			//lee el número y lo guarda en la variable
			System.out.println("Introduce número");
			num=sc.nextInt();
			if(num%2==0) {//si multiplo de 2
				System.out.println("múltiplo de 2");
				continue; //leemos siguiente
			}
			if(num%3==0) {//si multiplo de 3
				System.out.println("múltiplo de 3");
				continue;
			}
			if(num%5==0) {//si multiplo de 5
				System.out.println("múltiplo de 5");
				continue;
			}
			System.out.println("No es múltiplo de ninguno");
		}
		System.out.println("Hemos terminado");
	}

}
