package principal;

public class MensajePrecio {

	public static void main(String[] args) {
		int precio=7;
		//si el precio es 10 el mensaje es "muy caro", si es 9 "caro"
		//si es 8 "aceptable", si es 7 "lo compro" si es 6 "barato"
		
		switch(precio) {
			case 10:
				System.out.println("muy caro");
				break;
			case 9:
				System.out.println("caro");
				break;
			case 8:
				System.out.println("aceptable");
				break;
			case 7:
				System.out.println("lo compro");
				break;
			case 6:
				System.out.println("barato");
				break;
			default:
				System.out.println("precio no válido");
		}
	}
}
