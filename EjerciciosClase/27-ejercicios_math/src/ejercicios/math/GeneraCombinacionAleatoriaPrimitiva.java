package ejercicios.math;


/**
 * The Class GeneraCombinacionAleatoriaPrimitiva.
 * Generar 6 numerosaleatorios que no se repitan entre el 1 y el 49
 * 
 */
public class GeneraCombinacionAleatoriaPrimitiva {

	
	public static void main(String[] args) {
		
		int maximo = 6;
		int[] ganadora = new int[maximo];
		int numero_maximo = 49;// Integer.MAX_VALUE;
		int numero_minimo = 1;// Integer.MIN_VALUE;
		boolean existe = false;
		int contarellenos=0;		
		int numero=0;		
		int contaveces =0;
		
		do {
			
			numero = (int) (Math.random() * (numero_maximo - numero_minimo) + numero_minimo);
			System.out.println("entro en do while numero generado->" + numero);
			existe = false;

			for (int i = 0; (i < ganadora.length && !existe); i++) {

				if (ganadora[i] == numero) {
					existe = true;
					System.out.println("existe ->" + numero + " en->" + ganadora[i]);
				}
			}
			
			if(!existe) {
				ganadora[contarellenos]=numero;
				contarellenos++;
				System.out.println("tengo cargadas "+contarellenos);
				System.out.println("*****GUARDADO "+numero);
				
				
			}else {System.out.println(" el numero existe->"+ numero);}
			
						
			contaveces++;
			
			if (contaveces>500) {break;}
			
		}while(contarellenos<maximo);
		
		System.out.println("veces que ha hecho el bucle->"+contaveces);
		
		
		int aux = 0;
		
		for (int i = 0; i < ganadora.length - 1; i++) {
			for (int j = 0; j < ganadora.length - i - 1; j++) {
				if (ganadora[j + 1] < ganadora[j]) {
					aux = ganadora[j + 1];
					ganadora[j + 1] = ganadora[j];
					ganadora[j] = aux;
				}
			}
		}
        
		for (Integer numeroLoteria : ganadora) {
			System.out.println("numero->" + numeroLoteria);

		}
		
	}

}
