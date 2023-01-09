package com.jgr.lanzadora;

import com.jgr.modelo.CuentaLimite;

/**
 * The Class Lanzadora.
 * Clase Cuenta con atributo saldo inicializado en el constructor
 * metodos ingresar,sacar dinero,obtener saldo
 * 
 * crear subclase de cuenta con limite maximo que se podra extraer
 * con un metodo ajustarLimite() , que sera la mitad del saldo existente
 * 
 * 
 * otra clase que guarde movimientos realizados en cuenta ingreso/retirada
 * cada moviminto tiene cantidad y tipo
 * metodo para obtener los movimientos
 * 
 */
public class Lanzadora {

	
	public static void main(String[] args) {
		
		CuentaLimite cl = new CuentaLimite(2000);
		
		System.out.println("saldo inicial->"+cl.getSaldo());
		System.out.println("limite inicial->"+cl.getLimite());
		System.out.println("ajustar limite->"+cl.ajustarLimite());
		
		
		
	

	}

}
