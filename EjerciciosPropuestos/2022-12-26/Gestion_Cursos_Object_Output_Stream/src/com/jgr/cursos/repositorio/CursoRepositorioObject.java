package com.jgr.cursos.repositorio;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jgr.cursos.auxiliar.MiObjectOutputStream;
import com.jgr.cursos.modelo.Curso;


/**
 * The Class CursoRepositorio.
 */
public class CursoRepositorioObject implements ICursoRepositorio {
	
	/** The cursos. */
	private List<Curso> cursos;	
	
	/** The fichero cursos. */
//	private ObjectOutputStream ficheroCursos;
	
	/** The nom fichero. */
	private final String nomFichero="nombreFichero.txt";
	
	/** The primera vez. */
	private boolean primeraVez;
	
	/**
	 * Instantiates a new curso repositorio.
	 */
	public CursoRepositorioObject(){		
		
		if(existeFichero()) {
			borrarFichero();			
		}
		this.cursos= new ArrayList<>();
		crearFichero();
		this.primeraVez=true;
		
	}
	public List<Curso> setCursos(List<Curso> cursos){		
		
		this.cursos.forEach(c->cursos.add(c));
		return this.cursos;
		
	}
	
	public String getNomFichero() {
		return this.nomFichero;
	}
	
	/**
	 * Crear fichero.
	 */
	public void crearFichero() {
		
		/*
		ObjectOutputStream oosRet = null;		
		try(FileOutputStream fos= new FileOutputStream(nomFichero);
				ObjectOutputStream oos = new ObjectOutputStream(fos);){			
			oosRet= oos;		
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		*/
		
		Path ruta= Path.of(nomFichero);
		
		var archivo = new File(nomFichero);
		
		if(!archivo.exists()) {			
			
			try {
				Files.createFile(ruta);
			} catch (IOException e) {
				System.out.println("Error al crear fichero");			
				e.printStackTrace();
			}
			
		}
		
//		this.ficheroCursos=oosRet;
	}

		

	
	/**
	 * Existe fichero.
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean existeFichero(){
		
		var archivo = new File(this.nomFichero);
		return archivo.exists();
	}
	
	/**
	 * Borrar fichero.
	 */
	@Override
	public void borrarFichero() {
		
		try {
			Files.deleteIfExists(Path.of(this.nomFichero));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

	/**
	 * Listar cursos.
	 *
	 * @return the list
	 */
	@Override
	public List<Curso> listarCursos(){
		
		if(this.cursos.size()>0) {
			this.cursos.clear();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(this.nomFichero))){		
//como leemos un objeto serializado el fin fichero es EOFException exc,no se puede controlar 
//de otra manera el fin fichero			
			
			for(;;) {
//				this.cursos.add((Curso) ois.readObject());
//				System.out.println("curso leido->"+ ois.readObject());
				this.cursos.add((Curso) ois.readObject());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e1) {
			// TODO Auto-generated catch block
			System.out.println("EOFException al leer");
//			e1.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		 
		
		System.out.println("Cursos leidos"+cursos.size());
		return this.cursos;

		
	}

	/**
	 * Escribir curso.
	 *
	 * @param curso the curso
	 */
	@Override
	public void escribirCurso(Curso curso){
		if(primeraVez) {
			escribirCursoPrimeraVez(curso);
			}else {
				escribirCursoResto(curso);
			}
	}
	
	/**
	 * Escribir curso primera vez.
	 *
	 * @param curso the curso
	 */
	public void escribirCursoPrimeraVez(Curso curso) {
		
/*		
try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(this.nomFichero))){		
		
		*/
		
	
		
		try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(this.nomFichero))) {
			oos.writeObject(curso);			
			this.primeraVez=false;
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	/**
	 * Escribir curso resto.
	 *    // Se usa un ObjectOutputStream que no escriba una cabecera en
            // el stream.
     * https://www.chuidiang.org/java/ficheros/ObjetosFichero.php
	 * @param curso the curso
	 */
	public void escribirCursoResto(Curso curso) {
		
		  
		  try(MiObjectOutputStream oos= new  MiObjectOutputStream (
	                new FileOutputStream(this.nomFichero,true))) {
			  		Curso cursoNuevo;
			  		cursoNuevo= curso;
	                	oos.writeUnshared(cursoNuevo);
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			
		
	}
	

	/**
	 * Buscar curso por nombre.
	 *
	 * @param nombreCurso the nombre curso
	 * @return the optional
	 */
	@Override
	public Optional<Curso> buscarCursoPorNombre(String nombreCurso){
	
		
		
		return this.listarCursos()
				.stream()
				.filter(c->c.getNombre().equalsIgnoreCase(nombreCurso))
				.findAny();
	}
	
	/**
	 * Buscar curso por categoria.
	 *
	 * @param nombreCategoria the nombre categoria
	 * @return the list
	 */
	@Override
	public List<Curso> buscarCursosPorCategoria(String nombreCategoria){
	
		
		
		return this.listarCursos()
				.stream()
				.filter(c->c.getCategoria().equalsIgnoreCase(nombreCategoria))
				.collect(Collectors.toList());
	}

	@Override
	public List<Curso> descontarPorcentajeDuracion(double duracion) {
		
		List<Curso> cursitos = cursos;
		cursos.clear();
		
		 cursitos.stream()
		.peek(c->System.out.println("\ncurso antes->"+c.getNombre() +"duracion->"+c.getDuracion()))
		.flatMap(curso->	{
			if(curso.getDuracion()>duracion) {
//				double calculo = (curso.getDuracion()*porcentaje)/100;
				
				curso.setDuracion(curso.getDuracion()-(curso.getDuracion()*0.10));
			}
			return Stream.of(curso);
			
		})
		.peek(c->System.out.println("curso despues->"+c.getNombre() +"duracion->"+c.getDuracion()))
		.collect(Collectors.toList())
		;
		 cursos= cursitos;
		 return cursos;
			 

		
	}



}
