package com.jgr.empleados.repositorio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.google.gson.Gson;
import com.jgr.cursos.modelo.Curso;
import com.jgr.empleados.modelo.Empleado;


/**
 * The Class EmpleadoRepositorio.
 */
public class EmpleadoRepositorio implements IEmpleadoRepositorio{

	/** The cursos. */
	private List<Empleado> empleados;	
	
	/** The fichero empleados. */
	private  File ficheroEmpleados;
	
	/** The nom fichero. */
	private final String nomFichero="nombreFichero.json";
	
	/** The primera vez. */
	private boolean primeraVez;
	
	
	public EmpleadoRepositorio() {
		if(existeFichero()) {
			borrarFichero();			
		}
		this.empleados= new ArrayList<>();
		crearFichero();
		this.primeraVez=true;
		
		
	}
	
	/**
	 * Existe fichero.
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean existeFichero() {
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
		
	System.out.println("Se ha borrado el archivo");
		
	}

	/**
	 * Crear fichero.
	 */
	@Override
	public void crearFichero() {
		Path ruta= Path.of(nomFichero);
		
		var archivo = new File(nomFichero);
		archivo.exists();
		System.out.println(archivo.exists());
		
		if(!archivo.exists()) {			
			
			try {
				Files.createFile(ruta);
			} catch (IOException e) {
				System.out.println("Error al crear fichero");			
				e.printStackTrace();
			}
			
		}
		System.out.println(archivo.exists());
		
	}

	/**
	 * Gets the nom fichero.
	 *
	 * @return the nom fichero
	 */
	@Override
	public String getNomFichero() {
		return this.nomFichero;
	}

	/**
	 * Listar empleados.
	 *
	 * @return the list
	 */
	@Override
	public List<Empleado> listarEmpleados() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Escribir empleado.
	 *
	 * @param empleado the empleado
	 */
	@Override
	public void escribirEmpleado(Empleado empleado) {
		Gson gson = new Gson();
		String json = gson.toJson(empleado);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomFichero,true))) {
		    bw.write(json);
		   
		} catch (IOException ex) {
		    System.out.println("error que te cagas");
		    ex.getStackTrace();
		}
		
		
	}

	/**
	 * Buscar empleado por nombre.
	 *
	 * @param nombreEmpleado the nombre empleado
	 * @return the optional
	 */
	@Override
	public Optional<Empleado> buscarEmpleadoPorNombre(String nombreEmpleado) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	/**
	 * Buscar empleados por departamento.
	 *
	 * @param departamento the departamento
	 * @return the list
	 */
	@Override
	public List<Empleado> buscarEmpleadosPorDepartamento(String departamento) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Buscar empleado mas antiguo.
	 *
	 * @return the list
	 */
	@Override
	public List<Empleado> buscarEmpleadoMasAntiguo() {
		// TODO Auto-generated method stub
		return null;
	}

}
