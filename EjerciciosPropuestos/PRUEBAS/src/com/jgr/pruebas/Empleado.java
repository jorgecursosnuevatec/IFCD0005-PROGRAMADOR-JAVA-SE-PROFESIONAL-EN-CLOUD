package com.jgr.pruebas;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Empleado {
	
	private String nombre;
	private Date fechaIngreso;
	private double salario;
	private String departamento;
	
	public Empleado() {
		super();
	}
	public Empleado(String nombre, Date fechaIngreso, double salario, String departamento) {
		super();
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
		this.departamento = departamento;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaIngreso() {		
		
		return this.fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return this.departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + this.nombre + ", fechaIngreso=" + this.fechaIngreso + ", salario=" + this.salario
				+ ", departamento=" + this.departamento + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(departamento, fechaIngreso, nombre, salario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(this.departamento, other.departamento)
				&& Objects.equals(this.fechaIngreso, other.fechaIngreso) && Objects.equals(this.nombre, other.nombre)
				&& Double.doubleToLongBits(this.salario) == Double.doubleToLongBits(other.salario);
	}
	
	

}
