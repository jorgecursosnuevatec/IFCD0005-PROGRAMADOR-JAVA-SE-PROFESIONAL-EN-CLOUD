package com.jgr.ejercicio.listas;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random; 

/**
 * The Class LanzadoraListas.
 */
public class LanzadoraListas {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		List<Integer> numerosLista = new ArrayList<>();

		ArrayList<String> textos = new ArrayList<>();

		byte[] array = new byte[55]; // length is bounded

		String generatedString = "";

		for (int i = 0; i < 25; i++) {
			new Random().nextBytes(array);
			generatedString = new String(array, Charset.forName("UTF-8"));

			textos.add(generatedString);
		}

		textos.forEach(System.out::println);

		for (int i = 0; i < 25; i++) {

			numeros.add(new Random().nextInt());

		}

		numeros.forEach(System.out::println);
		

	}

}
