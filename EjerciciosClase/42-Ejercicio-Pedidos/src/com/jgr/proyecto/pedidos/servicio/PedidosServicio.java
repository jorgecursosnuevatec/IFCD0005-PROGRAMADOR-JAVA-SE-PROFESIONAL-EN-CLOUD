package com.jgr.proyecto.pedidos.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.jgr.proyecto.pedidos.modelo.Pedido;
import com.jgr.proyecto.pedidos.modelo.PedidoComparator;

public class PedidosServicio {
	
	List<Pedido> pedidos;
	
	public void pedidosServicio() {
		
		this.pedidos= new ArrayList<>();
	}
	
	
	public Optional<Pedido> addPedido(Pedido ped) {
		
		
		Optional<Pedido> pedRet=null;
		
		 if(this.buscaPedido(ped).get()!=null) {
			 this.pedidos.add(ped);
			pedRet= Optional.ofNullable(ped);
		 }
		
		 return pedRet;
		
		
	}
	
	
	public Iterable<Pedido> aniadeListaPedidos(Iterable<Pedido> pedidos){
		
		return this.pedidos=(List<Pedido>) pedidos;
		
	}
	
	
	public Optional<Pedido> buscaPedido(Pedido ped) {
		
	Optional<Pedido> pedRet=null;
		
		if(!pedidos.equals(ped)) {
			
			pedRet= Optional.ofNullable(ped);
		}
		return pedRet;
		
		
	}
	
	public Iterable<Pedido> devuelvePedidos(){
		return this.pedidos.sort(null);
	}
	
	
	public Pedido buscaPedidoMasReciente() {
		
		Stream<Pedido> pedidosStream = pedidos.stream();
		
		return pedidosStream
				.max((a, b) -> a.getFecPedido().compareTo(b.getFecPedido())).get();
		
		
		
	}
	
	

}
