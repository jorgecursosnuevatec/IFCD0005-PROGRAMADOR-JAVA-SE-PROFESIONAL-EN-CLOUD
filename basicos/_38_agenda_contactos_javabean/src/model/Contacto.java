package model;

public class Contacto {
	private String nombre;
	private int telefono;
	private String email;
	private int edad;
	public Contacto(String nombre, int telefono, String email, int edad) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	 
}    
     