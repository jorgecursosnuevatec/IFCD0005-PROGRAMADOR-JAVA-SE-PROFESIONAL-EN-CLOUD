package com.jgr.herencia.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.jgr.herencia.auxiliar.TipoMovimiento;



/**
 * The Class CuentaMovimientos.
 */
public class CuentaMovimiento extends CuentaLimite{
	
	
	/** The movimientos cuenta. */
	private List<Movimiento> movimientosCuenta;
	
	
	/**
	 * Instantiates a new cuenta movimiento.
	 */
	public CuentaMovimiento() {
		super();
		this.movimientosCuenta = new ArrayList<Movimiento>();		
	}
	
	/**
	 * Instantiates a new cuenta movimiento.
	 *
	 * @param saldo the saldo
	 */
	public CuentaMovimiento(double saldo) {
		this();
		super.setSaldo(saldo);
		
	}
	
	/**
	 * Instantiates a new cuenta movimiento.
	 *
	 * @param saldo the saldo
	 * @param limite the limite
	 */
	public CuentaMovimiento(double saldo,double limite) {
		this();
		super.setSaldo(saldo);
		super.setLimite(limite);
		
	}
	
	
	/**
	 * Gets the movimientos cuenta.
	 *
	 * @return the movimientos cuenta
	 */
	public List<Movimiento> getMovimientosCuenta() {
		return this.movimientosCuenta;
	}


	
	/**
	 * Sets the movimientos cuenta.
	 *
	 * @param movimientosCuenta the new movimientos cuenta
	 */
	public void setMovimientosCuenta(List<Movimiento> movimientosCuentaAniadir) {
		
		
		for (Movimiento m:movimientosCuentaAniadir) {
			addMovimientoCuenta(m);
			}
	}

	
	
	/**
	 * Adds the movimiento cuenta.
	 *
	 * @param movimientoCuenta the movimiento cuenta
	 */
	public void addMovimientoCuenta(Movimiento movimientoCuenta) {
		
		if(movimientoCuenta.equals(TipoMovimiento.HABER)) {
			this.ingresar(movimientoCuenta.getImporte());			
		}
		else {
			this.extraer(movimientoCuenta.getImporte());
		}
		
	}
	
	
	/**
	 * Extraer.
	 *
	 * @param cantidad the cantidad
	 */
	@Override
	public void extraer(double cantidad) {
		
		super.extraer(cantidad);				
		Movimiento mov = new Movimiento(cantidad,TipoMovimiento.DEBE);
		this.movimientosCuenta.add(mov);
	}
	
	/**
	 * Ingresar.
	 *
	 * @param cantidad the cantidad
	 */
	@Override
	public void ingresar(double cantidad) {
		super.ingresar(cantidad);
		Movimiento mov = new Movimiento(cantidad,TipoMovimiento.HABER);
		this.movimientosCuenta.add(mov);
	}
	
	
	/**
	 * Busca movimiento cuenta.
	 *
	 * @param movimiento the movimiento
	 * @return the movimiento
	 */
	public Movimiento buscaMovimientoCuenta(Movimiento movimiento) {
		return this.movimientosCuenta.stream().filter(m->m.equals(movimiento)).findAny().orElse(null);
		
	}
	
	/**
	 * Busca movimiento cuenta por tipo de movimiento.
	 *
	 * @param tipo movimiento
	 * @return los movimientos
	 */
	public List<Movimiento> buscaMovimientoCuentaPorTipo(TipoMovimiento tipo) {
		return this.movimientosCuenta.stream()
				.filter(m->m.getTipo().equals(tipo))
				.collect(Collectors.toList());
	}
	
	/**
	 * Borra movimiento cuenta.
	 * y rehacemos el saldo
	 *
	 * @param movimiento the movimiento
	 */
	public void borraMovimientoCuenta(Movimiento movimiento) {

		// este es el que habria que usar si hubiera mas de un movimiento igual
		//		this.movimientosCuenta.removeIf(m->m.equals(movimiento));
		boolean existe = this.movimientosCuenta.remove(movimiento);

		if (existe) {
			switch(movimiento.getTipo()) {
			case HABER:
				this.setSaldo(this.getSaldo() - movimiento.getImporte());
			case DEBE:
				this.setSaldo(this.getSaldo() + movimiento.getImporte());
			}
		}

	}
		
	}
	


