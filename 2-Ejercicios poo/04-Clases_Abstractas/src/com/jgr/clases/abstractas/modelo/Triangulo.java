package com.jgr.clases.abstractas.modelo;

/**
 * The Class Triangulo.
 * tiene base y altura
 */
public class Triangulo extends Figura {
	
	
	/** The altura. */
	private int altura;
	
	/** The base. */
	private int base;
	

	/**
	 * Instantiates a new triangulo.
	 *
	 * @param color the color
	 */
	public Triangulo(String color) {
		super(color);
		
	}
	
	/**
	 * Instantiates a new triangulo.
	 *
	 * @param color the color
	 * @param altura the altura
	 * @param base the base
	 */
	public Triangulo(String color, int altura, int base) {
		this(color);
		this.altura=altura;
		this.base=base;
		
	}
	
	/**
	 * Gets the altura.
	 *
	 * @return the altura
	 */
	public int getAltura() {
		return this.altura;
	}

	/**
	 * Sets the altura.
	 *
	 * @param altura the new altura
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * Gets the base.
	 *
	 * @return the base
	 */
	public int getBase() {
		return this.base;
	}

	/**
	 * Sets the base.
	 *
	 * @param base the new base
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * Superficie.
	 *
	 * @return the double
	 */
	@Override
	public double superficie() {
		return this.base*this.altura;
	}

}
