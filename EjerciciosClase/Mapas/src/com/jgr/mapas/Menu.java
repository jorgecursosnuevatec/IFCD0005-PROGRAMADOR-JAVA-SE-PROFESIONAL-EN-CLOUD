package com.jgr.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
	
	static String nombre;
	static int nota;
					
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> notas = new HashMap<>();
		Auxiliar aux = new Auxiliar();

		int opcion = 0;

		do {
			mostrarMenu();
			opcion = sc.nextInt();// lee la opción elegida
			
			switch (opcion) { // evaluamos
			case 1:
				if(aux.altaTlf(pedirTlf(), pedirNombre())) {
					System.out.println("alta realizada correctamente");
				}else {
					System.out.println("Telefono ducplicado");
				}
				break;
				
			case 2:
				aux.buscarNombre();
				break;
			case 3:
//				mostrarAprobados();
				break;
			case 4:
//				mostrarExtremas();
				break;
			case 5:
//				mostrarTodas();
			}
		} while (opcion != 6);

	}

	static void mostrarMenu() {
		System.out.println("1.- Grabar nota");
		System.out.println("2.- Buscar por Nombre");
		System.out.println("3.- Aprobados");
		System.out.println("4.- Notas extremas");
		System.out.println("5.- Mostrar todas");
		System.out.println("6.- Salir");
	}

	static int pedirTlf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tlf");
		nota = sc.nextInt();
		sc.close();
		return nota;
	}

	static String pedirNombre() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre");
		nombre = sc.nextLine();
		sc.close();
		return nombre;
	}
}