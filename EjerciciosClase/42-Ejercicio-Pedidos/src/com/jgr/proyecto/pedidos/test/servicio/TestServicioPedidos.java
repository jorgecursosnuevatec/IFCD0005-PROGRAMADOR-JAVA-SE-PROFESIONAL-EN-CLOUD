package com.jgr.proyecto.pedidos.test.servicio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jgr.proyecto.pedidos.modelo.Pedido;
import com.jgr.proyecto.pedidos.servicio.PedidosServicio;

class TestServicioPedidos {
	
	private int limite =5;	
	private Pedido pedido1;
	private Pedido pedido2;
	private List<Pedido> pedidosLista ;
	
	
	
	private PedidosServicio pedidosServicio;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		
		pedidosServicio = new PedidosServicio();		
		pedidosLista = new ArrayList<Pedido> ();	
		List<Long> listaAleatorios =Stream.generate(()-> new Random()
				.nextLong())
				.limit(limite)//10 elementos
				.collect(Collectors.toList());
		
		
		Pedido pedi;
		for(int i=0;i<limite;i++) {
			
			pedi = new Pedido();			
			pedi.setFecPedido(new Date(listaAleatorios.get(i)));			
			pedi.setNomProducto("Nombre"+i);
			pedi.setTotal(i*i+1);		
			pedidosLista.add(pedi);
			
		}
	
		pedidosServicio.aniadeListaPedidos(pedidosLista);	
		pedido1 = new Pedido("Pedido1",new Date(),666);
		pedido2 = new Pedido("Pedido2",new Date(),777);
		
	}

	
	@Test
	void testDevuelvePedidos() {
		
		assertEquals(limite,pedidosServicio.devuelvePedidos().size(),
				()->"No coincide la longitud");
		assertTrue(limite==pedidosServicio.devuelvePedidos().size(),
				()->"No es verdad la longitud");
		assertNotNull(pedidosServicio.devuelvePedidos(),
				()->"La lista de pedidos es null");
	}
	
	
	
	@Test
	void testAddPedido() {
		
		assertEquals(limite,pedidosServicio.devuelvePedidos().size(),
				()->"No coincide la longitud");
		pedidosServicio.addPedido(pedido1);
		
		assertEquals(++limite,pedidosServicio.devuelvePedidos().size(),
				()->"Despùes de añadir");
		
		
	}
	
	@Test
	void TestbuscaPedido() {
		
		pedidosServicio.addPedido(pedido1);
		int ultimo= pedidosServicio.devuelvePedidos().size()-1;
		assertTrue(pedido1==pedidosServicio.devuelvePedidos().get(ultimo),
				()->"No lo ha puesto el ultimo");
		
		assertNotNull(pedidosServicio.buscaPedido(pedido1),
				()->"No ha encontrado el pedido pedido1");
		
		Pedido pMetodo =pedidosServicio.buscaPedido(pedido1).get();
		String s1=pedido1.getNomProducto().toLowerCase();
		String s2=pMetodo.getNomProducto().toLowerCase();
		
		assertEquals(s1,s2,()->"No son iguales los nombres");
		assertEquals(pedido1,pMetodo,()->"No son iguales los objetos");
		
	}

	
	
	@Test
	void testAniadeListaPedidos() {
	
		assertEquals(limite,pedidosServicio.devuelvePedidos().size(),
				()->"No coincide la longitud del array con lo devuelto");
		
	
		pedidosServicio.aniadeListaPedidos(pedidosLista);
		
		assertTrue((limite*2)==pedidosServicio.devuelvePedidos().size(),
				()->"no coincide la longitud del array despues de añadir  "+
		 " esperado->" + (limite*2) + " real->" + pedidosServicio.devuelvePedidos().size()
				);
		
	}
	
	 
	@Test
	void testBuscaPedido() {
		
		Pedido ped1 = pedidosServicio.buscaPedidoMasReciente();		
		
		assertEquals(ped1,pedidosServicio.buscaPedido(ped1).get(),
				()-> "No son iguales ped1"+ped1.toString() 
				+ "resultado->"+pedidosServicio.buscaPedido(ped1).get());
		
		Pedido ped2= pedidosServicio.devuelvePedidos().get(0);
		
		assertEquals(ped2,pedidosServicio.devuelvePedidos().get(0),
				()-> "No son iguales ped2"+ped2.toString() 
				+ "resultado->"+pedidosServicio.buscaPedido(ped1).get());
		
		
	}
	

	@Test
	void testBuscaPedidoMasReciente() {
		
		List<Pedido> pedidosList = pedidosServicio
				.devuelvePedidos()
				.stream()
				.sorted(Comparator.comparing(Pedido::getFecPedido).reversed())
				.collect(Collectors.toList());
		
		Pedido pedidoAnt = pedidosList.get(0);
		assertEquals(pedidoAnt,pedidosServicio.buscaPedidoMasReciente(),()->"No coinciden");
		
		
	}

}
