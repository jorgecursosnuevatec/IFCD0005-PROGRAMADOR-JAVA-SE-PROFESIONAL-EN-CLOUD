package com.jgr.empleados.repositorio;

import java.util.List;
import java.util.Optional;

import com.jgr.empleados.modelo.Empleado;



public interface IEmpleadoRepositorio {
	
	/**
	 * Existe fichero.
	 *
	 * @return true, if successful
	 */
	public boolean existeFichero();
	
    /**
     * Borrar fichero.
     */
    public void borrarFichero();
    
    /**
     * Crear fichero.
     */
    public void crearFichero(); 
    
    /**
     * Gets the nom fichero.
     *
     * @return the nom fichero
     */
    public String getNomFichero();
	
    /**
     * Listar empleados.
     *
     * @return the list
     */
    public List<Empleado> listarEmpleados();

    /**
     * Escribir empleado.
     *
     * @param empleado the empleado
     */
    public void escribirEmpleado(Empleado empleado);

    /**
     * Buscar empleado por nombre.
     *
     * @param nombreEmpleado the nombre empleado
     * @return the optional
     */
    public Optional<Empleado> buscarEmpleadoPorNombre( String nombreEmpleado);
    
    /**
     * Buscar empleados por categoria.
     *
     * @param categoria the categoria
     * @return the list
     */
    public List<Empleado> buscarEmpleadosPorDepartamento( String departamento);
    
    /**
     * Descontar porcentaje duracion.
     * si la duracion es mayor se le descuenta un 10% 
     *
     * @param duracion 
     * @return the list
     */
    public List<Empleado> buscarEmpleadoMasAntiguo();   
    
  



}
