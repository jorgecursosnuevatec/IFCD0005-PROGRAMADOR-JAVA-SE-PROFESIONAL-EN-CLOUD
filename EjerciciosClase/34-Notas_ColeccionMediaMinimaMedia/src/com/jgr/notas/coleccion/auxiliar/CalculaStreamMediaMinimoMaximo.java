package com.jgr.notas.coleccion.auxiliar;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * The Class CalculaMediaMinimoMaximo. a partir de ul array Integer calcula con
 * stream maximo,minimo y media
 * 
 */
public final class CalculaStreamMediaMinimoMaximo {
	
	

	public static double calculaMedia(List<Integer> listaNum) {

		return listaNum.stream()
				.mapToInt(a -> a)// con el map convierto cada ocurrencia a int
				.average() // calcula la media
				.orElse(0);// si no hay nada devuelve 0,me quito el optional
	}
	
	

	public static int buscaMinimo(List<Integer> listaNum) {

		return listaNum
				.stream()// lo convierto a stream
				.min(Comparator.naturalOrder())// lo ordena
				.get();// lo obtiene

	}

	public static int buscaMaximo(List<Integer> listaNum) {

		return listaNum
				.stream().
				max(Comparator.naturalOrder()).get();

	}
	
	

	public static int cuentaAprobados(List<Integer> listaNum) {

		return (int) listaNum
				.stream()
				.filter(a -> a > 5)
				.count();
	}

	public static Iterable<Integer> ordenaLista(List<Integer> listaNum) {

		return listaNum
				.stream()
				.sorted()
				.collect(Collectors.toList());
	}
	
	


	public static Iterable<Integer> generaLista() throws NoSuchAlgorithmException {
		
		SecureRandom number = SecureRandom.getInstance("SHA1PRNG");

		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 100; i++) {

			lista.add(number.nextInt());

		}

		return lista.stream()
				.filter(a->a>0)//solo positivos
				.peek(a->System.out.println("CON DUPLICADOS-->"+a))
				.distinct()//elimino duplicados
				.peek(a->System.out.println("SIN DUPLICADOS-->"+a))
				.sorted(Comparator.naturalOrder())
				.collect(Collectors.toList())
				;//lo convierto a lista
		
	}
	

}
