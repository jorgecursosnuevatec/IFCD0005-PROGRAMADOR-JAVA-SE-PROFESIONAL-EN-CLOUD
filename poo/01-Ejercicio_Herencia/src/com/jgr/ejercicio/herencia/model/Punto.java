package com.jgr.ejercicio.herencia.model;

import java.util.Objects;

// TODO: Auto-generated Javadoc
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
	public Punto(int x,int y) {
		
		this.x=x;
		this.y=y;
				
	}
	
	/**
	 * Instantiates a new punto.
	 */
	public Punto() {
		x=10;
		y=5;
	}

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
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
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Punto)) {
			return false;
		}
		Punto other = (Punto) obj;
		return x == other.x && y == other.y;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY() + ", hashCode()=" + hashCode()
				+ ", " + (getClass() != null ? "getClass()=" + getClass() + ", " : "")
				+ (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}
	
	
	/**
	 * Dibujar.
	 */
	public void dibujar() {
		System.out.print("\nCoordenadas->"+x+","+y);
	}
	

}
