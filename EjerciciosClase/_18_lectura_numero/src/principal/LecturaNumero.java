package principal;


import java.util.Scanner;

public class LecturaNumero {

	public static void main(String[] args) {
		//hacer un programa que pida un número y nos diga si el número es par o impar
		int num;
		//crear un objeto Scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce un número: ");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
	}

}
