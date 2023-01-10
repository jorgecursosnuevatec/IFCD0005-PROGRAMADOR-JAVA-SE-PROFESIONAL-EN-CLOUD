package com.jgr.hereda.modelo;

import java.util.ArrayList;

/**
 * The Class ListaNumerosInteger.
 * Extiende de ArrayList , crea los metodos devuelveFirst,devuelveLast,devuelveSuma
 * y sobreescribe el add. OJO que en el suma tenemos que usar el metodo de la clase ArrayList 
 * porque si no da error
 * 
 */
public class ListaNumerosInteger extends ArrayList<Integer> {
	
	//porque extiende de serializable
	private static final long serialVersionUID = 558884736267523095L;

	/**
	 * Devuelve el primero.
	 *
	 * @return the integer
	 */
	public Integer devuelveFirst() {
		return this.get(0);
	}

	/**
	 * Devuelve el ultimo.
	 *
	 * @return the integer
	 */
	public Integer devuelveLast() {

		return this.get(this.size() - 1);
	}

	/**
	 * Devuelve la suma de todos los valores guardados.
	 *
	 * @return the integer
	 */
	public Integer devuelveSuma() {

		/*
		 * int suma=0; for(int i=0;i< this.size();i++) { suma=suma+this.get(i);
		 * 
		 * 
		 * } return suma;
		 */
		return this.stream().reduce(0, Integer::sum);
	}

	/**
	 * Inserta el numero si no existe.
	 *
	 * @param e the e
	 * @return true, if successful
	 */
	@Override
	public boolean add(Integer e) {

		if (!this.contains(e)) {
			return super.add(e);
		}
		return false;
	}

}
