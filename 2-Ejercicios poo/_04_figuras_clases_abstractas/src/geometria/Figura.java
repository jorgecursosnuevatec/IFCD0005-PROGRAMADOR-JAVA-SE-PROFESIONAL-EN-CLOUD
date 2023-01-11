package geometria;

//clase que representa de forma genérica a una figura geométrica
public abstract class Figura {
	private String color;
	public Figura(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract double superficie();
}
