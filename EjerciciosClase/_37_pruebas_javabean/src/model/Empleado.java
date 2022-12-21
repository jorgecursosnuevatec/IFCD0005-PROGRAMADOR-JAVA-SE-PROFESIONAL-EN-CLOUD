package model;

public class Empleado {
	private String nombre;
	private String dni;
	private double salario;
	public Empleado(String nombre, String dni, double salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
