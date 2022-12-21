package com.jgr.proyecto.pedidos.modelo;

import java.util.Comparator;

public class PedidoComparator implements Comparator{

	

	@Override
	public int compare(Object o1, Object o2) {
		
		Pedido p1 = (Pedido) o1;
		Pedido p2= (Pedido) o2;
		
		return p1.getFecPedido().compareTo(p2.getFecPedido());
		
	}
	

}
