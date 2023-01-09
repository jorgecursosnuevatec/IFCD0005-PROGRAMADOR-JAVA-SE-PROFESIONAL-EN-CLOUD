package Service;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.Ciudad;


public class CiudadesService {
	//ArrayList <Ciudad> ciudades = new ArrayList <>();
	
	String dir ="C:\\Users\\manana\\principal\\paises.txt";
	SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy");
	
	public void nuevaCiudad(String nombre,int habitantes, String pais ) {
	//	ciudades.add(new Ciudad(nombre, habitantes, pais));
		String datos=nombre+"|"+habitantes+"|"+pais;
		
		try (FileOutputStream fos = new FileOutputStream (dir, true);
				 PrintStream out= new PrintStream (fos);) {
			out.println(datos);
				
			}
			catch (FileNotFoundException ex) {
				ex.printStackTrace();
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
	}
	
	
	public Ciudad masPoblada() {
		int maxi = 0;
		Ciudad ciudad= null;

		try (FileReader    fr =new FileReader(dir);
				BufferedReader bf= new BufferedReader(fr);){
					
					String fila;      
					
					while ((fila= bf.readLine())!=null) {
						String[] linea=fila.split("[|]");  
						Ciudad p = new Ciudad(linea[0],Integer.parseInt(linea[1]),(linea[2]));
						
						if (p.getHabitantes()>maxi) {
							ciudad=p;
							maxi=p.getHabitantes();
						}
					}
				}
				catch (FileNotFoundException ex) {
					ex.printStackTrace();
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
				
			return ciudad;
	}
	
	
	
	public ArrayList <Ciudad> ciudadesPais (String pais) {
		
		ArrayList <Ciudad> arrayciudades = new ArrayList <> ();
		
		try (FileReader    fr =new FileReader(dir);
				BufferedReader bf= new BufferedReader(fr);){
					
					String fila;      
					
					while ((fila= bf.readLine())!=null) {
						String[] linea=fila.split("[|]");  								// meto cada contenido de la linea en un array de strings
						Ciudad ciu = new Ciudad(linea[0],Integer.parseInt(linea[1]),(linea[2]));   //  Creo el objeto ciudad
						
					
							if (pais.equals(ciu.getPais())) {
								arrayciudades.add(ciu);
							}
					}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}		
		
		return arrayciudades;
	}
}
