package service;

public class Cuenta {
	private double saldo;
	public Cuenta() {
		saldo=100;
	}
	public Cuenta(double saldo) {
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
	
}
