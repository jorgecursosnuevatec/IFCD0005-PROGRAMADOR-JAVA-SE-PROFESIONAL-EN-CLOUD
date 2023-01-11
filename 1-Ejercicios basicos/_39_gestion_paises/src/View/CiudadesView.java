package View;

import java.util.ArrayList;
import java.util.Scanner;

import model.Ciudad;
import service.CiudadesService;

/*
1.- Añadir ciudad
2.- Ciudad más poblada
3.- Ciudades por pais
3.- Salir

Cada ciudad contiene nombre, habitantes y pais
La opción 3, te pide el nombre del pais y te muestra los datos de todas la ciudades que pertenecen a ese pais*/


public class CiudadesView {

	static CiudadesService ciudadesService = new CiudadesService();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			opcion=Integer.parseInt(sc.nextLine());  // lee opcion elegida
			switch(opcion) {      // evaluamos
			case 1:
				añadirCiudad();
				break;
			case 2:
				masPoblada();
				break;   
			case 3:
				ciudadesPais();
				break;
			
			case 4: System.out.println("--- Adios ---");
			}
		}while(opcion!=4);

	}
	static void mostrarMenu() {
		System.out.println("1.- Nueva ciudad: ");
		System.out.println("2.- Saber cual es la ciudad más poblada: ");
		System.out.println("3.- Saber ciudades por pais: ");
		System.out.println("4.- Salir"); 
	}	
	
	static void añadirCiudad () {
		String nombre;
		int habitantes;
		String pais;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cúal es el nombre de la nueva ciudad: ?");
		nombre=sc.nextLine();
		System.out.println("¿Cuántos habitantes tiene: ?");
		habitantes=Integer.parseInt(sc.nextLine());
		System.out.println("¿A qué país pertenece: ?");
		pais=sc.nextLine();
		ciudadesService.nuevaCiudad(nombre, habitantes, pais);		
	}
	
	static void masPoblada () {
		Ciudad ciudad = ciudadesService.ciudadMasPoblada();
		System.out.println("La ciudad más poblada es "+ciudad.getNombre()+ " que está en "+ciudad.getPais()+" y tiene "+ciudad.getHabitantes()+ " habitantes.");
	}
	
	static void ciudadesPais() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce pais: ");
		ArrayList <Ciudad> arrayciudades = ciudadesService.ciudadesPorPais(sc.nextLine());
		System.out.println("Las ciudades son: ");
		for ( int i=0;i<arrayciudades.size();i++) {
			System.out.println(arrayciudades.get(i).getNombre());
			
		}
	}
}
