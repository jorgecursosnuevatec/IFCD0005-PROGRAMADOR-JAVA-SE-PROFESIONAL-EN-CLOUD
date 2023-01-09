package principal;

public class Temperaturas {

	public static void main(String[] args) {
		//double[] temps= {23.7,11.3,18.4,30.1,28.5,16.2};
		String valores="23.7,11.3,18.4,30.1,28.5,16.2";
		String [] datos=valores.split(",");//transformar texto en array de textos
		double[] temps=new double[datos.length];
		for(int i=0;i<datos.length;i++) { //llevar los textos con formato numérico a un array de números
			temps[i]=Double.parseDouble(datos[i]);
		}
		
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
			if(temps[i]>=media) {
				contador++; //forma abreviada de contador=contador+1;
			}
		}
		System.out.println(contador);		
	}
}
