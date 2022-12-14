package com.jgr.notas.coleccion;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jgr.notas.coleccion.auxiliar.CalculaStreamMediaMinimoMaximo;

/**
 * The Class LanzadoraColeccion.
 * 
 * solicita la introduccion de una nota y guardarla
 * si es positiva la guarda y pide otra mas
 * si es negativa no la guarda y termina
 * saca nota media
 * nota mas baja
 * nota mas alta
 * media
 */
public class LanzadoraColeccion {
	
	

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();	
		
		final int TOPE_APUESTAS = 25;
		final int NUMERO_MAXIMO = Integer.MAX_VALUE;
		final int NUMERO_MINIMO = Integer.MIN_VALUE;
		boolean existe = false;
		int numApuestas = 0;
		int numero = 0;
		int contaveces = 0;
		
		do {
			numero = (int) (Math.random() * (NUMERO_MAXIMO - NUMERO_MINIMO) + NUMERO_MINIMO);

			existe = false;

			for (int i = 0; (i < numeros.size() && !existe); i++) {

				if (numeros.get(i) == numero) {
					existe = true;

				}
			}

			if (!existe) {
				numeros.add(numero);
				numApuestas++;

			}

			contaveces++;
			System.out.println("contaveces dentro->"+contaveces);


		} while (numApuestas < TOPE_APUESTAS && contaveces<500);
		
		/*
		Random random = new Random();
		
		List<Integer> ints = random.ints(NUMERO_MAXIMO,  NUMERO_MINIMO)
				.limit(20)
				.boxed()
				.distinct()				
				.collect(Collectors.toList());
		*/
		System.out.println("Contaveces->"+contaveces);
		System.out.println("Tamaño Lista->"+ numeros.size());
		System.out.println("Repetidos->"+ (contaveces-numeros.size()));
		
		System.out.println("Media->"+CalculaStreamMediaMinimoMaximo.calculaMedia(numeros));
		System.out.println("Mayor->"+CalculaStreamMediaMinimoMaximo.buscaMaximo(numeros));
		System.out.println("Mayor->"+CalculaStreamMediaMinimoMaximo.buscaMinimo(numeros));
		System.out.println("Mayor->"+CalculaStreamMediaMinimoMaximo.cuentaAprobados(numeros));
		
		try {
			CalculaStreamMediaMinimoMaximo.generaLista().forEach(System.out::println);
		} catch (NoSuchAlgorithmException e) {			
			e.printStackTrace();
		}
		
		

	}

}
