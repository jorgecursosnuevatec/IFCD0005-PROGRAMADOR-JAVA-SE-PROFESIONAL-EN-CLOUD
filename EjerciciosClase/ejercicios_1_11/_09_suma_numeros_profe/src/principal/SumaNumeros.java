package principal;

public class SumaNumeros {

	public static void main(String[] args) {
		//tenemos dos números en dos variables cualquiera
		//hacer un programa muestre la suma de todos los números naturales
		//comprendidos entre ellos
		int a=12, b=9;
		int suma=0;
		/*solución 1
		if(a<b) {
			for(int i=a;i<=b;i++) {
				suma=suma+i;
			}
		}else {
			for(int i=b;i<=a;i++) {
				suma=suma+i;
			}
		}
		*/
		//solución 2
		int menor, mayor;
		if(a<b) {
			menor=a;
			mayor=b;
		}else {
			menor=b;
			mayor=a;
		}
		for(int i=menor;i<=mayor;i++) {
			suma=suma+i;
		}
		
		System.out.println(suma);

	}

}
