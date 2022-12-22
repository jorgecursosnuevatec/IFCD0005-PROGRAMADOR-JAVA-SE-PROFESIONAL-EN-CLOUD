package com.jgr.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;


/**
 * The Class PruebaLecturaBuffered.
 * para leer textos
 */
public class PruebaLecturaBuffered {

	public static void main(String[] args) {
		
		
		String dir="c:\\ficheros\\mydata.txt";
		try (FileOutputStream fos = new FileOutputStream(dir, true); PrintStream out = new PrintStream(fos)) {
			out.append("dir1");
			out.append("dir2");
			out.append("dir3");
			out.append(out.getClass().toString());
			out.println("este es println");
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
				
		//para leer con bufferedReader hay que crer un Reader intermedio, que puede ser un InputStreamReader o un FileReader
		
		
		try(FileReader fileReader = new FileReader(dir);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			
			var salida=bufferedReader.readLine();
			while(salida!=null) {
				System.out.println("Salida->"+salida);
				
				salida=bufferedReader.readLine();
				

			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		
		
		
		

	}

}
