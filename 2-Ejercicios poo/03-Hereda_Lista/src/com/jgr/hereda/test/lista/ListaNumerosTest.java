package com.jgr.hereda.test.lista;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jgr.hereda.lista.ListaNumeros;

class ListaNumerosTest {

	
	static ListaNumeros listaNumeros;
	final static int limite = 3;
	static int acumulador=0;
	
	@BeforeEach
	 void setUpBeforeClass() throws Exception {
		listaNumeros= new ListaNumeros();
		acumulador=0;
		for (int i=0;i<limite;i++) {
			listaNumeros.add(i);
			acumulador+=i;
		}
		
	}

	@Test
	void testDevuelveFirst() {
		
		assertEquals(0,listaNumeros.get(0),()->"No ha devuelto un 0");
		assertTrue(listaNumeros.get(0).equals(0),()->"No son iguales,no ha devuelto un 0");
		
	}

	@Test
	void testDevuelveLast() {
		
		assertEquals(2,listaNumeros.get(limite-1),()->"No ha devuelto un 2");
		
	}

	@Test
	void testDevuelveSuma() {
		assertEquals(acumulador,listaNumeros.devuelveSuma(),()->"No coincide la suma");
		
	}

	@Test
	void testAddInteger() {
		assertTrue(listaNumeros.add(9),()->"No deja añadir 9 y deberia");
		assertFalse(listaNumeros.add(9),()->"No deja añadir 9 y deberia");
	}

}
