package principal;

public class Punto3D extends Punto{
	private int z;
	public Punto3D(int z) {
		super(20,8); //llamada a constructor con parámetros de la superclase
		this.z=z;
	}
	public Punto3D(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}
	public void mover(int d) {
		//x=x+d; //no tiene acceso, son privados
		//y=y+d;
		setX(getX()+d); //modificamos atributos heredados a través de setter
		setY(getY()+d);
		z=z+d;
	}
	//sobrescribimos el método dibujar()
	@Override
	public void dibujar() {
		//System.out.print("Coordenadas: "+getX()+","+getY()+","+z);
		super.dibujar(); //llamada a la versión original del método
		System.out.println(","+z);
	}
	
}
