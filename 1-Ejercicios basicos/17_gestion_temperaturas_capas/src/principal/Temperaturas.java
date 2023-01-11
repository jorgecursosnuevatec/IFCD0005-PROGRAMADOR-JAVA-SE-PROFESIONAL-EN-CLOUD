package principal;

import java.util.ArrayList;
import java.util.Scanner;

import model.Ciudad;
import service.TemperaturasService;

public class Temperaturas {

	
	public static void main(String[] args) {
		//creamos un objeto de la capa de servicio
		TemperaturasService service=new TemperaturasService();
        Scanner sc=new Scanner(System.in);
        int op;//opcion elegida
        do{
           menu();
           op=sc.nextInt();
           switch(op){
               case 1:                  
                   altaTemperatura(service);
                   break;
               case 2:
                   System.out.println("Temperatura media "+service.media());
                   break;
               case 3:
                   System.out.println("ciudad con temperatura más alta: "+service.mayor().getNombre());
                   System.out.println("ciudad con temperatura más baja: "+service.menor().getNombre());
                   break;
               case 4:
            	   mostrarTemperaturas(service);
                   break;
               case 5:
            	   break;
               default:
                   System.out.println("debes escribir una opción válida");
           }
        }while(op!=5);
    }
	static void menu() {
		System.out.println("1.- Nueva ciudad");
        System.out.println("2.- Temperatura Media");
        System.out.println("3.- Extremas");
        System.out.println("4.- Mostrar todas");
        System.out.println("5.- Salir");
	}
    
	static void altaTemperatura(TemperaturasService service) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nombre ciudad: ");
		String nombre=sc.nextLine();
		System.out.println("Temperatura ciudad: ");
		double temp=Double.parseDouble(sc.nextLine());
		Ciudad ciudad=new Ciudad(nombre,temp);
		if(service.agregarCiudad(ciudad)) {
			System.out.println("Ciudad añadida");
		}else {
			System.out.println("Ciudad repetida, prueba otra opción");
		}
	}
	static void mostrarTemperaturas(TemperaturasService service) {
		Ciudad[] ciudades=service.devolverCiudades();
		for(Ciudad ciudad:ciudades) {
			System.out.println(ciudad.getNombre()+"-"+ciudad.getTemperatura());
		}
	}
}
