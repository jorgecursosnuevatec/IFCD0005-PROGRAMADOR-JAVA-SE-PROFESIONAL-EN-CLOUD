package _12_contar_mayores_array;

public class ContarMayores {

	public static void main(String[] args) {
		int[] numeros= {16,8,37,14,25};
		int dato=15;
		int contador=0;
		//contar cuantos números hay en el array que sean mayores que dato
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>dato) {
				contador=contador+1; //incrementar contador  contador++;
			}
		}
		System.out.println(contador);
	}

}
