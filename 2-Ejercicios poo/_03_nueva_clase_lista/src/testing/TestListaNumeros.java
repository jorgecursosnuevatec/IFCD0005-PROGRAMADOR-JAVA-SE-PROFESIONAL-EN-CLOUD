package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.ListaNumeros;

class TestListaNumeros {
	ListaNumeros lista;
	@BeforeEach
	void setUp() throws Exception {
		lista=new ListaNumeros();
	}

	@Test
	void testFirst() {
		lista.add(20);
		lista.add(30);
		assertEquals(20, lista.first());
	}

	@Test
	void testLast() {
		lista.add(20);
		lista.add(30);
		assertEquals(30, lista.last());
	}

	@Test
	void testSum() {
		lista.add(20);
		lista.add(30);
		assertEquals(50, lista.sum());
	}

	@Test
	void testAddInteger() {
		lista.add(5);
		lista.add(10);
		assertFalse(lista.add(5));
		assertEquals(2, lista.size());
	}

}
