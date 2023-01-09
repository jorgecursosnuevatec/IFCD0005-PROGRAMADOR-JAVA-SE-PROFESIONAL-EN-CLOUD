package com.jgr.modelo;


/**
 * The Class Cuenta.
 */
public class Cuenta {
	
	/** The saldo. */
	private double saldo;
	
	
	/**
	 * Instantiates a new cuenta.
	 */
	public Cuenta() {
		
	}
	
	/**
	 * Instantiates a new cuenta.
	 *
	 * @param saldo the saldo
	 */
	public Cuenta(double saldo) {
		this.saldo=saldo;
		
	}
		
	/**
	 * Gets the saldo.
	 *
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Sets the saldo.
	 *
	 * @param saldo the new saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	/**
	 * Ingresar saldo.
	 *
	 * @param importe the importe
	 * @return the double
	 */
	public double ingresarSaldo(double importe) {
		return this.saldo+=importe;	
	}
	
	
	/**
	 * Retirar saldo.
	 *
	 * @param importe the importe
	 * @return the double
	 */
	public double retirarSaldo(double importe) {
		return this.saldo-=importe;
	}
	
	

}
