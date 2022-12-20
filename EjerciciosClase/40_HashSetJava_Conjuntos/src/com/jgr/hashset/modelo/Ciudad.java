package com.jgr.hashset.modelo;




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


	public int getIdCiudad() {
		return idCiudad;
	}


	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}


	public String getNomCiudad() {
		return nomCiudad;
	}


	public void setNomCiudad(String nomCiudad) {
		this.nomCiudad = nomCiudad;
	}


	public double getHabCiudad() {
		return habCiudad;
	}


	public void setHabCiudad(double habCiudad) {
		this.habCiudad = habCiudad;
	}
	
	
	

}
