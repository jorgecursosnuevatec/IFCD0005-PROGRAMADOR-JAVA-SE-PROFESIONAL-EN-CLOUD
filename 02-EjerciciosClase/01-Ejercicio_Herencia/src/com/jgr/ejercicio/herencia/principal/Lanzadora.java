package com.jgr.ejercicio.herencia.principal;

import com.jgr.ejercicio.herencia.model.Punto;
import com.jgr.ejercicio.herencia.model.Punto3D;


/**
 * The Class Lanzadora.
 */
public class Lanzadora {

	
	public static void main(String[] args) {
		
		Punto p1= new Punto();
		Punto p2 = new Punto(3,7);
		
		p1.dibujar();
		p2.dibujar();
		
		
		Punto3D p1D = new Punto3D(4);
		System.out.println("\np1D informada solo la z");
		p1D.dibujar();
		p1D.mover(33);
		
		p1D= new Punto3D(26,27,28);
		System.out.println("\np1D informada x,y z");
		p1D.dibujar();
		p1D.mover(10);
		System.out.println("\np1D despues de mover");
		p1D.dibujar();
		
		
		
		
		
	}

}
