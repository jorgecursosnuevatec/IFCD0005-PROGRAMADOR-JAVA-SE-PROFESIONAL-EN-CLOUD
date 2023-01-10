package com.jgr.hereda.test.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jgr.hereda.modelo.ListaNumerosInteger;


/**
 * The Class ListaNumerosIntegerTest.
 */
class ListaNumerosIntegerTest {

	
	/** The lista numeros. */
	static ListaNumerosInteger listaNumeros;
	
	/** The Constant limite. */
	final static int limite = 3;
	
	/** The acumulador. */
	static int acumulador=0;
	
	/**
	 * Sets the up before each.
	 *
	 * @throws Exception the exception
	 */
	@BeforeEach
	 void setUpBeforeEach() throws Exception {
		listaNumeros= new ListaNumerosInteger();
		acumulador=0;
		for (int i=0;i<limite;i++) {
			listaNumeros.add(i);
			acumulador+=i;
		}
		
	}

	/**
	 * Test devuelve first.
	 */
	@Test
	void testDevuelveFirst() {
		
		assertEquals(0,listaNumeros.get(0),()->"No ha devuelto un 0");
		assertTrue(listaNumeros.get(0).equals(0),()->"No son iguales,no ha devuelto un 0");
		
	}

	/**
	 * Test devuelve last.
	 */
	@Test
	void testDevuelveLast() {
		
		assertEquals(2,listaNumeros.get(limite-1),()->"No ha devuelto un 2");
		
	}

	/**
	 * Test devuelve suma.
	 */
	@Test
	void testDevuelveSuma() {
		assertEquals(acumulador,listaNumeros.devuelveSuma(),()->"No coincide la suma");
		
	}

	/**
	 * Test add integer.
	 */
	@Test
	void testAddInteger() {
		assertTrue(listaNumeros.add(9),()->"No deja añadir 9 y deberia");
		assertFalse(listaNumeros.add(9),()->"No deja añadir 9 y deberia");
	}

}
