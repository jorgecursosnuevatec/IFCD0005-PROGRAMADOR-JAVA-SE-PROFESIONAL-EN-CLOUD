package com.jgr.pruebas.fechas;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		Date d2 = new Date(Long.MAX_VALUE);
	
		System.out.println("d1->"+d1);
		System.out.println("d2->"+d2);		
		System.out.println("d1>d2->"+d1.compareTo(d2));
		System.out.println("d1.before(d2)->"+d1.before(d2));
		System.out.println("d1.after(d2)->"+d1.after(d2));
		
		
		
	}

}
