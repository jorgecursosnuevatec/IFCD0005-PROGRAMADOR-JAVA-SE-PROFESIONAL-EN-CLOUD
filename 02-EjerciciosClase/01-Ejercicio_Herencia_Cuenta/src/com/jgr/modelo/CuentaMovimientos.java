package com.jgr.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CuentaMovimientos extends CuentaLimite{
	
	private CuentaLimite cuentaLimite;	
	private List<Movimiento> movimientosCuenta;
	
	public CuentaMovimientos() {
		super();
		this.movimientosCuenta = new ArrayList<Movimiento>();		
	}
	

	public CuentaMovimientos(CuentaLimite cuentaLimite, List<Movimiento> movimientosCuenta) {
		this();		
		this.cuentaLimite = cuentaLimite;		
		this.movimientosCuenta=movimientosCuenta;
	}

	public CuentaLimite getCuentaLimite() {
		return cuentaLimite;
	}

	public void setCuentaLimite(CuentaLimite cuentaLimite) {
		this.cuentaLimite = cuentaLimite;
	}

	public List<Movimiento> getMovimientosCuenta() {
		return this.movimientosCuenta;
	}


	public void setMovimientosCuenta(List<Movimiento> movimientosCuenta) {
		this.movimientosCuenta = movimientosCuenta;
	}

	
	public List<Movimiento> addMovimientoCuenta(Movimiento movimientoCuenta) {
		this.movimientosCuenta.add(movimientoCuenta);
		return this.movimientosCuenta;
	}
	
	public Movimiento buscaMovimientoCuenta(Movimiento movimiento) {
		
		
		
	}
	

}
