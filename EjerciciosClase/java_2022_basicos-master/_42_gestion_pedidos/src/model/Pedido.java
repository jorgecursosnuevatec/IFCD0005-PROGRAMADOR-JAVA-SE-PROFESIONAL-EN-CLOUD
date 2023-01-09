package model;

import java.util.Date;

public class Pedido {
	private String producto;
	private Date fechaPedido;
	private double precio;
	public Pedido(String producto, Date fechaPedido, double precio) {
		super();
		this.producto = producto;
		this.fechaPedido = fechaPedido;
		this.precio = precio;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
