package com.jgr.proyecto.pedidos.principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import com.jgr.proyecto.pedidos.modelo.Pedido;
import com.jgr.proyecto.pedidos.servicio.PedidosServicio;

public class Lanzadora {

	
	static int limite = 10;
	
	static long NUMERO_MAXIMO = Long.MAX_VALUE;
	static long NUMERO_MINIMO = Long.MIN_VALUE;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("mete numero");
		
		try{
			var opcion=sc.nextInt();	
		}catch(InputMismatchException in) {
			
			
			System.out.println("in.getLocalizedMessage()->"+in.getLocalizedMessage());
			System.out.println("in.getCause()->"+in.getCause());
			System.out.println("in.getClass()->"+in.getClass());
			System.out.println("in.getMessage()->"+in.getMessage());
			System.out.println("in.getStackTrace()->"+in.getStackTrace());
			System.out.println("in.fillInStackTrace()->"+in.fillInStackTrace());
			System.out.println("in.printStackTrace()->");
			in.printStackTrace();
			System.out.println("in.toString()->"+in.toString());
			
			
			for (StackTraceElement t:in.getStackTrace()) {
				System.out.println("StackTraceElement->"+t);
			}
			
			for (Throwable t:in.getSuppressed()) {
				System.out.println("Throwable->"+t);
				
			}

			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			Date fecha;
			System.out.println("mete fecha");
			
				try {
					fecha=formato.parse(sc.nextLine());
				} catch (ParseException e) {
					System.out.println("e.getLocalizedMessage()->"+e.getLocalizedMessage());
					System.out.println("e.getCause()->"+e.getCause());
					System.out.println("e.getClass()->"+e.getClass());
					System.out.println("e.getMessage()->"+e.getMessage());
					System.out.println("e.getStackTrace()->"+e.getStackTrace());
					System.out.println("e.fillInStackTrace()->"+e.fillInStackTrace());
					System.out.println("e.printStackTrace()->");
					e.printStackTrace();
					System.out.println("e.toString()->"+e.toString());
					
					
					for (StackTraceElement t:e.getStackTrace()) {
						System.out.println("StackTraceElement->"+t);
					}
					
					for (Throwable t:e.getSuppressed()) {
						System.out.println("Throwable->"+t);
						
					}
				}
				
			
			
			
			
		}
		
	}
	
	
	
}
