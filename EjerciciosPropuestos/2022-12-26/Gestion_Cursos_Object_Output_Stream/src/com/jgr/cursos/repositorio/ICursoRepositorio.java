package com.jgr.cursos.repositorio;

import java.util.List;
import java.util.Optional;

import com.jgr.cursos.modelo.Curso;



/**
 * The Interface ICursoRepositorio.
 */
public interface ICursoRepositorio {
	
	
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
     * Listar cursos.
     *
     * @return the list
     */
    public List<Curso> listarCursos();

    /**
     * Escribir curso.
     *
     * @param curso the curso
     */
    public void escribirCurso(Curso curso);

    /**
     * Buscar curso por nombre.
     *
     * @param nombreCurso the nombre curso
     * @return the optional
     */
    public Optional<Curso> buscarCursoPorNombre(String nombreCurso);
    
    /**
     * Buscar cursos por categoria.
     *
     * @param categoria the categoria
     * @return the list
     */
    public List<Curso> buscarCursosPorCategoria( String categoria);
    
    /**
     * Descontar porcentaje duracion.
     * si la duracion es mayor se le descuenta un 10% 
     *
     * @param duracion the duracion
     * @return the list
     */
    public List<Curso> descontarPorcentajeDuracion(double duracion);   
    
  
    /**
     * añadimos cursos.
     *
     * @param cursos the cursos
     * @return the list
     */
    public List<Curso> setCursos(List<Curso> cursos);	


	
    
}
	