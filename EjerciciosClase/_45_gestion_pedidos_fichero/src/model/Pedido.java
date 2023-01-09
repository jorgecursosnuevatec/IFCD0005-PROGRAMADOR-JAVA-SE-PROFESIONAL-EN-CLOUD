package model;

import java.util.Date;

public class Pedido {
	private String producto;
	private Date fecha;
	private double total;
	public Pedido(String producto, Date fecha, double total) {
		super();
		this.producto = producto;
		this.fecha = fecha;
		this.total = total;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	

}
