package com.jgr.comprobar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * The Class LanzadoraComprobarArray.
 * dado un array ver si hay o no algun par. si lo hay termina de buscar
 */
public class LanzadoraComprobarArray {

	
	public static void main(String[] args) {
		int[] ganadora;
		int numero_maximo = 0;// Integer.MAX_VALUE;
		int numero_minimo = 45;// Integer.MIN_VALUE;
		ganadora = new int[6];

		int[] jugada;
		jugada = new int[6];

		for (int i = 0; i < ganadora.length; i++) {
			ganadora[i] = (int) (Math.random() * (numero_maximo + 1 - numero_minimo)) + numero_minimo;

		}
		
		
		List<Integer> listaGanadora = Arrays.stream(ganadora).mapToObj(i -> i).collect(Collectors.toList());
		
		
		int j=0;
		int numeroPar=0;
		for(int i:listaGanadora) {
			if (i%2==0)
			{
				numeroPar=i;
				j++;
				break;
			}

		}
		
		listaGanadora.forEach(System.out::println);
		System.out.println(j>0?"Hay al menos un valor par->"+ numeroPar:"No hay numeros pares");

		
		

	}

}
