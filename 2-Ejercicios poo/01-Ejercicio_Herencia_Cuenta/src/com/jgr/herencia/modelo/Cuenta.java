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

	public Cuenta(double saldo) {
		this();
		this.saldo=saldo;
	}
	//métodos
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	public void extraer(double cantidad) {
		saldo-=cantidad;
	}
	
	public double obtenerSaldo() {
		return saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numCuenta, saldo);
	}

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

	
	
