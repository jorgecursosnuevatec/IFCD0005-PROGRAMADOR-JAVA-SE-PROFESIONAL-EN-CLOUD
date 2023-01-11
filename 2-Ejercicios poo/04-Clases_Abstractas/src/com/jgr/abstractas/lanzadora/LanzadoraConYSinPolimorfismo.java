package com.jgr.abstractas.lanzadora;

import com.jgr.clases.abstractas.modelo.Circulo;
import com.jgr.clases.abstractas.modelo.Figura;
import com.jgr.clases.abstractas.modelo.Triangulo;

/**
 * The Class LanzadoraConYSinPolimorfismo.
 * ejemplo clases CON Y SIN polimorfismo
 */
public class LanzadoraConYSinPolimorfismo {
	public static void main(String[] args) {

//asi tenemos que hacerlo de manera individual para cada uno		
		Circulo cir = new Circulo("Azul",4);
		Triangulo tri = new Triangulo("Verde",4,12);
		StringBuilder str=new StringBuilder();
		str.append("Circulo->").append(" color->").append(cir.getColor())
		.append(" superficie->").append(cir.superficie());
		System.out.println(str);		
		str.delete(0,str.length());
		System.out.println(str);
		
//como el metodo acepta FIGURA podemos usar cualquiera de las clases que 
//heredan de ella		
		imprimir(new Circulo("Azul",4));
		imprimir(new Triangulo("Verde",4,12));

	}
	
	
	static void imprimir(Figura f) {
		
		StringBuilder str=new StringBuilder();
		str.append("Figura->").append(" "+f.getClass().getSimpleName())
		.append(" color->").append(f.getColor())
		.append(" superficie->").append(f.superficie());		
		System.out.println(str);
		
		
		
	}

}
