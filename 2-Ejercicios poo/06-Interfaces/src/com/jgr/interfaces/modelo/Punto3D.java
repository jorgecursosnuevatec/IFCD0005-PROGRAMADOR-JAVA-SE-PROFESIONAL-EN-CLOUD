package com.jgr.interfaces.modelo;

import com.jgr.interfaces.IOperaciones;

// TODO: Auto-generated Javadoc
/**
 * The Class Punto3D.
 */
public class Punto3D extends Punto implements IOperaciones{
	
	/** The z. */
	private int z;
	
	/**
	 * Instantiates a new punto 3 D.
	 *
	 * @param z the z
	 */
	public Punto3D(int z) {
		super(20,8); //llamada a constructor con parámetros de la superclase
		this.z=z;
	}
	
	/**
	 * Instantiates a new punto 3 D.
	 *
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 */
	public Punto3D(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}
	
	/**
	 * Mover.
	 *
	 * @param d the d
	 */
	public void mover(int d) {
		//x=x+d; //no tiene acceso, son privados
		//y=y+d;
		setX(getX()+d); //modificamos atributos heredados a través de setter
		setY(getY()+d);
		z=z+d;
	}
	
	/**
	 * Dibujar.
	 */
	//sobrescribimos el método dibujar()
	@Override
	public void dibujar() {
		//System.out.print("Coordenadas: "+getX()+","+getY()+","+z);
		super.dibujar(); //llamada a la versión original del método
		System.out.println(","+z);
	}

	/**
	 * Girar.
	 *
	 * @param a the a
	 */
	@Override
	public void girar(int a) {
		super.setX(super.getX()+a);
				
	}

	/**
	 * Invertir.
	 *
	 * @return the int
	 */
	@Override
	public int invertir() {
		return this.z-=2;
		
	}
	
}
