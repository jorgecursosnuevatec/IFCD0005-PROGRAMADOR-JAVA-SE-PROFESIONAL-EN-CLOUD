package com.jgr.ciudades.modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import lombok.Data;
import lombok.extern.java.Log;

/**
 * The Class Ciudades.
 */
//@NoArgsConstructor
//@AllArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/** The Constant log. */
@Log
public class Pais {

	
	/** The ult pais. */
	private static int ultPais;	
	
	/** The num pais. */
	private int numPais;
	
	/** The nombre pais. */
	private String nombrePais;
	
	/** The ciudades. */
	private List<Ciudad> ciudades;
	

	/**
	 * Instantiates a new pais.
	 */
	public Pais () {	
		this.numPais=++ultPais;
		this.ciudades = new ArrayList<>();
	}
	
	/**
	 * Instantiates a new pais.
	 *
	 * @param nombrePais the nombre pais
	 */
	public Pais(String nombrePais) {		
		this();
		this.nombrePais=nombrePais;		
		
	}
	
	/**
	 * Alta ciudad.
	 *
	 * @param ciudad the ciudad
	 * @return the list
	 */
	public List<Ciudad> altaCiudad(Ciudad ciudad){
		
		this.ciudades.add(ciudad);
		return this.ciudades;
		
	}
	
	/**
	 * Baja ciudad.
	 *
	 * @param ciudad the ciudad
	 * @return true, if successful
	 */
	public boolean bajaCiudad(Ciudad ciudad) {
		
		//return ciudades.remove(ciudad); //ok
		return ciudades.removeIf(c->c.getNomCiudad().equalsIgnoreCase(ciudad.getNomCiudad()));
		
		
	}
	
	
	/**
	 * Busca ciudad.
	 *
	 * @param ciudad the ciudad
	 * @return true, if successful
	 */
	public boolean buscaCiudad(Ciudad ciudad) {
		
		return Stream.of(ciudades)
				.anyMatch(c->((Ciudad) c).getNomCiudad().equalsIgnoreCase(ciudad.getNomCiudad()));
		
	}
	
	
	/**
	 * Busca max habitantes.
	 *
	 * @return the optional
	 */
	public Optional<Ciudad> buscaMaxHabitantes() {		
		
		//LO CONVIERTO A STREAM
		Stream<Ciudad> streamCiudades = ciudades.stream();
		//UNA VEZ LO TENGO COMO STREAM VOY COMPARANDO POR NUMERO DE HABITANTES,QUE AL SER
		//DOUBLE
		return streamCiudades.max(Comparator.comparingDouble(Ciudad::getHabCiudad));
		
		//ciudades.sort((c1,c2)->{return Double.compare(c1.getHabCiudad(), c2.getHabCiudad());});
		
				
		//return 0.0;
		
				
	}

}
