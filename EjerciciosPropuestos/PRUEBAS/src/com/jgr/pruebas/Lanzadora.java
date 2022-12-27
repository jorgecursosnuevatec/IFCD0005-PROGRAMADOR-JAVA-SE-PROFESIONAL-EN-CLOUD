package com.jgr.pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lanzadora {

	public static void main(String[] args) {
		Curso cur;
		double duracion=100.0;
		List<Curso> cursos = new ArrayList<Curso>();
		
		for (int i=0;i<5;i++) {
			cur = new Curso();
			
			duracion+=duracion+i;
			cur.setNombre("Duracion"+duracion );
			cur.setDuracion(duracion);
			cursos.add(cur);
			
		}
		
		int porcentaje=10;
		
		cursos.stream()
		.peek(c->System.out.println("\ncurso antes->"+c.getNombre() +"duracion->"+c.getDuracion()))
		.flatMap(curso->	{
			if(curso.getDuracion()>10) {
//				double calculo = (curso.getDuracion()*porcentaje)/100;
				
				curso.setDuracion(curso.getDuracion()-(curso.getDuracion()*0.10));
			}
			return Stream.of(curso);
			
		})
		.peek(c->System.out.println("curso despues->"+c.getNombre() +"duracion->"+c.getDuracion()))
		.collect(Collectors.toList())
		;
		
		cursos.forEach(System.out::println);

	}

}
