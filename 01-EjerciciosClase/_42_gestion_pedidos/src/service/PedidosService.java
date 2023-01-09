package service;

import java.util.ArrayList;
import java.util.Date;

import model.Pedido;

public class PedidosService {
	ArrayList<Pedido> pedidos=new ArrayList<>();
	
	public void guardarPedido(String producto, Date fechaPedido,double precio) {
		pedidos.add(new Pedido(producto,fechaPedido,precio));
	}
	
	public Pedido pedidoMasReciente() {
		Pedido pedido=null;
		Date fechaReciente=new Date(0);
		for(Pedido p:pedidos) {
			if(p.getFechaPedido().after(fechaReciente)) { //si encontramos una fecha más reciente, actualizamos variables
				fechaReciente=p.getFechaPedido();
				pedido=p;
			}
		}
		return pedido;
	}
	
	public Pedido[] todos() {
		Pedido[] resultado=new Pedido[pedidos.size()];
		for(int i=0;i<pedidos.size();i++) {
			resultado[i]=pedidos.get(i);
		}
		return resultado;
	}
}
