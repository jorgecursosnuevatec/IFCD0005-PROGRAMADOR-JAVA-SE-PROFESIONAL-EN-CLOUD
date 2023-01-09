package com.jgr.modelo;


/**
 * The Class MovimientoCuenta.
 */
public class Movimiento {
	
		
	/** The importe. */
	private double importe;
	
	/** The tipo. */
	private String tipo;
	
	
	/**
	 * Instantiates a new movimiento cuenta.
	 *
	 * @param importe the importe
	 * @param tipo the tipo
	 */
	public Movimiento(double importe, String tipo) {
		super();
		this.importe = importe;
		this.tipo = tipo;
	}


	/**
	 * Gets the importe.
	 *
	 * @return the importe
	 */
	public double getImporte() {
		return importe;
	}


	/**
	 * Sets the importe.
	 *
	 * @param importe the new importe
	 */
	public void setImporte(double importe) {
		this.importe = importe;
	}


	/**
	 * Gets the tipo.
	 *
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}


	/**
	 * Sets the tipo.
	 *
	 * @param tipo the new tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
