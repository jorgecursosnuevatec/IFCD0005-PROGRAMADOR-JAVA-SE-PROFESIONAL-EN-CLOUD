package com.jgr.paquete;

public class EjemploSwitch {

	public static void main(String[] args) {

		var diaSemana = "lunes";

		switch (diaSemana) {
		case "lunes":
			System.out.println("es lunes");
		case "martes":
			System.out.println("es martes");
		default:
			System.out.println("por defecto");
		}

		int precio = 55;

		switch (precio) {
		case (10):
			System.out.println("muy caro");
			break;
		case (9):
			System.out.println("caro");
			break;
		case (8):
			System.out.println("aceptable");
			break;
		case (7):
			System.out.println("lo compro");
			break;
		case (6):
			System.out.println("barato");
			break;
		default:
			System.out.println("salgo por el break");

		}

	}

}
