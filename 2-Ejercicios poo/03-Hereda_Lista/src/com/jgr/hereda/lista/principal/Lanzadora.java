package com.jgr.hereda.lista.principal;

import com.jgr.hereda.lista.ListaNumeros;

/**
 * The Class Lanzadora.
 * 
 * ListaNumeros hereda de ArrayList<Integer>
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
		ListaNumeros listaNumeros = new ListaNumeros();
		
		listaNumeros.add(9);
		listaNumeros.add(9);

	}

}
