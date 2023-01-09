package principal;

public class Punto {
	private int x;
	private int y;
	//inicializa atributos
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	//inicializa a valores cualquiera
	public Punto() {
		x=10;
		y=5;
	}
	public Punto(int a) {
		x=a;
		y=a;
	}
	//setter y getter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void dibujar() {
		System.out.print("Coordenadas: "+x+","+y);
	}
	
}
