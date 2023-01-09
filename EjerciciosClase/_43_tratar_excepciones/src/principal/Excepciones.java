package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2 , div;
		System.out.println("Introduce un numero: " );
		try {
			n1= sc.nextInt();
			System.out.println("Introduce otro numero: ");
			n2=sc.nextInt();
			div=n1/n2;
			System.out.println("La dicision es "+div);
		}
		catch (ArithmeticException ex) {
			System.out.println("No se permite dividir por cero");
			
		}
		catch (InputMismatchException ex) {
			System.out.println("Necesitamos que sea un número");
		}

	}

}
