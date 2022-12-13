package com.jgr.busca.en.elarray;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * The Class BuscarEnArray.
 * Realizar un programa que solicite la introducción de cinco nombres de productos y los
guarde en un array. Después, se pedirá al usuario que introduzca un nombre de producto y nos
diga si está o no presente en el array original

 */
public class BuscarEnArray {

	
	public static void main(String[] args) {
		
		final int MAX_PRODUCTOS = 5;
		String[] listaProd = new String[MAX_PRODUCTOS];
		int contaProd = 0;
		//Scanner sc = new Scanner(System.in);
		String cargaProducto = "";

		do {

			cargaProducto = (String) JOptionPane.showInputDialog(null, ("Guarda el producto " + (contaProd + 1)),
					"Producto a guardar", JOptionPane.INFORMATION_MESSAGE, null, null, null);

			listaProd[contaProd] = cargaProducto;
			contaProd++;

		} while (contaProd < listaProd.length);

		String productoBuscar = (String) JOptionPane.showInputDialog(null, "Busca el Producto", "Producto a buscar",
				JOptionPane.INFORMATION_MESSAGE, null, null, null);

		boolean encontrado = false;
		for (int i = 0; (i < listaProd.length && !encontrado); i++) {

			if (listaProd[i].equalsIgnoreCase(productoBuscar)) {
				encontrado = true;
			}

		}
		
		if (encontrado) {
			JOptionPane.showMessageDialog(null, "El producto " + productoBuscar + " existe");
		} else {
			JOptionPane.showMessageDialog(null, "No existe ese producto", productoBuscar + "NO existe",
					JOptionPane.ERROR_MESSAGE);

		}

	}

}
