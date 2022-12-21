package com.jgr.proyecto.pedidos.modelo;

import java.util.Comparator;

public class PedidoComparator implements Comparator<Pedido>{

	

	

	@Override
	public int compare(Pedido o1, Pedido o2) {
		return o1.getFecPedido().compareTo(o2.getFecPedido());
	}
	

}
