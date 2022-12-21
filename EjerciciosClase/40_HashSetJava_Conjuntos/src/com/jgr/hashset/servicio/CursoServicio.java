package com.jgr.hashset.servicio;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.jgr.hashset.modelo.Curso;


// TODO: Auto-generated Javadoc
/**
 * The Class CursoServicio.
 */
public class CursoServicio {

	/** The cursos. */
	private Set<Curso> cursos;

	/**
	 * Instantiates a new curso servicio.
	 */
	public CursoServicio() {
		this.cursos = new HashSet<Curso>();
	}

	/**
	 * Adds the curso.
	 *
	 * @param curso the curso
	 * @return true, if successful
	 */
	public boolean addCurso(Curso curso) {
		return this.cursos.add(curso);
	}

	/**
	 * Adds the cursos.
	 *
	 * @param cursos the cursos
	 * @return true, if successful
	 */
	public boolean addCursos(List<Curso> cursos) {
		return this.cursos.addAll(cursos);
	}

	/**
	 * Borra curso.
	 *
	 * @param curso the curso
	 * @return true, if successful
	 */
	public boolean borraCurso(Curso curso) {
		return this.cursos.remove(curso);
	}

	/**
	 * Busca curso por nombre stream.
	 *
	 * @param nombre the nombre
	 * @return the optional
	 */
	public Optional<Curso> buscaCursoPorNombreStream(String nombre) {
		return Optional.of(cursos.stream().filter(c -> c.getCursoNombre().equalsIgnoreCase(nombre)).findFirst().get());
	}

	/**
	 * Busca curso por duracion stream.
	 *
	 * @param duracion the duracion
	 * @return the iterable
	 */
	public Iterable<Curso> buscaCursoPorDuracionStream(int duracion) {
		return cursos.stream().filter(c -> c.getDuracion() >= duracion).collect(Collectors.toList());
	}

	/**
	 * Busca curso por tematica stream.
	 *
	 * @param tematica the tematica
	 * @return the iterable
	 */
	public Iterable<Curso> buscaCursoPorTematicaStream(String tematica) {
		return cursos.stream().filter(c -> c.getTematica().equalsIgnoreCase(tematica)).collect(Collectors.toList());
	}

	/**
	 * Busca curso por precio stream.
	 *
	 * @param precio the precio
	 * @return the iterable
	 */
	public Iterable<Curso> buscaCursoPorPrecioStream(double precio) {
		return cursos.stream().filter(c -> c.getPrecio() >= precio).collect(Collectors.toList());
	}

	/**
	 * Borra curso por precio stream.
	 *
	 * @param precio the precio
	 * @return the iterable
	 */
	public Iterable<Curso> borraCursoPorPrecioStream(double precio) {
		return this.cursos.stream().
		// Predicate<? super Curso> predicate
				dropWhile(c -> c.getPrecio() >= precio)// recibe un objeto y devuelve un boolean
				.collect(Collectors.toList());
	}

	/**
	 * Borra curso por precio stream.
	 *
	 * @param precio the precio
	 * @return the iterable
	 */
	public Iterable<Curso> borraCursoPorPrecio(double precio) {

		for (Curso c : cursos) {

			if (c.getPrecio() >= precio) {
				cursos.remove(c);
			}

		}
		return cursos;

	}

	/**
	 * Gets the cursos .
	 *
	 * @return the cursos
	 */
	public Iterable<Curso> getCursos() {
		return this.cursos;
	}

	/**
	 * Busca curso.
	 *
	 * @param cur the cur
	 * @return the optional,relleno si existe
	 */
	public Optional<Curso> buscaCurso(Curso cur) {
		Curso curRet = null;

		if (cursos.contains(cur)) {

			for (Curso c : cursos) {

				if (c.equals(cur)) {
					curRet = new Curso();
					curRet = cur;
				}
			}

		}

		return Optional.ofNullable(curRet);

	}

	/**
	 * Duracion media stream.
	 *
	 * @return the double
	 */
	public Double duracionMediaStream() {
		return this.cursos.stream().mapToInt(c -> c.getDuracion()) // obtengo la duracion en int
				.average().orElse(0);
		/*
		 * return this.cursos .stream() .mapToInt(Curso::getDuracion) .average()
		 * .orElse(0);
		 */

	}

	/**
	 * Duracion media.
	 *
	 * @return the double
	 */
	public double duracionMedia() {

		int longitud = this.cursos.size();

		int acumulador = 0;

		for (Curso c : this.cursos) {

			acumulador += c.getDuracion();

		}

		return (double) acumulador / longitud;

	}

}
