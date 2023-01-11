package com.jgr.clases.abstractas.modelo;

/**
 * The Class Figura.
 * clase generica figura
 */
public abstract class Figura {
	
	/** The color. */
	private String color;
	
	
	/**
	 * Instantiates a new figura.
	 *
	 * @param color the color
	 */
	public Figura(String color) {
		super();
		this.color = color;
	}
	
	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Sets the color.
	 *
	 * @param color the new color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Superficie.
	 *
	 * @return the double
	 */
	public abstract double superficie();

	

}
