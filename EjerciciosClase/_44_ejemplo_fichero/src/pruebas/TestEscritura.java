package pruebas;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestEscritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir ="C:\\Users\\manana\\principal\\dias.txt";
		/*PrintStream out= null;
		try {
			out = new PrintStream(dir);  // abrimos un canal de comunicacion con un fichero 
			out.println("Lunes");
			out.println("Martes");
			out.println("Miercoles");
			
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
			
		}
		finally {
			if(out!=null) {
				out.close();  //  cierra el canal de escritura en el fichero
			}
		}*/
		
		try (PrintStream out= new PrintStream(dir);) {   // se  crea aqui el canal de comunicacion y ya se cerrará solo
			out.println("Lunes");
			out.println("Martes");
			out.println("Miercoles");
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
