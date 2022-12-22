package pruebas;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestEscritura {

	public static void main(String[] args) {
		String dir="c:\\ficheros\\dias.txt";
		/*PrintStream out=null;
		try {
			out=new PrintStream(dir);
			out.println("jueves");
			out.println("viernes");
			out.println("sábado");
			return;
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		finally {
			if(out!=null) {
				out.close(); //cierra el canal
			}
		}*/
		try(PrintStream out=new PrintStream(dir);){
			out.println("jueves");
			out.println("viernes");
			out.println("sábado");
			return;
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		//80000 instrucciones más 
	}

}
