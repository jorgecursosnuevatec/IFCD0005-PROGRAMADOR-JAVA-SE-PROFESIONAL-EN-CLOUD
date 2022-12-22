package com.jgr.captura.errores;

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
		
		
	}

}
