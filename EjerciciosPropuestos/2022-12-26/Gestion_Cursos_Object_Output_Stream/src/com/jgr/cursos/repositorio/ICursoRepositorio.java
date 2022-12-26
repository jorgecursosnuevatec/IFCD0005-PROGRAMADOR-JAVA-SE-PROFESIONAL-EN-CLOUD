package com.jgr.cursos.repositorio;

import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Optional;

import com.jgr.cursos.excepciones.ErrorAccesoDatos;
import com.jgr.cursos.excepciones.ErrorConvertirDatos;
import com.jgr.cursos.excepciones.ErrorEscrituraDatos;
import com.jgr.cursos.excepciones.ErrorLecturaDatos;
import com.jgr.cursos.modelo.Curso;

public interface ICursoRepositorio {
	
	
	public boolean existeFichero();
	
    public void borrarFichero();
    
    public void crearFichero(); 
	
    public List<Curso> listarCursos();

    public void escribirCurso(Curso curso);

    public Optional<Curso> buscarCursoPorNombre( String nombreCurso);
    
    public List<Curso> buscarCursoPorCategoria( String categoria);    



	
    
}
	