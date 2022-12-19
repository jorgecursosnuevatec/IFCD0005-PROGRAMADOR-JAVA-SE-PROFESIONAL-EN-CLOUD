package com.jgr.ciudades.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import com.jgr.ciudades.modelo.Pais;



public class Principal {

	public static void main(String[] args) {
		
		List<Pais> paises = new ArrayList<>();
		int limite =10;
		List<Double> listaDouble =
				DoubleStream //NO es un stream,no funcionan igual
				.generate(() -> (double) Math.random() * 100)//genera numero aleatorio
//				.peek(p->System.out.println("antes del filtro->"+p))
				.boxed()//lo convierte a stream para que luego podamos pasarlo a lista
				.limit(limite)
				.filter(p->(p>5))
				.collect(Collectors.toList())//lo convertimos a lista
				;//
		
		Pais pai;
		for (int i= 0;i<limite;i++) {
			pai=new Pais();
			
			pai.setNombrePais("Pais"+i);
			
			for (int j=0;j<limite;j++) {
				pai.setNombreCiudad("Ciudad"+i);
				pai.setHabitantesCiudad(listaDouble.get(j));
				paises.add(pai);
			}
			
		}
		
		paises.forEach(System.out::println);
		

	}

}
