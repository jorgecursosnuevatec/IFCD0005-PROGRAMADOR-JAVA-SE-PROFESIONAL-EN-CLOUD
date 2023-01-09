package com.jgr.paquete;

public class Bucles {

	public static void main(String[] args) {

		int sumatorio = 0;

		for (int i = 0; i <= 10; i++) {
			/*
			 * if (i % 2 == 0) { System.out.println("i es par->" + i); } else {
			 * System.out.println("es impar->" + i); }
			 */
			sumatorio += i;
		}

		System.out.println("resultado->" + sumatorio);

		int n = 0;
		int s = 0;
		while (n < 10) {

			System.out.println("s->" + s + " n->" + n);

			n++;
			s += n;

		}

	}

}
