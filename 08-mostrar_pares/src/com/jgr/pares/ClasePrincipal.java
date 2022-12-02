package com.jgr.pares;

public class ClasePrincipal {

	public static void main(String[] args) {
		int sumatorio = 0;
		int sumatorioPares = 0;
		int sumatorioImpares = 0;

		for (int i = 0; i <= 10; i++) {

			if (i % 2 == 0) {
//				System.out.println("i es par->" + i);
				sumatorioPares += i;
			} else {

//				System.out.println("es impar->" + i);
				sumatorioImpares += i;

			}

			sumatorio += i;
		}

		System.out.println("salida del for sumatorio->" + sumatorio);
		System.out.println("salida del for sumatorioPares->" + sumatorioPares);
		System.out.println("salida del for sumatorioImpares->" + sumatorioImpares);
		
		

		int i = 0;
		sumatorio = 0;
		sumatorioPares = 0;
		sumatorioImpares = 0;

		while (i <= 10) {
			if (i %2 == 0) {
	//			System.out.println("i es par->" + i);
				sumatorioPares += i;
			} else {

	//			System.out.println("es impar->" + i);
				sumatorioImpares += i;

			}

			
			sumatorio += i;
			i++;
			
		}
		
		System.out.println("salida del while sumatorio->" + sumatorio);
		System.out.println("salida del while sumatorioPares->" + sumatorioPares);
		System.out.println("salida del while sumatorioImpares->" + sumatorioImpares);
		

		i = 0;
		sumatorio = 0;
		sumatorioPares = 0;
		sumatorioImpares = 0;

		do {
			if (i %2== 0) {
//				System.out.println("i es par->" + i);
				sumatorioPares += i;
			} else {

//				System.out.println("es impar->" + i);
				sumatorioImpares += i;

			}
			
			
			sumatorio += i;
			i++;

		} while (i <=10);
		
		System.out.println("salida del dowhile sumatorio->" + sumatorio);
		System.out.println("salida del dowhile sumatorioPares->" + sumatorioPares);
		System.out.println("salida del dowhile sumatorioImpares->" + sumatorioImpares);
		

	}

}
