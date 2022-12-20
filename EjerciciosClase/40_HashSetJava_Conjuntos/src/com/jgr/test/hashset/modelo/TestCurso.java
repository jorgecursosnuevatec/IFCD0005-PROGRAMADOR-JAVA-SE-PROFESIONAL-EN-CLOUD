package com.jgr.test.hashset.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jgr.hashset.modelo.Curso;

class TestCurso {
	static Set<Curso> cursos = new HashSet<>();
	static Curso curso1;
	static Curso curso2;
	static Curso curso3;
	static Curso curso4;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		Curso cur;
		for (int i=0;i<10;i++) {
			
			cur= new Curso();
			cur.setCursoNombre("Curso"+i);
			cur.setDuracion(i);
			cur.setPrecio(i);
			cur.setTematica("Tematica"+i);
			cursos.add(cur);
			
		}
		
		curso1 = new Curso("Curso1",1,"Tematica1",1.0);
		curso2 = new Curso("Curso2",2,"Tematica2",2.0);
		curso3 = new Curso("Curso3",3,"Tematica3",3.0);
		curso4 = new Curso("Curso4",4,"Tematica4",4.0);
		
		
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testCursoStringIntStringDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCursoNombre() {
	assertEquals("Curso1",curso1.getCursoNombre(),()->"No coincide el nombre del curso");
	}

	@Test
	void testSetCursoNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDuracion() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDuracion() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTematica() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTematica() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPrecio() {
		fail("Not yet implemented");
	}

	@Test
	void testSetPrecio() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
