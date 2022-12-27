package com.jgr.cursos.test.repositorio;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jgr.cursos.modelo.Curso;
import com.jgr.cursos.repositorio.CursoRepositorioObject;
import com.jgr.cursos.repositorio.ICursoRepositorio;


/**
 * The Class CursoRepositorioObjectTest.
 */
class CursoRepositorioObjectTest {
	
	/** The curso repositorio. */
	private static ICursoRepositorio cursoRepositorio;
	private static List<Curso> cursosLista;
	private static Curso curso1;
	private static Curso curso2;
	

	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cursoRepositorio = new CursoRepositorioObject();		
		cursosLista = new ArrayList<>();
		curso1 = new Curso("NombreCurso1", "CategoriaCurso", 1, 2);
		curso2 = new Curso("NombreCurso2", "CategoriaCurso", 1, 2);
	}

	/**
	 * Test curso repositorio object.
	 */
	@Test
	void testCursoRepositorioObject() {
		assertNotNull(cursoRepositorio,()->"El repositorio ES nulo" );
	}

	/**
	 * Test crear fichero.
	 * creo el fichero y luego verifico que efectivamente exista
	 */
	@Test
	void testCrearFichero() {
		cursoRepositorio.crearFichero();
		Path ruta = Path.of(cursoRepositorio.getNomFichero());
		Files fichero = null;
		assertTrue(fichero.exists(ruta, LinkOption.NOFOLLOW_LINKS),()->"El fichero NO existe");
		
	}

	/**
	 * Test existe fichero.
	 */
	@Test
	void testExisteFichero() {
		assertTrue(cursoRepositorio.existeFichero(),()->"El fichero NO existe");
		
	}

	/**
	 * Test borrar fichero.
	 */
	@Test
	void testBorrarFichero() {
		cursoRepositorio.borrarFichero();
		assertFalse(cursoRepositorio.existeFichero(),()->"No se ha borrado el fichero");
		//lo vuelvo a crear para que no falle el resto de procesos
		cursoRepositorio.crearFichero();
	}

	/**
	 * Test listar cursos.
	 */
	@Test
	void testListarCursos() {
		fail("Not yet implemented");
	}

	/**
	 * Test escribir curso.
	 */
	@Test
	void testEscribirCurso() {
		cursoRepositorio.escribirCurso(curso1);
		cursoRepositorio.escribirCurso(curso2);

	}

	/**
	 * Test escribir curso primera vez.
	 */
	@Test
	void testEscribirCursoPrimeraVez() {
		fail("Not yet implemented");
	}

	/**
	 * Test escribir curso resto.
	 */
	@Test
	void testEscribirCursoResto() {
		fail("Not yet implemented");
	}

	/**
	 * Test buscar curso por nombre.
	 */
	@Test
	void testBuscarCursoPorNombre() {
		fail("Not yet implemented");
	}

	/**
	 * Test buscar curso por categoria.
	 */
	@Test
	void testBuscarCursoPorCategoria() {
		fail("Not yet implemented");
	}

}
