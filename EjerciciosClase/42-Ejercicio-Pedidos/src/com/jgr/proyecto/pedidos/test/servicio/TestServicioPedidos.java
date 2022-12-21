package com.jgr.proyecto.pedidos.test.servicio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
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
	private Pedido p1;
	private Pedido p2;
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
		System.out.println("en metodo setUp");
		pedidosServicio.aniadeListaPedidos(pedidosLista);
		System.out.println("pedidos lista"+pedidosLista);
		
		
		p1 = new Pedido("PedidosetUp1",new Date(),666);
		p1 = new Pedido("PedidosetUp2",new Date(),777);
		
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
		pedidosServicio.addPedido(p1);
		
		assertEquals(++limite,pedidosServicio.devuelvePedidos().size(),
				()->"Despùes de añadir");
		
		
	}
	
	@Test
	void TestbuscaPedido() {
		
		pedidosServicio.addPedido(p1);
		int ultimo= pedidosServicio.devuelvePedidos().size()-1;
		assertTrue(p1==pedidosServicio.devuelvePedidos().get(ultimo),
				()->"No lo ha puesto el ultimo");
		
		assertNotNull(pedidosServicio.buscaPedido(p1),
				()->"No ha encontrado el pedido p1");
		
		Pedido pMetodo =pedidosServicio.buscaPedido(p1).get();
		String s1=p1.getNomProducto().toLowerCase();
		String s2=pMetodo.getNomProducto().toLowerCase();
		
		assertEquals(s1,s2,()->"No son iguales los nombres");
		assertEquals(p1,pMetodo,()->"No son iguales los objetos");
		
	}

	
	
	@Test
	void testAniadeListaPedidos() {
		System.out.println("antes del equals");
		assertEquals(limite,pedidosServicio.devuelvePedidos().size(),
				()->"No coincide la longitud del array con lo devuelto");
		
		System.out.println("pedidosLista"+pedidosLista);
		
		pedidosServicio.aniadeListaPedidos(pedidosLista);
		
		assertTrue((limite*2)==pedidosServicio.devuelvePedidos().size(),
				()->"no coincide la longitud del array despues de añadir  "+
		 " esperado->" + (limite*2) + " real->" + pedidosServicio.devuelvePedidos().size()
				);
		
	}
	/*
	 * 
	@Test
	void testBuscaPedido() {
		fail("Not yet implemented");
	}

	@Test
	void testBuscaPedidoMasReciente() {
		fail("Not yet implemented");
	}
*/
}
