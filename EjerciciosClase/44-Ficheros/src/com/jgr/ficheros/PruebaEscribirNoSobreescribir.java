package com.jgr.ficheros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


/**
 * The Class PruebaEscribirNoSobreescribir.
 * con el parametro append true/false se decide si sobreescribe o no
 * el try es con recursos,automaticamente cierra el fichero
 */
public class PruebaEscribirNoSobreescribir {

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
				


	}

}
