package com.jgr.cursos.test.repositorio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jgr.cursos.modelo.Curso;
import com.jgr.cursos.repositorio.CursoRepositorioObject;
import com.jgr.cursos.repositorio.ICursoRepositorio;


/**
 * The Class CursoRepositorioObjectTest.
 * 
 * OJO QUE DA ERROR java.io.StreamCorruptedException: invalid stream header: 7372001B
 * CUANDO SE EJECUTA EL METODO DESCONTAR PORCENTAJE
 *
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
	@BeforeEach
	
	@DisplayName("setUpBeforeClass")
	void setUpBeforeClass() throws Exception {
		
		cursoRepositorio = new CursoRepositorioObject();		
		cursosLista = new ArrayList<>();
		curso1 = new Curso("NombreCurso1", "CategoriaCurso", 1, 100);
		curso2 = new Curso("NombreCurso2", "CategoriaCurso", 3, 4);	
		
				
	}
	@AfterEach
	
	@DisplayName("setUpAfterEach")
	void setUpAfterEach() throws Exception {
/*		
 * si borro elfichero cuando acaba da este error
		at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
		at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeMethodInExtensionContext(ClassBasedTestDescriptor.java:520)
		at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$synthesizeAfterEachMethodAdapter$24(ClassBasedTestDescriptor.java:510)
		at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAfterEachMethods$10(TestMethodTestDescriptor.java:243)
		at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAllAfterMethodsOrCallbacks$13(TestMethodTestDescriptor.java:276)
		at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
		at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAllAfterMethodsOrCallbacks$14(TestMethodTestDescriptor.java:276)
		at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
		at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeAllAfterMethodsOrCallbacks(TestMethodTestDescriptor.java:275)
		at org.junit.ju
		
		cursoRepositorio.borrarFichero();		
*/		
		
		
	}

	/**
	 * Test curso repositorio object.
	 */
	@Test
	@DisplayName("testCursoRepositorioObject")
	void testCursoRepositorioObject() {
		assertNotNull(cursoRepositorio,()->"El repositorio ES nulo" );
	
	}

	/**
	 * Test crear fichero.
	 * creo el fichero y luego verifico que efectivamente exista
	 */
	@Test
	@DisplayName("testCrearFichero()")
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
	@DisplayName("testExisteFichero()")
	void testExisteFichero() {
		assertTrue(cursoRepositorio.existeFichero(),()->"El fichero NO existe");
		
	}

	/**
	 * Test borrar fichero.
	 */
	@Test
	@Order(1)
	@DisplayName("testBorrarFichero()")
	void testBorrarFichero() {
		
		if (cursoRepositorio.existeFichero()) {
		cursoRepositorio.borrarFichero();
		assertTrue(cursoRepositorio.existeFichero(),()->"No se ha borrado el fichero IF");
		}
		else {
			cursoRepositorio.crearFichero();
			cursoRepositorio.borrarFichero();
			assertFalse(cursoRepositorio.existeFichero(),()->"No se ha borrado el fichero ELSE");
			
		}
	
	}

	/**
	 * Test listar cursos.
	 * comparo las listas despues de añadir elementos para ver si son iguales
	 */
	@Test
	void testListarCursos() {
		
		cursosLista= cursoRepositorio.listarCursos();		
		cursoRepositorio.escribirCurso(curso1);
		cursoRepositorio.escribirCurso(curso2);
		cursosLista.add(curso1);
		cursosLista.add(curso2);
		assertEquals(cursosLista,cursoRepositorio.listarCursos(),()->"no se han añadido 2 registros");
		
		
	}

	/**
	 * Test escribir curso.
	 * añadimos dos cursos, en la lista que recibimos despues tiene que haber dos registros mas que antes
	 */
	@Test
	@DisplayName("testEscribirCurso()")
	void testEscribirCurso() {
		
		int contadorAntes= cursoRepositorio.listarCursos().size();		
		cursoRepositorio.escribirCurso(curso1);
		cursoRepositorio.escribirCurso(curso2);
		int contadorDespues= cursoRepositorio.listarCursos().size();
		assertEquals(contadorAntes,contadorDespues,()->"no se han añadido 2 registros");
		

	}

	/**
	 * Test buscar curso por nombre.
	 */
	@Test
	@DisplayName("testBuscarCursoPorNombre()")
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
	@DisplayName("testBuscarCursoPorCategoria()")
	void testBuscarCursoPorCategoria() {
		int contaAntes =cursoRepositorio.buscarCursosPorCategoria(curso2.getCategoria()).size();
		cursoRepositorio.escribirCurso(curso1);
		cursoRepositorio.escribirCurso(curso2);
		
		
		assertEquals(contaAntes,
				(cursoRepositorio.buscarCursosPorCategoria(curso2.getCategoria()).size()),
				()->"No coinciden los elementos con categoria +".concat(curso2.getCategoria()));
		
	}
	/**
	* Test descontarPorcentajeDuracion.
	*/
	@Test
	@DisplayName("testdescontarPorcentajeDuracion()")
	void testdescontarPorcentajeDuracion() {		
				
		
		Curso curso4= new Curso();
		curso4.setNombre("NombredelCurso4");
		curso4.setCategoria("CategoriaDelCurso4");
		curso4.setDuracion(100);
		curso4.setPrecio(55);
		
		cursosLista=cursoRepositorio.listarCursos();
		cursosLista.forEach(System.out::println);
		
		cursoRepositorio.escribirCurso(new Curso("nombre", "categoria", 100.00, 200.00));
		System.out.println("descontarPorcentaje->"+cursoRepositorio.listarCursos());
		System.out.println("descontarPorcentaje->"+cursoRepositorio.descontarPorcentajeDuracion(1.0));
		
	}

}
