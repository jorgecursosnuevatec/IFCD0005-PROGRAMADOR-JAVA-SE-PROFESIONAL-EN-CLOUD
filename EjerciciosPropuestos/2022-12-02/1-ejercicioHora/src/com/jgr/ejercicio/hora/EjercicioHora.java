package com.jgr.ejercicio.hora;

import java.time.LocalDateTime;

/**
 * The Class EjercicioHora.
 * 
 * 1.- Realizar un programa que dada la hora del día almacenada en una variable nos diga:
"Buenos días" si el número está entre 6 y 12, "buenas tardes" si está entre 13 y 18, "buenas 
noches" si está entre 19 y 23 y "que duermas bien" para el resto de valores.
 * 
 */
public class EjercicioHora {

	public static void main(String[] args) {
		
		LocalDateTime ahora= LocalDateTime.now();
	    int anio = ahora.getYear();
	    int mes = ahora.getMonthValue();
	    int dia = ahora.getDayOfMonth();
	    int hora = ahora.getHour();
	    int minutos = ahora.getMinute();
	    int segundos = ahora.getSecond();
	    
	    String horaActual= ""+hora + minutos +segundos;
	    
	    System.out.println("Hoy es ".concat(String.valueOf(anio)).concat("-")
	    		.concat(String.valueOf(mes)).concat("-").concat(String.valueOf(dia)) );
	    
	    System.out.println("La hora es ".concat(String.valueOf(hora)).concat(":")
	    		.concat(String.valueOf(minutos)).concat(":").concat(String.valueOf(segundos)) );
	    
	    //System.out.println("hora actual->"+horaActual);
	    
	    int horaActualNum = Integer.valueOf(horaActual.substring(0,2));
	    System.out.println(horaActualNum);
	    
	    String saludo=(horaActualNum>=6&horaActualNum<12)?"Buenos dias":
	    	(horaActualNum>12&horaActualNum<18)?"Buenas noches":"Que duermas bien";
	    
	    System.out.println("Saludo->"+saludo);
	    
	    
	  /* JAVA >=14
	    var result = switch (horaActualNum) {
	    case 6,7,8,9,10,11,12 -> "Buenos dias";
	    case 13,14,15,16,17,18 -> "Buenas noches";	    
	    default -> "Que duermas bien";
	};
	
	*/
	    
	    
	    
	    
	    

	}

}
