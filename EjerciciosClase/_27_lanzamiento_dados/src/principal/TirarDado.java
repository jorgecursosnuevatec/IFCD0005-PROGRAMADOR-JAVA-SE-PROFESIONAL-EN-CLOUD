package principal;

public class TirarDado {
	public static void main(String[] args) {		
		//tirar el dado 10000 veces y mostrar el porcentaje obtenido de cada número
		int [] contadores=new int[6]; //contadores de tiradas de cada número
		for(int i=1;i<=10000;i++) {
			//se lanza el dado, y se incrementa el contador que corresponde al número obtenido
			int dado=(int)(Math.random()*6+1);
			/*switch(dado) {
				case 1:
					contadores[0]++;
					break;
				case 2:
					contadores[1]++;
					break;
				case 3:
					contadores[2]++;
					break;
				case 4:
					contadores[3]++;
					break;
				case 5:
					contadores[4]++;
					break;
				case 6:
					contadores[5]++;
					break;
			}*/
			contadores[dado-1]++;		
		}
		
		//ahora sacamos los porcentajes de cada uno, recorriendo el array
		//de contadores y scando porcentaje de cada uno
		for(int i=0;i<contadores.length;i++) {
			System.out.println(contadores[i]*100/10000.0);
		}
		

	}

}
