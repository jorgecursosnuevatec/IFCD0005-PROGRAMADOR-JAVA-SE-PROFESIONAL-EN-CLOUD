package com.jgr.pruebas.listas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GeneraListasStream {

	public static void main(String[] args) {
		
		
	//genero una lista de double,¿?	
	List<Double> listaDouble = Stream.generate(() -> (double) Math.random() * 10000).limit(10)
			.collect(Collectors.toList());
	;
				
	//stream de double	,SI NO se empaqueta con boxed no crea un stream normal que es el que se usa para lista		
	DoubleStream streamDouble=DoubleStream
	.generate(()->(double) Math.random()*100)
	.peek(System.out::println)
	.limit(10)
	
	//.average()//la media es un double
	;
	
	//streamDouble.average();
	//streamDouble.max();
	//streamDouble.min();
	List<Double> listaDouble1 = Stream
			.generate(()->(double) Math.random()*100)
			.peek(System.out::println)
			.limit(10)
			.toList()//cualquiera de las dos lo hace
			//.collect(Collectors.toList())
			;
	
	listaDouble1.forEach(System.out::println);
	List<Double> listaDouble3 =
			DoubleStream //NO es un stream,no funcionan igual
			.generate(() -> (double) Math.random() * 100)//genera numero aleatorio
//			.peek(p->System.out.println("antes del filtro->"+p))
			.boxed()//lo convierte de primitivo double a OBJETO DOUBLE para que luego podamos pasarlo a lista
			.limit(7)
			.filter(p->(p>5))
			.collect(Collectors.toList())//lo convertimos a lista
			//.toList()//es inmutable, no se puede modificar la lista que devuelve
			;//
		
	listaDouble3.forEach(System.out::println);
	listaDouble3.removeIf(p->p>=60);
	System.out.println("borro de la lista->"+listaDouble3.removeIf(p->p>=60));
	System.out.println("\ndespues");
	
	listaDouble3.forEach(System.out::println);
	

	//utilizando iterate puedo generarla de manera secuencial
	 List<Integer> listaEnteros=IntStream
			 .iterate(1, i -> i + 1)
            .limit(10)
            .boxed()
            .collect(Collectors.toList());
	 
	
	

	}

}
