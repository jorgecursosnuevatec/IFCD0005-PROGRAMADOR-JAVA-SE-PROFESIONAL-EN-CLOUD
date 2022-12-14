package principal;

public class TemperaturasModular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valores="23.7,11.3,18.4,30.1,28.5,16.2";
		String [] datos=valores.split(",");//transformar texto en array de textos
		double[] temps=new double[datos.length];
		for(int i=0;i<datos.length;i++) { //llevar los textos con formato numérico a un array de números
			temps[i]=Double.parseDouble(datos[i]);
		}
		
		System.out.println("Temperaturas superiores a media: "+calcularSuperiores(calcularMedia(temps),temps));
	}
	
	static double calcularMedia(double [] temperaturas) {
		double media=0;
		for(int i=0;i<temperaturas.length;i++) {
			media=media+temperaturas[i];
		}
		media=media/temperaturas.length;
		return media;
	}
	
	static int calcularSuperiores(double media, double [] temperaturas) {
		int contador=0;
		for(int i=0;i<temperaturas.length;i++) {
			if(temperaturas[i]>=media) {
				contador++; //forma abreviada de contador=contador+1;
			}
		}
		return contador;
	}

}
