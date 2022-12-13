package principal;

import java.util.Scanner;

public class Edades {

	public static void main(String[] args) {
		//solicita la introducción de cinco edades, las guarda en un array
		//y después muestra la media de edad
		int[] edades=new int[5];
		Scanner sc=new Scanner(System.in);
		//leemos las cinco edades
		for(int i=0;i<edades.length;i++) {
			System.out.println("intoduce edad: ");
			edades[i]=sc.nextInt();
		}
		//calculamos la media
		int media=0;
		for(int i=0;i<edades.length;i++) {
			media=media+edades[i];
		}
		media=media/edades.length;
		System.out.println(media);
	}

}
