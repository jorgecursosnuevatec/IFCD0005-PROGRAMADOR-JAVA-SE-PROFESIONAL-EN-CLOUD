package com.jgr.interfaces.lanzadora;

import com.jgr.interfaces.IOperaciones;
import com.jgr.interfaces.modelo.Mesa;
import com.jgr.interfaces.modelo.Punto3D;


/**
 * The Class Test.
 * polimorfismo con interfaces
 */
public class Test {
	
	public static void main(String[] args) {
		IOperaciones op;
		op=new Mesa(2,7,3);
		procesar(op);
		procesar(new Mesa(2,7,3));		
		procesar(new Punto3D(1,6,2));
		

	}
	
	/**
	 * Procesar.
	 *
	 * @param op the op
	 */
	static void procesar(IOperaciones op) {
		op.girar(10);
		System.out.println(op.invertir());
	}

}