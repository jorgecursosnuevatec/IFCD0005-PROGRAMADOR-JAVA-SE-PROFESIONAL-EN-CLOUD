package com.jgr.principal;

public class ClaseLanzadora {

	public static void main(String[] args) {
		
		//STRING ES INMUTABLE, LOS DOS REFERENCIAN A LA MISMA DIRECCION DE MEMORIA
		//SI LO HUBIERAMOS HECHO CON new String,no porque lo guardaria en otro espacio de memoria
		String a="hola";
		String b="hola";

		System.out.println(a==b.toLowerCase()); //false
		System.out.println(a==b); //true

		String c = "hola";
		String d = new String(c);
		
		System.out.println(c==d.toLowerCase());//false
		System.out.println(c==d);//false
		
		
		
	}

}
