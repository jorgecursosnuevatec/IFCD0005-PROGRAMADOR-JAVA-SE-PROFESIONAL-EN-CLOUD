package com.jgr.hereda.test.lista;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ListaNumerosTest {

	
	static List<Integer> listaNumeros;
	final static int limite = 3;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		listaNumeros= new ArrayList<>();
		
		for (int i=0;i<limite;i++) {
			listaNumeros.add(i);
		}
		
		
	}

	@Test
	void testDevuelveFirst() {
		
		assertEquals(0,listaNumeros.get(0),()->"No ha devuelto un 0");
		
	}

	@Test
	void testDevuelveLast() {
		fail("Not yet implemented");
	}

	@Test
	void testDevuelveSuma() {
		fail("Not yet implemented");
	}

	@Test
	void testAddInteger() {
		fail("Not yet implemented");
	}

}
