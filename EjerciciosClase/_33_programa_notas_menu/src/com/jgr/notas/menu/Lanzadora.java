package com.jgr.notas.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.jgr.notas.menu.calcular.CalculoNotas;

/**
 * The Class Lanzadora.
 * gestion de notas
 * 1-grabar nota
 * 2-calcular media
 * 3-aprobados
 * 4-notas minima/maxima
 * 5-listar todas
 * 6-salir
 */
public class Lanzadora {

	static CalculoNotas calculoNotas = new CalculoNotas();
	
	public static void main(String[] args) {
		
		boolean salir =false;
		
		List<Double> notas = new ArrayList<>();
		
		Scanner nota = new Scanner(System.in);
		
		
		//mientras no de le salir se queda en el bucle
		/*
		
		do {
			case
		}while(!salir);
	
		
		List <Double> lista =Stream
				.generate(()-> new Random()
				.nextDouble())
				.limit(2)//10 elementos
				.collect(Collectors.toList());
		
		
		
		CalculoNotas calc;
		
		System.out.println("\nNota Med->"+calculoNotas.calculaMedia(lista));
		System.out.println("\nNota Max->"+calculoNotas.calculaMaximo(lista));
		System.out.println("\nNota Min->"+calculoNotas.calculaMinimo(lista));
		System.out.println("\nNota Apr->"+calculoNotas.calculaAprobados(lista));
		*/
		
		
		
		//genero un stream de double
		DoubleStream streamDouble =DoubleStream.
		generate(()->{return (double) (Math.random())*10000;})
		.filter(p->p>0)
		.limit(5)
//		.peek(p->System.out.println(p))
		.sorted()
		;
		
		
		//lista 
		List <Double> lista =Stream
				.generate(()-> new Random()
				.nextDouble())
				.limit(2)//10 elementos
				.collect(Collectors.toList());
		
		//a array,de aqui a Lista
		double[] arrayDobleStream = DoubleStream.
				generate(()->{return (double) (Math.random())*10000;})
				.filter(p->p>0)
				.limit(5)
//				.peek(p->System.out.println(p))
				.sorted().toArray();
		
		
		lista.forEach(System.out::println);
		
		streamDouble.forEach(notas::add);
		
		
		for(double d:arrayDobleStream) {
			System.out.println("\nVAlor de D->"+d);
		}

	}

}
