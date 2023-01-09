package _14_loteria_primitiva;

public class Loteria {

	public static void main(String[] args) {
		int[] ganadora= {3,7,11,22,29,40};
		int[] boleto= {3,10,11,22,33,40};
		int [] premios= {0,0,8,200,35000,150000};
		//hacer un programa que nos diga cuanto aciertos hay en el boleto
		int aciertos=0;
		for(int i=0;i<boleto.length;i++) {
			for(int k=0;k<ganadora.length;k++) {
				if(boleto[i]==ganadora[k]) { //acierto encontrado
					aciertos++;
					break;
				}
			}
		}
		System.out.println(aciertos);
		//indicar el premio que le corresponde
		System.out.println("Premio: "+premios[aciertos-1]);
		
	}

}
