package service;

public class CuentaLimite extends Cuenta{
	private double limite;
	
	public CuentaLimite(double saldo, double limite) {
		super(saldo);
		this.limite=limite;
	}
	public CuentaLimite() {
		limite=50;
	}
	
	public void ajustaLimite() {
		limite=obtenerSaldo()/2;
	}
	
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
