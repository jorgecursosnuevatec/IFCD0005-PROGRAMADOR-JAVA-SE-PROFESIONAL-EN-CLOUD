package com.jgr.ciudades.modelo;

import java.util.ArrayList;
import java.util.List;

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

	
	private static int ultPais;	
	private int numPais;
	private String nombrePais;
	private List<Ciudad> ciudades;
	

	public Pais () {	
		this.numPais=++ultPais;
		this.ciudades = new ArrayList<>();
	}
	
	public Pais(String nombrePais) {		
		this();
		this.nombrePais=nombrePais;		
		
	}
	
	public 
	
	
	
	

}
