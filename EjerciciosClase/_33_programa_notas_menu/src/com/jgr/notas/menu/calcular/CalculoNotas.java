package com.jgr.notas.menu.calcular;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;




/**
 * The Class CalculoNotas.
 */
public class CalculoNotas {

	/**
	 * Calcula media.
	 *
	 * @param notas the notas
	 * @return the double
	 */
	public Double calculaMedia(List<Double> notas) {

		return notas.stream()// lo convierto a stream
				.peek(p -> System.out.println("Media numero->" + p)).mapToDouble(p -> p)// lo paso a double
				.average()// calcula la media
				.orElse(0);// si no hay nada devuelve cero

	}

	/**
	 * Calcula minimo.
	 *
	 * @param notas the notas
	 * @return the double
	 */
	public Double calculaMinimo(List<Double> notas) {

		return notas.stream()// lo convierto a stream
				.peek(p -> System.out.println("Minimo numero->" + p))
				.mapToDouble(p -> p)// lo paso a double
				.min()				
				.orElse(0);

	}

	/**
	 * Calcula maximo.
	 *
	 * @param notas the notas
	 * @return the double
	 */
	public Double calculaMaximo(List<Double> notas) {

		return notas.stream()// lo convierto a stream
				.peek(p -> System.out.println("Maximo numero->" + p))
				.mapToDouble(p -> p)// lo paso a double
				.max()
				.orElse(0);

	}

	/**
	 * Calcula aprobados.
	 *
	 * @param notas the notas
	 * @return the int
	 */
	public int calculaAprobados(List<Double> notas) {

		return (int) notas.stream()// lo convierto a stream
				.peek(p -> System.out.println("Aprobadonumero->" + p))
				.mapToDouble(p -> p)// lo paso a double
				.filter(p -> p > 5)
				.count();

	}

	/**
	 * Devuelve aprobados.
	 *
	 * @param notas the notas
	 * @return the list
	 */
	public List<Double> devuelveAprobados(List<Double> notas) {

		return notas.stream().filter(p -> p >= 5).collect(Collectors.toList());
	}
	
	/**
	 * Filtra de lista.
	 *
	 * @param notas the notas
	 * @return the list
	 */
	public List<Double> filtraDeLista(List<Double> notas,double minimo) {
		
		return notas.stream().filter(p -> p >= minimo).collect(Collectors.toList());
	}
	
	
	/**
	 * eliminaDeLista.
	 *
	 * @param notas the notas
	 * @return the list
	 */
	public List<Double> eliminaDeLista(List<Double> notas,double minimo) {
		
		//este seria un predicate, de la lista solo deja los que cumplen la condicion
		 notas.removeIf(p->p<minimo);
		 
		 return notas;
		
				
		

}
}
