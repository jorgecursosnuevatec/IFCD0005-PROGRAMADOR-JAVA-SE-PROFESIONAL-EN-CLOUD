package principal;

import model.Alumno;
import model.Empleado;

public class PruebaAlumnos {

	public static void main(String[] args) {
		Alumno alumno=new Alumno("alumno 1","Java",8,"alumno@gmail.com");
		System.out.println("Nombre del alumno: "+alumno.getNombre());
		System.out.println("Curso del alumno: "+alumno.getCurso());
		alumno.setNota(5);
		//array de empleados
		Empleado[] empleados=new Empleado[10];
		empleados[0]=new Empleado("a","aa",100);
		
	}

}
