package view;

import java.util.Scanner;

import model.Contacto;
import service.AgendaService;

public class AgendaMain {
	static AgendaService agendaService=new AgendaService();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
				case 1:
					pedirContacto();
					break;
				case 2:
					buscarContacto();
					break;
				case 3:
					eliminarContacto();
					break;
				case 4:
					mostrarNombres();
					break;
				
				case 5:
					System.out.println("---Adios---");
			}
		}while(opcion!=5);
	}
	static void mostrarMenu() {
		System.out.println("1.- Nuevo contacto");
		System.out.println("2.- Buscar contacto");
		System.out.println("3.- Eliminar contacto");
		System.out.println("4.- Mostrar nombres");
		System.out.println("5.- Salir");
		
	}
	static void pedirContacto() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce número de teléfono");
		int telefono=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce nombre");
		String nombre=sc.nextLine();
		System.out.println("Introduce mail");
		String email = sc.nextLine();
		System.out.println("Introduce edad");
		int edad=Integer.parseInt(sc.nextLine());
		
		
//		agendaService.guardarContactonombre=(telefono,new Contacto());
	}
	static void buscarContacto() {
		Scanner sc=new Scanner(System.in);
		int numero;
		Contacto contacto;
		System.out.println("Introduce número de teléfono");
		numero=sc.nextInt();
		contacto=agendaService.buscarContacto(numero);
		System.out.println(contacto.getNombre()+"-"+contacto.getEmail()+"-"+contacto.getEdad());
	}
	static void eliminarContacto() {
		Scanner sc=new Scanner(System.in);
		int numero;
		System.out.println("Introduce número de teléfono");
		numero=sc.nextInt();
		agendaService.eliminarContacto(numero);
	}
	static void mostrarNombres() {
		String[] nombres=agendaService.nombres();
		for(String n:nombres) {
			System.out.println(n);
		}
	}
}
