package com.jgr.paquete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
	
		
		int array[] = new int[10];
		
		for (int i=0;i<10;i++) {
			
			array[i]=i;
			
		} 
		
		
		
		int array2[] = new int[10];
		
		for (int i=0;i<array2.length;i++) {
			
			array2[i]=array[i]+i;
			
		}
		
		List<Integer> numeros = new ArrayList<>();
		
		for (int i=0;i<array2.length;i++) {
			System.out.println("valor->"+ array2[i]);
			numeros.add(array2[i]);
		}
		
		
		numeros.forEach(System.out::println);
		
		List<?> numeros2 =Arrays.asList(array2);
		List<?> numeros3 = new ArrayList<>(Arrays.asList(array2));
		
		
		
		
		int[] edades = {34,19,26,44,30,18};
		int acumulador=0;
		
		
		for (int i=0;i<edades.length;i++) {
			
			acumulador+=edades[i];
			
		}
		
		System.out.println("media de edad->"+(acumulador/edades.length)); 
		
		
		
		
		
		 
	      
	

	}

}
