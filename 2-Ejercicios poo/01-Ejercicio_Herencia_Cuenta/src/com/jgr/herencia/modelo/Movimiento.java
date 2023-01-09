package com.jgr.herencia.modelo;

import java.util.Objects;

import com.jgr.herencia.auxiliar.TipoMovimiento;


/**
 * The Class MovimientoCuenta.
 */
public class Movimiento {
	
	
	/** The contador mvto. */
	static int contadorMvto;
	
	/** The num movimiento. */
	private int numMovimiento;
	
		
	/** The importe. */
	private double importe;
	
	/** The tipo. */
	private TipoMovimiento tipo;

	
	/**
	 * Instantiates a new movimiento.
	 */
	public Movimiento() {
		this.numMovimiento=++contadorMvto;
	}
	
	
	/**
	 * Instantiates a new movimiento cuenta.
	 *
	 * @param importe the importe
	 * @param tipo the tipo
	 */
	public Movimiento(double importe, TipoMovimiento tipo) {
		this();
		this.importe = importe;
		this.tipo = tipo;
	}


	/**
	 * Gets the num movimiento.
	 *
	 * @return the num movimiento
	 */
	public int getNumMovimiento() {
		return numMovimiento;
	}


	/**
	 * Sets the num movimiento.
	 *
	 * @param numMovimiento the new num movimiento
	 */
	public void setNumMovimiento(int numMovimiento) {
		this.numMovimiento = numMovimiento;
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
	public TipoMovimiento getTipo() {
		return tipo;
	}


	/**
	 * Sets the tipo.
	 *
	 * @param tipo the new tipo
	 */
	public void setTipo(TipoMovimiento tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Movimiento [numMovimiento=" + this.numMovimiento + ", importe=" + this.importe + ", tipo=" + this.tipo
				+ "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(importe, numMovimiento, tipo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Movimiento)) {
			return false;
		}
		Movimiento other = (Movimiento) obj;
		return Double.doubleToLongBits(this.importe) == Double.doubleToLongBits(other.importe)
				&& this.numMovimiento == other.numMovimiento && this.tipo == other.tipo;
	}
	
	
	
	

}
