package com.jgr.clasestring;

/**
 * The Class Lanzadora.
 */
public class Lanzadora {
	
	public static void main(String[] args) {
		
		String cadena ="inicial";
		
		System.out.println(cadena.repeat(5));
		System.out.println(cadena.toCharArray());
		System.out.println(cadena.getBytes());
		System.out.println(cadena.hashCode());
		System.out.println(cadena.charAt(5));
		System.out.println(cadena.codePointAt(4));
		System.out.println(cadena.codePointCount(1, 2));
		System.out.println(cadena.indexOf("l"));
		
		

	}

}
