package com.jgr.hereda.modelo;

import java.util.ArrayList;

/**
 * The Class ListaNumerosInteger.
 * 
 * Extiende de ArrayList , crea los metodos devuelveFirst,devuelveLast,devuelveSuma
 * y sobreescribe el add. OJO que en el suma tenemos que usar el metodo de la clase ArrayList 
 * porque si no da error
 * 
 */
public class ListaNumerosNumber extends ArrayList<Number> {
	
	//porque extiende de serializable
	private static final long serialVersionUID = 9143842881091012204L;

	/**
	 * Devuelve el primero.
	 *
	 * @return the integer
	 */
	public Number devuelveFirst() {
		return this.get(0);
	}

	/**
	 * Devuelve el ultimo.
	 *
	 * @return the integer
	 */
	public Number devuelveLast() {

		return this.get(this.size() - 1);
	}

	/**
	 * Devuelve la suma de todos los valores guardados.
	 *
	 * @return the integer
	 */
	public Number devuelveSuma() {

		double suma = 0;
		for (int i = 0; i < this.size(); i++) {
			suma = suma +  this.get(i).doubleValue();

		}

		return (Number) suma;
		
		//da error porque no se puede acumular como number en el reduce
		//return (Number)this.stream().reduce(0, Number.class::sum);
	}

	/**
	 * Inserta el numero si no existe.
	 *
	 * @param e the e
	 * @return true, if successful
	 */
	@Override
	public boolean add(Number e) {

		if (!this.contains(e)) {
			return super.add(e);
		}
		return false;
	}

}
