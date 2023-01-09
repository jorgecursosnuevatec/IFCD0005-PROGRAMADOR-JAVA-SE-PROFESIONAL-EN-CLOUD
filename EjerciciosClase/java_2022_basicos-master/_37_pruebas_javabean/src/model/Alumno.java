package model;

public class Alumno {
	//atributos
	private String nombre;
	private String curso;
	private double nota;
	private String email;
	public Alumno(String nombre, String curso, double nota, String email) {
		this.nombre = nombre;
		this.curso = curso;
		this.nota = nota;
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
