package pruebas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir ="C:\\Users\\manana\\principal\\productos.txt";
		/*FileReader fr= null;
		BufferedReader bf = null;
		try {
			fr = new FileReader(dir);
			bf= new BufferedReader(fr);
		//	System.out.println("1-->"+bf.readLine());
		//	System.out.println("2-->"+bf.readLine());
			String s;                                         //  con esto
			while ((s= bf.readLine())!=null) {			      //  se lee todo 		
				System.out.println(s);					      //  un fichero
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if(bf!=null) {
				try {
					bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}*/
		try (FileReader    fr =new FileReader(dir);
			BufferedReader bf= new BufferedReader(fr);){
			
			String s;                                         //  con esto
			while ((s= bf.readLine())!=null) {			      //  se lee todo 		
				System.out.println(s);					      //  un fichero
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
