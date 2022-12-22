package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	//realiza un programa que solicite la intorucción de dos números
	//y muestre el resultado de dividir uno entre otros
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1, n2, div;
		System.out.println("Introduce un número");
		try {
			n1=sc.nextInt();
			System.out.println("Introduce otro número");
			n2=sc.nextInt();
			div=n1/n2;
			System.out.println("La división es "+div);
		}
		
		/*catch(ArithmeticException ex) {
			System.out.println("No se permiten divisiones por 0");
		}
		catch(InputMismatchException ex) {
			System.out.println("Debes introducir solo caracteres numéricos");
		}*/
		//multicatch
		catch(ArithmeticException|InputMismatchException ex) {
			System.out.println("Operación o dato incorrecto");
		}
		catch(Exception ex) {
			System.out.println("Error inesperado!");
		}

		
	}

}
