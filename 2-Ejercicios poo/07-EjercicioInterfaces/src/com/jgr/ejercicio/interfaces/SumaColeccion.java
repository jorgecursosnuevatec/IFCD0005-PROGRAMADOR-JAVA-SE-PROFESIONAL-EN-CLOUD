package com.jgr.ejercicio.interfaces;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * The Class SumaColeccion.
 * 
 * 
 */
public class SumaColeccion {
	
	/**
	 * Suma numeros.
	 *
	 * @param numeros the numeros
	 * @return the number
	 */
	public Number sumaNumeros(Collection<Number> numeros) {
		
		long l=0;
		for (Number n:numeros) {			
			l+=n.longValue();			
		}
		
		return l;
		
	};
	
	
	public int cuentaDuplicados(Collection<Number> numeros1,Collection<Number> numeros2) {
		
		int retorno=0;		
		for (Number n :numeros1) {
			if(numeros2.contains(n)) {
				retorno++;
			}
		}
		
		int numElementos1=numeros1.size();
		int numElementos2=numeros2.size();		
		Set<Number> set1 = new HashSet<Number>(numeros1);
		Set<Number> set2 = new HashSet<Number>(numeros2);		
		set1.addAll(set2);		
		return (numElementos1+numElementos2) - set1.size();
		
	
	}

}
