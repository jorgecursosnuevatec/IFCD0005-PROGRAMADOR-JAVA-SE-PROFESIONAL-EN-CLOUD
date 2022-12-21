package com.jgr.proyecto.pedidos.modelo;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Pedido {
	
	private String nomProducto;
	private Date fecPedido;
	private double total;
	
	public Pedido() {
		super();
	}

	public Pedido(String nomProducto, Date fecPedido, double total) {
		super();
		this.nomProducto = nomProducto;
		this.fecPedido = fecPedido;
		this.total = total;
	}

	public String getNomProducto() {
		return this.nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}

	public Date getFecPedido() {
		return this.fecPedido;
	}

	public void setFecPedido(Date fecPedido) {
		this.fecPedido = fecPedido;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecPedido, nomProducto, total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Pedido)) {
			return false;
		}
		Pedido other = (Pedido) obj;
		return Objects.equals(this.fecPedido, other.fecPedido)
				&& Objects.equals(this.nomProducto, other.nomProducto)
				&& Double.doubleToLongBits(this.total) == Double.doubleToLongBits(other.total);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [");
		if (this.nomProducto != null) {
			builder.append("nomProducto=");
			builder.append(this.nomProducto);
			builder.append(", ");
		}
		if (this.fecPedido != null) {
			builder.append("fecPedido=");
			builder.append(this.fecPedido);
			builder.append(", ");
		}
		builder.append("total=");
		builder.append(this.total);
		builder.append("]");
		return builder.toString();
	}

	public int compare(Object o1, Object o2) {
		return  ((Pedido) o1).getFecPedido().compareTo(((Pedido) o2).getFecPedido()) ;
		
	}
	
	

}
