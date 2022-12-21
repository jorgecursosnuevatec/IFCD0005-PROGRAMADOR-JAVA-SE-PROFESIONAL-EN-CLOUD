/*
 * 
 */
package com.jgr.pruebas.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * The Class NuevasClasesFechas.
 * estan en java.time
 */
public class NuevasClasesFechas {
	public static void main(String[] args) {
		
		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 =LocalDate.of(2021, 7,22);
		LocalTime t1=LocalTime.of(10,23,50); //10:23:50
		LocalDateTime dt=LocalDateTime.of(2010,11,1,10,23,50); //2010-11-01T10:23:5
		System.out.println("resultadoComparacion->"+ld1.isAfter(ld2));
		
		System.out.println("suma 8 meses a la fecha"+ld1.plusMonths(8));
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha="20/09/2019";
		LocalDate date=LocalDate.parse(fecha, format);
		
		DateTimeFormatter format2=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date2=LocalDate.of(2022,10,20);
		//System.out.println(date2.format(format2)); //20/10/202
				
		


	}

}
