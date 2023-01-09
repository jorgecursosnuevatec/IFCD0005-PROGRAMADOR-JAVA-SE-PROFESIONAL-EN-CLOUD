package com.jgr.ejercicio.herencia.model;

import java.util.Objects;

// TODO: Auto-generated Javadoc
/**
 * The Class Punto3D.
 */
public class Punto3D extends Punto {
	
	/** The z. */
	private int z;
	
	/**
	 * Instantiates a new punto 3 D.
	 */
	public Punto3D() {
		super();		
	}
	
	/**
	 * Instantiates a new punto 3 D.
	 *
	 * @param p the p
	 * @param coorz the coorz
	 */
	public Punto3D(Punto p, int coorz) {
		super(p.getX(),p.getY());
		this.z= coorz;
	}
	
	/**
	 * Instantiates a new punto 3 D.
	 *
	 * @param z the z
	 */
	public Punto3D(int z) {
		super(24,25);	
		this.z = z;
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
		this.z = z;
	}


	/**
	 * Gets the z.
	 *
	 * @return the z
	 */
	public int getZ() {
		return z;
	}


	/**
	 * Sets the z.
	 *
	 * @param z the new z
	 */
	public void setZ(int z) {
		this.z = z;
	}

	
	/**
	 * Mover.
	 *
	 * @param d the d
	 */
	public void mover(int d) {
		this.setX(this.getX()+d);
		this.setY(this.getY()+d);
		this.setZ(this.getZ()+d);
	}
	

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(z);
		return result;
	}


	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Punto3D)) {
			return false;
		}
		Punto3D other = (Punto3D) obj;
		return z == other.z;
	}


	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Punto3D [z=" + z + ", getZ()=" + getZ() + ", hashCode()=" + hashCode() + ", getX()=" + getX()
				+ ", getY()=" + getY() + ", "
				+ (super.toString() != null ? "toString()=" + super.toString() + ", " : "")
				+ (getClass() != null ? "getClass()=" + getClass() : "") + "]";
	}

	/**
	 * Dibujar.
	 */
	@Override
	public void dibujar() {
		super.dibujar();
		
		System.out.println(" valor z->"+this.getZ());
		//super.dibujar()+this.z;
	}
	
	
	
	

}
