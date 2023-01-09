package com.jgr.herencia.modelo;

import java.util.ArrayList;
import java.util.List;


/**
 * The Class CuentaMovimientos.
 */
public class CuentaMovimiento extends CuentaLimite{
	
	
	/** The movimientos cuenta. */
	private List<Movimiento> movimientosCuenta;
	
	
	public CuentaMovimiento() {
		super();
		this.movimientosCuenta = new ArrayList<Movimiento>();		
	}
	
	public CuentaMovimiento(double saldo) {
		this();
		super.setSaldo(saldo);
		
	}
	
	
	public List<Movimiento> getMovimientosCuenta() {
		return this.movimientosCuenta;
	}


	
	public void setMovimientosCuenta(List<Movimiento> movimientosCuenta) {
		this.movimientosCuenta = movimientosCuenta;
	}

	
	
	public void addMovimientoCuenta(Movimiento movimientoCuenta) {
		this.movimientosCuenta.add(movimientoCuenta);
		
	}
	
	
	public Movimiento buscaMovimientoCuenta(Movimiento movimiento) {
		return this.movimientosCuenta.stream().filter(m->m.equals(movimiento)).findAny().orElse(null);
		
	}
	
	public void borraMovimientoCuenta(Movimiento movimiento) {
		
		this.movimientosCuenta.removeIf(m->m.equals(movimiento));
		this.movimientosCuenta.remove(movimiento);
		
		
	}
	

}
