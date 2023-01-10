package com.jgr.clases.abstractas.modelo;

/**
 * The Class Circulo.
 * definir radio
 */
public class Circulo extends Figura {
	
	
	/** The radio. */
	private int radio;

	/**
	 * Instantiates a new circulo.
	 *
	 * @param color the color
	 */
	public Circulo(String color) {
		super(color);
		
	}

		
	/**
	 * Instantiates a new circulo.
	 *
	 * @param color the color
	 * @param radio the radio
	 */
	public Circulo(String color, int radio) {
		this(color);
		this.radio = radio;
	}


	/**
	 * Superficie.
	 *
	 * @return the double
	 */
	@Override
	public double superficie() {
		return Math.pow(radio, radio)*(Math.PI);
		
	}

}
