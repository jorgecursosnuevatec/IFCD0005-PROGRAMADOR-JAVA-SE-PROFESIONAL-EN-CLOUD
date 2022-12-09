package com.jgr.numero.primo;

import javax.swing.JOptionPane;

/**
 * The Class Lanzadora.
 * 2.- Hacer un programa que, dado un número que se encuentra en una variable, nos diga si el 
número es o no primo (los primos solo son divisibles entre uno y entre si mismos)
 */
public class LanzadoraPrimo {
	public static void main(String[] args) {
		
		
		String numeroStr = (String) JOptionPane.showInputDialog(null, "Numero", 
				"Validar si numero es o o primo", JOptionPane.INFORMATION_MESSAGE,null, null, null);
		
		
		try {
			
			boolean primo= true;
			int numero = Integer.parseInt(numeroStr);
			
			for(int i=2;i<numero;i++) {
		        if(numero%i==0)
		            primo= false;
		    }
			
			
			String resultado = primo? numeroStr+ " es primo": numeroStr + " no es primo";
			JOptionPane.showMessageDialog(null, resultado);
			
		
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error",numeroStr+ " no es un numero", JOptionPane.ERROR_MESSAGE);
			
		}
		
		
	}

}
