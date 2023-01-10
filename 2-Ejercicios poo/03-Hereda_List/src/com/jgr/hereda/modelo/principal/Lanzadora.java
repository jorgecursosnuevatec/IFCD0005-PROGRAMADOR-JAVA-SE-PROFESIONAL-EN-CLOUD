package com.jgr.hereda.modelo.principal;

import com.jgr.hereda.modelo.ListaNumerosInteger;

/**
 * The Class Lanzadora.
 * 
 * ListaNumerosInteger hereda de ArrayList<Integer>
 * 
 * Añadira
 * first()->devuelve el primer numero
 * last()->devuelve el ultimo
 * sum()->devuelve la suma de todos los numeros
 * no permitira numeros repetidos
 * 
 */
public class Lanzadora {

	
	public static void main(String[] args) {
		ListaNumerosInteger listaNumeros = new ListaNumerosInteger();
		
		listaNumeros.add(9);
		listaNumeros.add(9);

	}

}
