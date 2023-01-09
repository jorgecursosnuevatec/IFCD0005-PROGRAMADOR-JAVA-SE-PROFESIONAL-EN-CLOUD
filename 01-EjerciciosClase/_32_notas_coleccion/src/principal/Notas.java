package principal;

import java.util.ArrayList;
import java.util.Scanner;

//Realizar un programa que solicite al usuario la introducción de una nota, si la nota el positiva
//la guarda y le pide la introducción de una nueva nota, si es negativa, no la guarda, no 
//pide mas notas, y muestra las notas guardadas hasta el momento
public class Notas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> notas=new ArrayList<>();
		int nota;
		do {
			//lee una nota y la guardas en el arraylist
			System.out.println("Introduce nota ");
			nota=sc.nextInt();
			//solo guarda la nota si está entre 0 y 10
			if(nota>=0&&nota<=10) {
				notas.add(nota);
			}
		}while(nota>=0);//si la nota es positiva, vuelve a pedir otra
		//mostrar todas las notas
		for(int i=0;i<notas.size();i++) {
			System.out.println(notas.get(i));
		}
	}

}
