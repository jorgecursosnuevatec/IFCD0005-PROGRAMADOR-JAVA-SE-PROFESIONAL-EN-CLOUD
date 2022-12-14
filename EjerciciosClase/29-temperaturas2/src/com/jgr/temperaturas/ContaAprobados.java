package com.jgr.temperaturas;

public class ContaAprobados {

	public static void main(String[] args) {
		
		String valores = "5,8,2,3,7,1,9,4";

		String[] valoresFormat = valores.split(",");

		int contaAprobados = 0;

		for (int i = 0; i < valoresFormat.length; i++) {

			contaAprobados = (Integer.parseInt(valoresFormat[i])) >= 5 ? ++contaAprobados : contaAprobados;

		}

		System.out.println("Hay " + contaAprobados + " aprobados");

	}

}
