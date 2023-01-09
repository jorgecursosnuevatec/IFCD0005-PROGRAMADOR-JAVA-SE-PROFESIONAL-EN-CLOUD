package com.jgr.modelo;


/**
 * The Class CuentaLimite.
 */
public class CuentaLimite extends Cuenta {
	
	
	/** The limite. */
	private double limite;
	
	/**
	 * Instantiates a new cuenta limite.
	 */
	public CuentaLimite() {
		super();
	}
	
	/**
	 * Instantiates a new cuenta limite.
	 *
	 * @param saldo the saldo
	 */
	public CuentaLimite(double saldo) {
		super(saldo);		
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
	 * Ajustar limite.
	 *
	 * @return the double
	 */
	public double ajustarLimite() {		
		this.setLimite((this.getSaldo()/2));
		return this.getLimite();		
		
	}
		
	/**
	 * Se puede.
	 *
	 * @param importe the importe
	 * @return true, if successful
	 */
	public boolean sePuede(double importe) {
		
		return  importe<this.ajustarLimite()?true:false;
	}
	
	
	/**
	 * Retirar saldo.
	 *
	 * @param importe the importe
	 * @return the double
	 */
	@Override
	public double retirarSaldo(double importe) {
		
		double importeTrabajo=0;
		
		if (this.sePuede(importe)) {			
			super.retirarSaldo(importe);
			importeTrabajo= super.getSaldo();		
	}else {
			super.retirarSaldo(this.getLimite());
			importeTrabajo=super.getSaldo();
		
	}
		return importeTrabajo;
		
		
		
	}

}
