package _41_pruebas_fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test2 {

	public static void main(String[] args) {
		LocalDate f1=LocalDate.of(2019, 10, 30);
		LocalDate f2=LocalDate.of(2016, 01, 31);
		//comparación fechas
		if(f1.isBefore(f2)) {
			System.out.println("La fecha más antigua es: "+f1);
			System.out.println("La fecha más reciente es: "+f2);
		}else {
			System.out.println("La fecha más antigua es: "+f2);
			System.out.println("La fecha más reciente es: "+f1);
		}
		System.out.println(f1.plusMonths(8));
		System.out.println(f1.plusDays(200));
		System.out.println(f2.plusMonths(1));
		DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(f1.format(format1));
		String mf="11/16/2018";
		LocalDate nuevaFecha=LocalDate.parse(mf,format1);
		
	}
	

}
