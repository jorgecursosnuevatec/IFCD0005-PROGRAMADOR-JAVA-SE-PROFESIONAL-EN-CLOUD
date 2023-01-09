package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.PedidosService;

class TestGestionPedidos {
	static PedidosService service= new PedidosService();  // Creo un objeto de la clase que quiero probar 
	static SimpleDateFormat formafecha=new SimpleDateFormat("dd-MM-yyyy");
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		service.nuevoPedido("leche", formafecha.parse("01-02-2022"), 10);
		service.nuevoPedido("carne", formafecha.parse("10-03-2022"), 15);
		service.nuevoPedido("huevos", formafecha.parse("01-01-2022"), 7);
	}


	@Test
	void testPedidoReciente() throws ParseException {
	
		assertEquals("carne", service.pedidoReciente().getProducto());
		assertEquals(formafecha.parse("10-03-2022"), service.pedidoReciente().getFecha());
		assertEquals(15, service.pedidoReciente().getTotal());
	}

	@Test
	void testMostrarPedidos() throws ParseException {
	/*
		assertEquals(3, service.mostrarPedidos().length); 
		
		assertEquals("leche", service.mostrarPedidos()[0].getProducto()); 
		assertEquals(10, service.mostrarPedidos()[0].getTotal()); 
		assertEquals(formafecha.parse("01-02-2022"), service.mostrarPedidos()[0].getFecha());
		
		assertEquals("carne", service.mostrarPedidos()[1].getProducto()); 
		assertEquals(15, service.mostrarPedidos()[1].getTotal()); 
		assertEquals(formafecha.parse("10-03-2022"), service.mostrarPedidos()[1].getFecha()); 
		
		assertEquals("huevos", service.mostrarPedidos()[2].getProducto()); 
		assertEquals(7, service.mostrarPedidos()[2].getTotal()); 
		assertEquals(formafecha.parse("01-01-2022"), service.mostrarPedidos()[2].getFecha()); 
	*/}


}
