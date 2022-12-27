package com.jgr.cursos.modelo;

import java.io.Serializable;
import java.util.Objects;


/**
 * The Class Curso.
 */
public class Curso   implements Serializable{
	
	/** The id curso. */
	private int idCurso;	
	
	/** The nombre. */
	private String nombre;
	
	/** The categoria. */
	private String categoria;
	
	/** The precio. */
	private double precio;
	
	/** The duracion. */
	private double duracion;	
	
	/** The conta curso.  ESTE AL SER TRANSIENT NO SE GUARDA EN EL FICHERO*/
	private transient static int contaCurso;

	/**
	 * Instantiates a new curso.
	 */
	public Curso() {
		this.idCurso=++contaCurso;		
	}
	
	/**
	 * Instantiates a new curso.
	 *
	 * @param nombre the nombre
	 * @param categoria the categoria
	 * @param precio the precio
	 * @param duracion the duracion
	 */
	public Curso(String nombre, String categoria, double precio, double duracion) {
		this();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.duracion = duracion;
	}

	/**
	 * Gets the id curso.
	 *
	 * @return the id curso
	 */
	public int getIdCurso() {
		return idCurso;
	}

	/**
	 * Sets the id curso.
	 *
	 * @param idCurso the new id curso
	 */
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the categoria.
	 *
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * Sets the categoria.
	 *
	 * @param categoria the new categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * Gets the precio.
	 *
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Sets the precio.
	 *
	 * @param precio the new precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Gets the duracion.
	 *
	 * @return the duracion
	 */
	public double getDuracion() {
		return duracion;
	}

	/**
	 * Sets the duracion.
	 *
	 * @param duracion the new duracion
	 */
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(categoria, duracion, idCurso, nombre, precio);
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(categoria, other.categoria)
				&& Double.doubleToLongBits(duracion) == Double.doubleToLongBits(other.duracion)
				&& idCurso == other.idCurso && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + this.idCurso + ", nombre=" + this.nombre + ", categoria=" + this.categoria
				+ ", precio=" + this.precio + ", duracion=" + this.duracion + "]";
	}

	
	
	
	
}
