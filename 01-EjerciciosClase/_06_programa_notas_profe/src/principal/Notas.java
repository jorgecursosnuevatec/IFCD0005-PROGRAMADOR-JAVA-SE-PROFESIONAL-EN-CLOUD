package principal;

public class Notas {

	public static void main(String[] args) {
		//nota supuesta
		int nota=9;
		//si la nota está entre 1 y 4, el mensaje es "suspenso"
		//si está entre 5 y 6, "aprobado"
		//si esta entre 7 y 8, "notable"
		//si está entre 9 y 10, "sobresaliente"
		//con cualquier otro valor, "nota no válida"
		//SOLUCION ANTERIOR A JAVA 17
		switch(nota) {
			case 1:
			case 2:			
			case 3:
			case 4:
				System.out.println("suspenso");
				break;
			case 5:
			case 6:
				System.out.println("aprobado");
				break;			
			case 7:
			case 8:
				System.out.println("notable");
				break;
			case 9:
			case 10:
				System.out.println("sobresaliente");
				break;
			default:
				System.out.println("nota no válida");
		}
		//SOLUCIÓN JAVA 17
		switch(nota) {
			case 1,2,3,4:
				System.out.println("suspenso");
				break;
			case 5,6:	
				System.out.println("aprobado");
				break;			
			case 7,8:
				System.out.println("notable");
				break;
			case 9,10:
				System.out.println("sobresaliente");
				break;
			default:
				System.out.println("nota no válida");
		}
		//SOLUCIÓN CON IF 
		if(nota>=1&&nota<=4) {
			System.out.println("suspenso");
		}
		if(nota>=5&&nota<=6) {
			System.out.println("aprobado");
		}
		if(nota>=7&&nota<=8) {
			System.out.println("notable");
		}
		if(nota>=9&&nota<=10) {
			System.out.println("sobresaliente");
		}

	}

}
