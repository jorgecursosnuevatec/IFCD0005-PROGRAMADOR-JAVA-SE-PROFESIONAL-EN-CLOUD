package com.jgr.abstractas.lanzadora;

import com.jgr.clases.abstractas.modelo.Circulo;
import com.jgr.clases.abstractas.modelo.Figura;
import com.jgr.clases.abstractas.modelo.Triangulo;

/**
 * The Class LanzadoraFigura.
 * crear triangulo y circulo
 */
public class LanzadoraFigura {

	public static void main(String[] args) {
		
		Figura cir = new Circulo("Amarillo",15);
		Figura tri = new Triangulo("Amarillo",15,10);
		
		System.out.print("\ncirculo-figura->"+(cir instanceof Figura));
		System.out.print("\tfigura-circulo->"+(cir instanceof Circulo));
		System.out.print("\tcirculo-objeto->"+(cir instanceof Object));
		

	}

}
