package com.jgr.captura.errores;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class CapturaErrores {

	public static void main(String[] args) {
		
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String fechaString="11/11/2022";
		String fechaStringError="11/99/2022";
		Date miFecha2=null;
		try {
//			Date miFecha = format1.parse(fechaString);	
			miFecha2 = format1.parse(fechaStringError);	
			
		}

		catch ( ParseException ex) {
			System.out.println("error al convertir");
		}
		System.out.println("miFecha->"+miFecha2);
		
		
		//captura try-catch-finally
		
		String printStreamruta = "c:\\ficheros\\dias.txt";
		PrintStream salida =null;		
		//con PrintStream
		try{
			salida = new PrintStream(printStreamruta);
			salida.println("printStreamruta1");
			salida.print("printStreamruta2");
			salida.println("printStreamruta3");
			salida.println(false);

			
		}catch(FileNotFoundException f) {
			System.out.println("f.getStackTrace()->"+f.getStackTrace());			
			f.printStackTrace();			
			System.out.println("No existe el fichero");			
		}
		finally{ salida.close();}
		
		
		//try con recursos
		String printStreamruta2 = "c:\\ficheros\\dias2.txt";			
		//con PrintStream
		try(PrintStream salida2 = new PrintStream(printStreamruta2)){
			
			salida2.println("printStreamruta21");
			salida2.print("printStreamruta22");
			salida2.println("printStreamruta23");
			salida2.println(true);
			
			
		}catch(FileNotFoundException f) {
			System.out.println("f.getStackTrace()->"+f.getStackTrace());			
			f.printStackTrace();			
			System.out.println("No existe el fichero");			
		}
		
		
		
		
		
	}

}
