package com.jgr.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.jgr.hashset.modelo.Curso;
import com.jgr.hashset.servicio.CursoServicio;

/**
 * The Class LanzaCurso.
 */
public class LanzaCursoHashSet {

	
	//->añadir
	//->buscar curso
	//->duracion media
	//->cursos por tematica
	//->eliminar curso por precio>=
	public static void main(String[] args) {
		
		
		
		CursoServicio cursoServicio = new CursoServicio();
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		Curso cur;
		for (int i=0;i<10;i++) {
			cur = new Curso();
			cur.setCursoNombre("Nombre"+i);
			cur.setDuracion(i);
			cur.setPrecio(i);
			cur.setTematica("Tematica"+i);
			cursos.add(cur);
		}
		
		cursoServicio.addCursos(cursos);
		cursoServicio.getCursos().forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
