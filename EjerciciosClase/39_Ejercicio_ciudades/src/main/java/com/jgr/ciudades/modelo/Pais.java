package com.jgr.ciudades.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

/**
 * The Class Ciudades.
 */
//@NoArgsConstructor
//@AllArgsConstructor
@Data
@Log
public class Pais {

	
	private static int ultCiudad;	
	private int numCiudad;
	private String nombreCiudad;	
	private double habitantesCiudad;
	private String nombrePais;

	public Pais() {
		numCiudad= ++ultCiudad;		
	}
	
	
	public Pais(String nombreCiudad, double habitantesCiudad) {		
		this();
		this.nombreCiudad=nombreCiudad;
		this.habitantesCiudad = habitantesCiudad;
		
	}
	
	
	
	
	
	
	
	
	

}
