package com.jgr.abstractas.lanzadora;

import com.jgr.clases.abstractas.modelo.Circulo;
import com.jgr.clases.abstractas.modelo.Figura;
import com.jgr.clases.abstractas.modelo.Triangulo;

/**
 * The Class ANONIMA
 */
public class LanzadoraFigura {

	public static void main(String[] args) {
		
		Figura cir = new Circulo("Amarillo",15);
		Figura tri = new Triangulo("Amarillo",15,10);
		
//		System.out.print("\ncirculo-figura->"+(cir instanceof Figura));
//		System.out.print("\tfigura-circlo>"+(cir instanceof Circulo));

		
		//esta seria una clase ANONIMA, seria una subclase de figura
		Figura f = new Figura("verde") {
			@Override
			public double superficie() {
				return 10*2;
			}
		};
		
		System.out.println("F NO es figura,es una subclase->"+f.getClass().toString());
		System.out.println("F instance of->"+(f instanceof Figura));
		System.out.println("F instance of->"+(f instanceof Circulo));
		
		

	}

}
