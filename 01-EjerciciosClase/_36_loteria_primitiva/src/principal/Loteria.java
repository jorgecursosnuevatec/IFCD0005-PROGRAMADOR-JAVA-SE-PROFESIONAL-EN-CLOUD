package principal;

import java.util.Arrays;

public class Loteria {
	//generar combinación de lotería primitiva (6 números aleatorios no repetidos, entre 1 y 49)
	public static void main(String[] args) {
		int [] combinacion =new int[6];
		int contador=0; //lleva la cuenta de los números válidos generados
		int numeroGenerado;
		while(contador<6) {
			numeroGenerado=(int)(Math.random()*49+1);
			if(!repetido(numeroGenerado,combinacion,contador)) {
				combinacion[contador]=numeroGenerado; //añadimos el número en la posición que le corresponde en el array
				contador++;
			}			
		} //al finalizar while, tenemos todos los números en el array
		ordenar(combinacion);
		imprimir(combinacion);

	}
	
	static boolean repetido(int numero, int[] array, int cont) {
		boolean res=false;
		for(int i=0;i<cont;i++) { //recorremos el array hasta la última posición ocupada
			if(array[i]==numero) {
				res=true;
				break; //si encontramos el número dentro del array, abandonamos el for
			}
		}
		return res;
	}
	static void ordenar(int[] array) {
		//método de la burbuja
		int aux;
		for(int i=0;i<array.length;i++) { //recorre cada número
			for(int k=i+1;k<array.length;k++) { //recorre los siguientes a cada número para la comparación
				if(array[k]<array[i]) { //intercambiar posiciones
					aux=array[k];
					array[k]=array[i];
					array[i]=aux;
				}
			}
		}
		//opción 2, con método sort
		Arrays.sort(array);
	}
	static void imprimir(int[] array) {
		for(int num:array) {
			System.out.println(num);
		}
	}

}
