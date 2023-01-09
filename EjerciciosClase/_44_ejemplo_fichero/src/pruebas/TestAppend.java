package pruebas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestAppend {

	public static void main(String[] args)  {
		String dir ="C:\\Users\\manana\\principal\\productos.txt";
		/*PrintStream out = null;
		FileOutputStream fos = null;
		try {
			fos=new FileOutputStream (dir, true);  // el true es para añadir en el fichero
			out = new PrintStream (fos);
			out.println("otro");
			
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		finally {
			if (out!=null) {
					out.close();
			}
			if (fos!=null) {
					try {
						fos.close();
					} catch(IOException ex) {
						ex.printStackTrace();
					}
			}
		}*/
		try (FileOutputStream fos = new FileOutputStream (dir, true);
			 PrintStream out= new PrintStream (fos);) {
			 out.println("y otro");
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
}
