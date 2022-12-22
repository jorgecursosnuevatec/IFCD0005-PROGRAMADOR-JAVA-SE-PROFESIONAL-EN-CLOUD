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


/**
 * The Class TestServicioPedidos.
 */
class TestServicioPedidos {
	
	/** The limite. */
	private int limite =5;	
	
	/** The pedido 1. */
	private Pedido pedido1;
	
	/** The pedido 2. */
	private Pedido pedido2;
	
	/** The pedidos lista. */
	private List<Pedido> pedidosLista ;
	
	
	
	/** The pedidos servicio. */
	private PedidosServicio pedidosServicio;

	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
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

	
	/**
	 * Test devuelve pedidos.
	 */
	@Test
	void testDevuelvePedidos() {
		
		assertEquals(limite,pedidosServicio.devuelvePedidos().size(),
				()->"No coincide la longitud");
		assertTrue(limite==pedidosServicio.devuelvePedidos().size(),
				()->"No es verdad la longitud");
		assertNotNull(pedidosServicio.devuelvePedidos(),
				()->"La lista de pedidos es null");
	}
	
	
	
	/**
	 * Test add pedido.
	 */
	@Test
	void testAddPedido() {
		
		assertEquals(limite,pedidosServicio.devuelvePedidos().size(),
				()->"No coincide la longitud");
		pedidosServicio.addPedido(pedido1);
		
		assertEquals(++limite,pedidosServicio.devuelvePedidos().size(),
				()->"Despùes de añadir");
		
		
	}
	
	/**
	 * Testbusca pedido.
	 */
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

	
	
	/**
	 * Test aniade lista pedidos.
	 */
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
	
	 
	/**
	 * Test busca pedido.
	 */
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
	

	/**
	 * Test busca pedido mas reciente.
	 */
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
