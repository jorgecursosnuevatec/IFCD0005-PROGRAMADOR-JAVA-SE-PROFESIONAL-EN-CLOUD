package com.jgr.cursos.test.repositorio;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		curso2 = new Curso("NombreCurso2", "CategoriaCurso", 3, 4);
		
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
		assertTrue(fichero.exists(ruta,
				LinkOption.NOFOLLOW_LINKS),()->"El fichero NO existe");
		
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
		cursosLista= cursoRepositorio.listarCursos();		
		cursoRepositorio.escribirCurso(curso1);
		cursoRepositorio.escribirCurso(curso2);
		cursosLista.add(curso1);
		cursosLista.add(curso2);
		int contadorDespues= cursoRepositorio.listarCursos().size();
		assertEquals(cursosLista,cursoRepositorio.listarCursos(),()->"no se han añadido 2 registros");
		
		
	}

	/**
	 * Test escribir curso.
	 * añadimos dos cursos, en la lista que recibimos despues tiene que haber dos registros mas que antes
	 */
	@Test
	void testEscribirCurso() {
		
		int contadorAntes= cursoRepositorio.listarCursos().size();		
		cursoRepositorio.escribirCurso(curso1);
		cursoRepositorio.escribirCurso(curso2);
		int contadorDespues= cursoRepositorio.listarCursos().size();
		assertEquals(contadorAntes+2,contadorDespues,()->"no se han añadido 2 registros");
		

	}

	/**
	 * Test buscar curso por nombre.
	 */
	@Test
	void testBuscarCursoPorNombre() {		
		Curso curso3= new Curso();
		curso3.setNombre("NombredelCurso3");
		curso3.setCategoria("CategoriaDelCurso3");
		curso3.setDuracion(44);
		curso3.setPrecio(55);
		cursoRepositorio.escribirCurso(curso1);
		cursoRepositorio.escribirCurso(curso2);
		cursoRepositorio.escribirCurso(curso3);
		cursosLista=cursoRepositorio.listarCursos();
		assertTrue(cursoRepositorio.listarCursos().contains(curso3),()->"No aparece el curso con el contains");
		assertTrue(curso3.getNombre().equals
				(cursoRepositorio.buscarCursoPorNombre(curso3.getNombre()).get().getNombre()),
				()->"No coincide el nombre del curso 3");
		
	}

	/**
	 * Test buscar curso por categoria.
	 */
	@Test
	void testBuscarCursoPorCategoria() {
		int contaAntes =cursoRepositorio.buscarCursosPorCategoria(curso2.getCategoria()).size();
		cursoRepositorio.escribirCurso(curso1);
		cursoRepositorio.escribirCurso(curso2);
		
		
		assertEquals(contaAntes+2,
				(cursoRepositorio.buscarCursosPorCategoria(curso2.getCategoria()).size()),
				()->"No coinciden los elementos con categoria +".concat(curso2.getCategoria()));
		
	}

}
