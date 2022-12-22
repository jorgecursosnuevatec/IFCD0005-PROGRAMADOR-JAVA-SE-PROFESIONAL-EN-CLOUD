package com.jgr.ficheros;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * The Class PruebaEscribirSinSobreescribir.
 * con el parametro append 
 */
public class PruebaEscribirSinSobreescribir {
	public static void main(String[] args) {
		
		String printStreamruta = "c:\\ficheros\\dias.txt";
		PrintStream salida =null;		
		//con PrintStream
		try{
			salida = new PrintStream(printStreamruta);
			salida.println("Linea1");
			salida.print("Linea2");
			salida.println("Linea3");
			salida.println(false);

			
		}catch(FileNotFoundException f) {
			System.out.println("f.getStackTrace()->"+f.getStackTrace());			
			f.printStackTrace();			
			System.out.println("No existe el fichero");			
		}
		finally{ salida.close();}
		
		
	

	}

}
