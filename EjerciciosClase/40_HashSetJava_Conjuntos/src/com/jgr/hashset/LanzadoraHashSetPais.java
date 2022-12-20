package com.jgr.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import com.jgr.hashset.modelo.Ciudad;
import com.jgr.hashset.modelo.Pais;

public class LanzadoraHashSetPais {

	public static void main(String[] args) {
		Set<Pais> paises = new HashSet<>();
		
		int limite =10;
		
		
		List<Double> listaDouble =
				DoubleStream //NO es un stream,no funcionan igual
				.generate(() -> (double) Math.random() * 100)//genera numero aleatorio
//				.peek(p->System.out.println("antes del filtro->"+p))
				.boxed()//lo convierte a stream para que luego podamos pasarlo a lista
				.limit(limite)
//				.filter(p->(p>5))
				.collect(Collectors.toList())//lo convertimos a lista
				;//
		
		Pais pai;
		Ciudad ciu;
		for (int i= 0;i<limite;i++) {
			pai=new Pais();
			
			pai.setNombrePais("Pais"+i);
			
			for (int j=0;j<limite;j++) {
				
				ciu = new Ciudad();
				ciu.setNomCiudad("Ciudad"+j);
				ciu.setHabCiudad(listaDouble.get(j));
				pai.altaCiudad(ciu);
				
				
			}
			paises.add(pai);
			
		}
		
		
		//paises.forEach(System.out::println);
		
		for (Pais p:paises) {
			System.out.println("\npais->"+p.getNombrePais());
			
			for(Ciudad c :p.getCiudades()) {
				
				System.out.println("ciudad->"+c.getNomCiudad());
			}
		}
		
		
	}

}
