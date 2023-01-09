package com.jgr.ciudades.modelo;

import lombok.Getter;
import lombok.Setter;

// 
/**
 * Gets the hab ciudad.
 *
 * @return the hab ciudad
 */
@Getter

/**
 * Sets the hab ciudad.
 *
 * @param habCiudad the new hab ciudad
 */
@Setter
public class Ciudad {
	
	/** The contador ciudad. */
	private static int contadorCiudad;
	
	/** The id ciudad. */
	private int idCiudad;
	
	/** The nom ciudad. */
	private String nomCiudad;
	
	/** The hab ciudad. */
	private double habCiudad;
	
	
	/**
	 * Instantiates a new ciudad.
	 */
	public Ciudad() {
		this.idCiudad =++contadorCiudad;
	}
	
	
	

}
