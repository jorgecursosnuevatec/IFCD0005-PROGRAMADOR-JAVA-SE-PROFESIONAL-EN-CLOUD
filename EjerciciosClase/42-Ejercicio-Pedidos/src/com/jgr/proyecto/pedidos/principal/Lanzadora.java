package com.jgr.proyecto.pedidos.principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import com.jgr.proyecto.pedidos.modelo.Pedido;
import com.jgr.proyecto.pedidos.servicio.PedidosServicio;

public class Lanzadora {

	
	static int limite = 10;
	
	static long NUMERO_MAXIMO = Long.MAX_VALUE;
	static long NUMERO_MINIMO = Long.MIN_VALUE;
	public static void main(String[] args) {
		
		PedidosServicio pedidosServicio = new PedidosServicio();		
		List<Pedido> pedidosLista = new ArrayList<Pedido> ();		
		
		generaLongAleatorio().forEach(System.out::println);
		
		Pedido pedi;
		for(int i=0;i<10;i++) {
			
			pedi = new Pedido();			
			pedi.setFecPedido(new Date(generaLongAleatorio().get(i)));			
			pedi.setNomProducto("Nombre"+i);
			pedi.setTotal(i*i+1);		
			pedidosLista.add(pedi);
			
		}
		
		pedidosServicio.aniadeListaPedidos(pedidosLista);		
		pedidosServicio.devuelvePedidos().forEach(System.out::println);
		
		System.out.println("pedido mas reciente->"+pedidosServicio.buscaPedidoMasReciente());

	}
	
	
	static private List<Long> generaLongAleatorio() {
		return 
				Stream.generate(()-> new Random()
//						.nextInt())
						.nextLong())
						.limit(limite)//10 elementos
						.collect(Collectors.toList());
						
		
	}

}
