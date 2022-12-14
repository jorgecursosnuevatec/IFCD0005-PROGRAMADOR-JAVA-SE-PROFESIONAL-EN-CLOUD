package com.jgr.ordenar.listaarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * The Class OrdenaArray.
 * Genera una lista de 10 numeros aleatorios y lo ordena en descendente
 */
public class OrdenaArray {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		List<Integer> listaOriginal = Stream.generate(() -> new Random()
				.nextInt())
				.limit(10)//
				.collect(Collectors.toList());

		List<Integer> listaTrabajo = new ArrayList<> (listaOriginal);
		listaTrabajo.forEach(System.out::println);
		

		// ordena Burbuja

		for (int i = 0; i < listaTrabajo.size(); i++) {

			for (int j = 0; j < listaTrabajo.size()-1; j++) {

				if (listaTrabajo.get(j) > listaTrabajo.get(j + 1)) {
					int temporal = listaTrabajo.get(j + 1);
					listaTrabajo.set(j + 1, listaTrabajo.get(j));
					listaTrabajo.set(j, temporal);

				}

			}

		}
		System.out.println("Ordena Burbuja");
		listaTrabajo.forEach(System.out::println);
		
		//ordena seleccion
		listaTrabajo.clear();
		listaTrabajo = listaOriginal;
		
		for(int i=0;i<listaTrabajo.size()-1;i++) {
			int menor = listaTrabajo.get(i);
			int posMenor=i;
			for (int j = i+1;j<listaTrabajo.size();j++) {
				int actual = listaTrabajo.get(j);
				if (actual<menor) {
					menor=actual;
					posMenor=j;
							
				}
			}
			int temp = listaTrabajo.get(i);
			listaTrabajo.set(i, menor);
			listaTrabajo.set(posMenor, temp);
		}

	}

}
