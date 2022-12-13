package principal;

public class Temperaturas {

	public static void main(String[] args) {
		double[] temps= {23.7,11.3,18.4,30.1,28.5,16.2};
		//¿cuantas ciudades tienen una temperatura superior a la media?
		//1. calcular la temperatura media
		double media=0;
		int contador=0;
		for(int i=0;i<temps.length;i++) {
			media=media+temps[i];
		}
		media=media/temps.length;
		System.out.println(media);
		//2. contar cuantas temperaturas son superiores al valor calculado
		for(int i=0;i<temps.length;i++) {
			if(temps[i]>media) {
				contador++; //forma abreviada de contador=contador+1;
			}
		}
		System.out.println(contador);		
	}

}
