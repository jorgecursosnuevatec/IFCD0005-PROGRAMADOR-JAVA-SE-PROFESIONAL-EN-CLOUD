package com.jgr.pruebas.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FormatearFechas {

	public static void main(String[] args) throws ParseException {
		
		
		//formatear fechas
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format2=new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss ");
		Date d1 = new Date();
		Date d2 = new Date(Long.MAX_VALUE);		
		System.out.println("Formateado->"+format.format(d1));
		System.out.println("Formateado 2->"+format2.format(d2));
		
		//parsear fechas->texto a fecha
		String fecEntra1 = "21/12/2022";
		String fecEntra2 ="17/08/292278994";
		
		System.out.println("fecha 1 formato Date->"+ format.parse(fecEntra1));
		System.out.println("fecha 2 formato Date->"+ format.parse(fecEntra2));
		Date d3 = format.parse(fecEntra1);

	}

}
