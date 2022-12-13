package principal;

public class MostrarPares {

	public static void main(String[] args) {
		//hacer un programa que muestre los números pares entre 1 y 10

		//recorremos los números del 1 al 10
		for(int i=1;i<=10;i++) {
			//preguntamos si el número es par, y si es así lo mostramos
			if(i%2!=0) {				
				System.out.println(i);
			}	
		}
	}
}
