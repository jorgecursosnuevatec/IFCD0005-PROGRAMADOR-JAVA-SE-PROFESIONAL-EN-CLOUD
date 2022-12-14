package com.genera.boleto.primitiva;


/**
 * The Class GeneraBoletoPrimitiva.
 * Genera boleto de primitiva sin repetir numeros, y lo ordena en ascendente
 */
public class GeneraBoletoPrimitiva {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		int[] numerosQueVanATocar;
		final int NUMERO_MINIMO =1;
		final int NUMERO_MAXIMO =46;
		final int NUMERO_APUESTAS =6;		
		boolean repetido =false;
		int guardadas=0;
		int numero=0;
		int contaRepeticiones=0;
		
		
		numerosQueVanATocar = new int[NUMERO_APUESTAS];

		do {
				repetido = false;
				numero = (int) (Math.random() * (NUMERO_MAXIMO + 1 - NUMERO_MINIMO) + NUMERO_MINIMO);
				System.out.println("numero generado->"+numero);
				// hasta que llegue al final,o el array este vacio o exista
				for (int k = 0; k < NUMERO_APUESTAS && numerosQueVanATocar[k] != 0 && !repetido; k++) {
					if (numerosQueVanATocar[k] == numero) {
						repetido = true;
					}
				}
				
				if(!repetido) {
					numerosQueVanATocar[guardadas]= numero;
					guardadas++;
					System.out.println("no esta repetido->"+numero);
					System.out.println("guardados->"+guardadas);
				}
				contaRepeticiones++;
				
				
			
		} while (guardadas < NUMERO_APUESTAS);
		
		
		System.out.println("\nNumerosGenerados->"+contaRepeticiones);
		
		
		 for (int x = 0; x < numerosQueVanATocar.length; x++) {
		        // Aquí "y" se detiene antes de llegar
		        // a length - 1 porque dentro del for, accedemos
		        // al siguiente elemento con el índice actual + 1
		        for (int y = 0; y < numerosQueVanATocar.length - 1; y++) {
		            int elementoActual = numerosQueVanATocar[y],
		                    elementoSiguiente = numerosQueVanATocar[y + 1];
		            if (elementoActual > elementoSiguiente) {
		                // Intercambiar
		            	numerosQueVanATocar[y] = elementoSiguiente;
		            	numerosQueVanATocar[y + 1] = elementoActual;
		            }
		        }
		    }
        
        for(Integer leido:numerosQueVanATocar) {
        	System.out.println("numero->"+leido);
        	
        }

	}

}
