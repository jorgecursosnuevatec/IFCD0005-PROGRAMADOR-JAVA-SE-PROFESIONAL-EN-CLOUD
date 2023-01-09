package model;

public class Movimiento {
	private double cantidad;
	private String tipo;
	public Movimiento(double cantidad, String tipo) {
		this.cantidad = cantidad;
		this.tipo = tipo;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
