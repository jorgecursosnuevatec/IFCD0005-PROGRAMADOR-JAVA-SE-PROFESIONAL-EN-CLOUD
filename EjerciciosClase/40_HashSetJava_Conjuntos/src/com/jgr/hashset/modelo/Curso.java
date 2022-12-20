package com.jgr.hashset.modelo;

public class Curso {
	
	private String cursoNombre;
	private int duracion;
	private String tematica;
	private double precio;
	
	
	public Curso() {
		super();
	}


	public Curso(String cursoNombre, int duracion, String tematica, double precio) {
		super();
		this.cursoNombre = cursoNombre;
		this.duracion = duracion;
		this.tematica = tematica;
		this.precio = precio;
	}


	public String getCursoNombre() {
		return this.cursoNombre;
	}


	public void setCursoNombre(String cursoNombre) {
		this.cursoNombre = cursoNombre;
	}


	public int getDuracion() {
		return this.duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public String getTematica() {
		return this.tematica;
	}


	public void setTematica(String tematica) {
		this.tematica = tematica;
	}


	public double getPrecio() {
		return this.precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [");
		if (this.cursoNombre != null) {
			builder.append("cursoNombre=");
			builder.append(this.cursoNombre);
			builder.append(", ");
		}
		builder.append("duracion=");
		builder.append(this.duracion);
		builder.append(", ");
		if (this.tematica != null) {
			builder.append("tematica=");
			builder.append(this.tematica);
			builder.append(", ");
		}
		builder.append("precio=");
		builder.append(this.precio);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}