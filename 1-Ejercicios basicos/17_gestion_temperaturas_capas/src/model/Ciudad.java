package model;

public class Ciudad {
	private String nombre;
	private double temperatura;
	
	
	public Ciudad(String nombre, double temperatura) {
		this.nombre = nombre;
		this.temperatura = temperatura<50?temperatura:0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}	
}
