package com.jgr.ficheros;

import java.io.File;

/**
 * The Class PruebaFile.
 * File e la ruta a un fichero/directorio
 */
public class PruebaFile {

	
	public static void main(String[] args) {
		
		String dir="c:\\ficheros\\mydata.txt";
		File ficheroFile = new File(dir);
		
		System.out.println("HashCode->"+ficheroFile.hashCode());
		System.out.println("Existe->"+ficheroFile.exists());
		System.out.println("Es fichero->"+ficheroFile.isFile());
		System.out.println("Es directorio->"+ficheroFile.isDirectory());
		System.out.println("Intenta borrarlo->"+ficheroFile.delete());
		
		
		
		
		

	}

}
