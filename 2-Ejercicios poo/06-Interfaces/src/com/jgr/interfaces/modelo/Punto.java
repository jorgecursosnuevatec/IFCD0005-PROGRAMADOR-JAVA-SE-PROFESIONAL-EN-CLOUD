package com.jgr.interfaces.modelo;


/**
 * The Class Punto.
 */
public class Punto {
	
	/** The x. */
	private int x;
	
	/** The y. */
	private int y;
	
	/**
	 * Instantiates a new punto.
	 *
	 * @param x the x
	 * @param y the y
	 */
	//inicializa atributos
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	/**
	 * Instantiates a new punto.
	 */
	//inicializa a valores cualquiera
	public Punto() {
		x=10;
		y=5;
	}
	
	/**
	 * Instantiates a new punto.
	 *
	 * @param a the a
	 */
	public Punto(int a) {
		x=a;
		y=a;
	}
	
	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	//setter y getter
	public int getX() {
		return x;
	}
	
	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Dibujar.
	 */
	public void dibujar() {
		System.out.print("Coordenadas: "+x+","+y);
	}
	
}
