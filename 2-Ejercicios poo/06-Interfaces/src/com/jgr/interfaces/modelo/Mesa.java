package com.jgr.interfaces.modelo;

import java.util.Objects;

import com.jgr.interfaces.IOperaciones;


/**
 * The Class Mesa.
 */
public class Mesa implements IOperaciones{
	
	/** The largo. */
	private int largo;
	
	/** The ancho. */
	private int ancho;
	
	/** The alto. */
	private int alto;

	/**
	 * Instantiates a new mesa.
	 */
	public Mesa() {
		super();
	}

	/**
	 * Instantiates a new mesa.
	 *
	 * @param largo the largo
	 * @param ancho the ancho
	 * @param alto the alto
	 */
	public Mesa(int largo, int ancho, int alto) {
		super();
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}

	
	/**
	 * Gets the largo.
	 *
	 * @return the largo
	 */
	public int getLargo() {
		return this.largo;
	}

	/**
	 * Sets the largo.
	 *
	 * @param largo the new largo
	 */
	public void setLargo(int largo) {
		this.largo = largo;
	}

	/**
	 * Gets the ancho.
	 *
	 * @return the ancho
	 */
	public int getAncho() {
		return this.ancho;
	}

	/**
	 * Sets the ancho.
	 *
	 * @param ancho the new ancho
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * Gets the alto.
	 *
	 * @return the alto
	 */
	public int getAlto() {
		return this.alto;
	}

	/**
	 * Sets the alto.
	 *
	 * @param alto the new alto
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}

	/**
	 * Girar.
	 *
	 * @param a the a
	 */
	@Override
	public void girar(int a) {
		this.largo+=a;
		this.ancho+=a;
		
		
		
	}

	/**
	 * Invertir.
	 *
	 * @return the int
	 */
	@Override
	public int invertir() {
		
		return this.alto*=-1;
		
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(alto, ancho, largo);
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
		if (!(obj instanceof Mesa)) {
			return false;
		}
		Mesa other = (Mesa) obj;
		return this.alto == other.alto && this.ancho == other.ancho && this.largo == other.largo;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mesa [largo=");
		builder.append(this.largo);
		builder.append(", ancho=");
		builder.append(this.ancho);
		builder.append(", alto=");
		builder.append(this.alto);
		builder.append("]");
		return builder.toString();
	}
	

}
