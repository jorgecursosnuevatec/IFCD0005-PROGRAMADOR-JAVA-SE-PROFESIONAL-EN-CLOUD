package com.jgr.ejercicio.herencia.polimorfismo.lanzadora;




/**
 * The Class LanzadoraClaseNumerica.
 * 
 * ejecuta clasenumerica ,se le pasa un numero y devuelve el valor decimal
 */
public class LanzadoraClaseNumerica {

	
	public static void main(String[] args) {
		
		double d = 20.20d;		
		imprimeNumero(d);		
		var l= 555599999999999999L;
		imprimeNumero(l);	
		var f = 344444.999995f;
		imprimeNumero(f);
		byte b =55;
		imprimeNumero(b);
		

	}
	
	static void imprimeNumero(Number numero) {
		
		System.out.println("valor->"+ numero.intValue());
		
	}
	

}
