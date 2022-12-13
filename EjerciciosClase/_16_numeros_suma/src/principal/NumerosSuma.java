package principal;

public class NumerosSuma {

	public static void main(String[] args) {
		// ¿cuantos numeros tenemos que sumar, empezando por 1, hasta alcanzar
		//o superar el valor 1000?
		int n=0;
		int suma=0;
		while(suma<1000) {
			n++;
			suma=suma+n;			
		}
		System.out.println(n);
	}

}
