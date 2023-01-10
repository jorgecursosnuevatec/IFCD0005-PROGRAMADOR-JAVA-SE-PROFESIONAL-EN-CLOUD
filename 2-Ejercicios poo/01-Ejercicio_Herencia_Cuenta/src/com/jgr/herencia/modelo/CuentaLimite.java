package com.jgr.herencia.modelo;



// TODO: Auto-generated Javadoc
/**
 * The Class CuentaLimite.
 */
public class CuentaLimite extends Cuenta {
	
	/** The limite. */
	private double limite;
	
	/**
	 * Instantiates a new cuenta limite.
	 *
	 * @param saldo the saldo
	 * @param limite the limite
	 */
	public CuentaLimite(double saldo, double limite) {
		super(saldo);
		this.limite=limite;
	}
	
	/**
	 * Instantiates a new cuenta limite.
	 */
	public CuentaLimite() {
		limite=50;
	}
	
	/**
	 * Ajusta limite.
	 */
	public void ajustaLimite() {
		limite=obtenerSaldo()/2;
	}
	
	/**
	 * Gets the limite.
	 *
	 * @return the limite
	 */
	public double getLimite() {
		return limite;
	}
	
	/**
	 * Sets the limite.
	 *
	 * @param limite the new limite
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	/**
	 * Extraer.
	 *
	 * @param cantidad the cantidad
	 */
	//sobrescritura de extraer
	@Override
	public void extraer(double cantidad) {
		if(cantidad<=limite) {
			super.extraer(cantidad); //llama al extraer de la superclase
		}else {
			super.extraer(limite); //si quiere extraer más del límite, solo le permite el límite
		}
	}
}
