package ejercicios.area;

import java.util.Scanner;

/**
 * The Class ClaseMath.
 * pide radio y muestra el area
 */
public class ClaseArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio:");
		var dato=sc.nextInt();
		
		System.out.println("El radio es->" + dato * Math.PI);

		
	}	

}
