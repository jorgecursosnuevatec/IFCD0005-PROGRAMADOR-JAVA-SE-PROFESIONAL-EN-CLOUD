package com.jgr.verificar;


/**
 * The Class Principal.
 */
public class Principal {


	public static void main(String[] args) {
		
		String cadena = "Java básico,Python,JavaEE,Angular 10,Big Data";
		
		String separador =",";
		String palabraBuscar ="Java";
		
		int contador = 0;
		
		String[] arrayCursos = cadena.split(separador);
		
		
		
		for(int i=0;i<arrayCursos.length;i++) {
			
			
			//if (arrayCursos[i].startsWith(palabraBuscar)) {contador++;}
			
			contador=arrayCursos[i].startsWith(palabraBuscar)?++contador:contador;
			
			
			
		}
		System.out.println("En la cadena java sale "+contador + " veces");


	}

}
