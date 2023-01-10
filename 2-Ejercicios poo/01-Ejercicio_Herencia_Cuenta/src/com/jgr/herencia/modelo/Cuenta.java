package com.jgr.herencia.modelo;

import java.util.Objects;

// TODO: Auto-generated Javadoc
/**
 * The Class Cuenta.
 */
public class Cuenta {
	
	/** The saldo. */
	private double saldo;
	
	/** The num cuenta. */
	private int numCuenta;
	
	/** The contador. */
	private static int contador;
	
	
	/**
	 * Instantiates a new cuenta.
	 */
	public Cuenta() {
		this.numCuenta=++contador;
		
	}

	/**
	 * Instantiates a new cuenta.
	 *
	 * @param saldo the saldo
	 */
	public Cuenta(double saldo) {
		this();
		this.saldo=saldo;
	}
	
	/**
	 * Ingresar.
	 *
	 * @param cantidad the cantidad
	 */
	//métodos
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	
	/**
	 * Extraer.
	 *
	 * @param cantidad the cantidad
	 */
	public void extraer(double cantidad) {
		saldo-=cantidad;
	}
	
	/**
	 * Obtener saldo.
	 *
	 * @return the double
	 */
	public double obtenerSaldo() {
		return saldo;
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
	 * Gets the num cuenta.
	 *
	 * @return the num cuenta
	 */
	public int getNumCuenta() {
		return numCuenta;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(numCuenta, saldo);
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Cuenta)) {
			return false;
		}
		Cuenta other = (Cuenta) obj;
		return this.numCuenta == other.numCuenta;
	}

	/*
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	*/
	
	
}

	
	
