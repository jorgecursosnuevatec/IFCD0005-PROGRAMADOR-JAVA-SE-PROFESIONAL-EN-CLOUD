package com.jgr.interfaces.lanzadora;

import com.jgr.interfaces.IOperaciones;
import com.jgr.interfaces.modelo.Mesa;

/**
 * The Class LanzadoraInterfaces.
 */
public class LanzadoraInterfaces {

	
	public static void main(String[] args) {

		Mesa m = new Mesa();
		
		m.setAlto(5);
		m.setAncho(4);
		m.setLargo(15);
		
		System.out.println("Invertir->"+m.invertir());
		m.girar(4);
		System.out.println("Despues de girar->"+m.toString());
		
		IOperaciones op = new Mesa(2,7,3);
		System.out.println("Invertir->"+op.invertir());
		op.girar(4);
		System.out.println("Despues de girar->"+op.toString());
		
		

	}

}
