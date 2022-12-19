package com.jgr.ciudades.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ciudad {
	
	private static int contadorCiudad;
	private int idCiudad;
	private String nomCiudad;
	private double habCiudad;
	
	
	public Ciudad() {
		this.idCiudad =++contadorCiudad;
	}
	
	
	

}
