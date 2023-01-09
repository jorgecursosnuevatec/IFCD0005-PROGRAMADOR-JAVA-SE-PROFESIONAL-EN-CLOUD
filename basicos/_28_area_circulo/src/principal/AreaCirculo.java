package principal;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		//solicitar el radio de un circulo y mostrar su área
		Scanner sc=new Scanner(System.in);
		int radio;
		double area;
		System.out.println("Introduce radio:");
		radio=sc.nextInt();
		area=Math.PI*Math.pow(radio, 2);
		//System.out.println("El área es: "+area);
		System.out.printf("El área es: %1.2f",area);
	}

}
