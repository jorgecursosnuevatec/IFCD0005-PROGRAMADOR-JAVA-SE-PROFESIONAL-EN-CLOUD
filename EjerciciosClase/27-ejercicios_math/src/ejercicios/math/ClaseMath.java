package ejercicios.math;

/**
 * The Class ClaseMath.
 */
public class ClaseMath {

	public static void main(String[] args) {

		int maximo = 100000;
	
		int[] numeroOcurrencias = new int[6];
		int numero=0;

		for (int i = 0; i < maximo; i++) {
			//numeros[i] = (int) (Math.random() * Integer.MIN_VALUE + Integer.MAX_VALUE);
			
			numero = (int) (Math.random() * 6 + 1);
			
			System.out.println("numero->"+numero);
			numeroOcurrencias[numero-1]++;
			
		}
		
		for (int i = 0; i <6; i++) {
			System.out.println("Numero->"+ i);
			System.out.println("sale "+numeroOcurrencias[i]);
			System.out.println("porcentaje "+numeroOcurrencias[i]*100/10000.0);
			
			
		}
		
	}	

}
