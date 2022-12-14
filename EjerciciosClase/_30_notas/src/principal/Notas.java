package principal;

import java.util.Arrays;

public class Notas {

	public static void main(String[] args) {
		int aprobados=0;
		String valores="5,8,2,3,7,1,9,4";
		//¿cuanto aprobados hay?
		
		//solucion larga
		/*String[] datos=valores.split(",");
		int[] notas=new int[datos.length];
		for(int i=0;i<datos.length;i++) {
			notas[i]=Integer.parseInt(datos[i]);
		}		
		//contar aprobados		
		for(int i=0;i<notas.length;i++) {
			if(notas[i]>=5) {
				aprobados++;
			}
		}*/
		//solución corta
		String[] datos=valores.split(",");
		for(int i=0;i<datos.length;i++) {
			if(Integer.parseInt(datos[i])>=5) {
				aprobados++;
			}
		}		
		System.out.println(aprobados);
		//futuro
		System.out.println(
				Arrays.stream(valores.split(","))
				.filter(n->Integer.parseInt(n)>=5)
				.count()			
				);
		
		
	}

}
