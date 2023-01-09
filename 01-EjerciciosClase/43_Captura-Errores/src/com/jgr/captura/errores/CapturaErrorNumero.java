package com.jgr.captura.errores;

public class CapturaErrorNumero {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 3;

		try {
			System.out.println("resultado->" + n2 / n1);

		} catch (ArithmeticException ar) {

			System.out.println("ar.fillInStackTrace()" + ar.fillInStackTrace());
			System.out.println("ar.getCause()" + ar.getCause());
			System.out.println("ar.getClass()" + ar.getClass());
			System.out.println("ar.getLocalizedMessage()" + ar.getLocalizedMessage());
			System.out.println("ar.getMessage()" + ar.getMessage());
			System.out.println("ar.getStackTrace()" + ar.getStackTrace());
			System.out.println("ar.getSuppressed()" + ar.getSuppressed());
			ar.printStackTrace();
			

			for (StackTraceElement t : ar.getStackTrace()) {

				System.out.println("StackTraceElement->" + t);

			}
			for (Throwable t : ar.getSuppressed()) {
				
				System.out.println("Throwable->" + t);
				
			}
			
			System.out.println("***********termino el programa****");
			

		}

	}

}
