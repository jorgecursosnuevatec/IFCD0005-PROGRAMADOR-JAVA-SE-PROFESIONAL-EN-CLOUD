package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.Pedido;
import service.PedidosService;

public class PedidosMain {
	
	
	static PedidosService pedidosService=new PedidosService();
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			try {
				opcion=Integer.parseInt(sc.nextLine());//lee la opción elegida
				switch(opcion) { //evaluamos
					case 1:
						grabarPedido();
						break;
					case 2:
						buscarPedidoReciente();
						break;
					case 3:
						mostrarPedidos();
						break;
					
					
					case 4:
						System.out.println("---Adios---");
				}
			}
			catch(NumberFormatException ex) {
				System.out.println("Debes elegir opción correcta");
				opcion=0; //para que vuelva a generar el bucle
			}
		}while(opcion!=4);

	}
	static void mostrarMenu() {
		System.out.println("1.- Nuevo pedido");
		System.out.println("2.- Pedido más reciente");
		System.out.println("3.- Mostrar todos");
		System.out.println("4.- Salir");
		
	}
	static void grabarPedido()  {
		Scanner sc=new Scanner(System.in);
		//para el parseado de fechas
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		String producto;
		Date fecha;
		double precio;
		System.out.println("Introduce producto");
		producto=sc.nextLine();
		System.out.println("Introduce fecha (dia/mes/año)");	
		try {
			fecha=format.parse(sc.nextLine());
			System.out.println("Introduce precio");
			precio=Double.parseDouble(sc.nextLine());		
			pedidosService.guardarPedido(producto, fecha, precio);
		}
		catch(ParseException ex) {
			System.out.println("La fecha no es válida y el pedido no se guardará");
		}
	}
	static void buscarPedidoReciente() {
		Pedido pedido=pedidosService.pedidoMasReciente();
		System.out.println("Producto: "+pedido.getProducto());
		System.out.println("Fecha: "+pedido.getFechaPedido());
		System.out.println("Precio: "+pedido.getPrecio());
	}
	static void mostrarPedidos() {
		Pedido[] todos=pedidosService.todos();
		for(Pedido p:todos) {
			System.out.println("Producto: "+p.getProducto());
			System.out.println("Fecha: "+p.getFechaPedido());
			System.out.println("Precio: "+p.getPrecio());
		}
	}
	
}
