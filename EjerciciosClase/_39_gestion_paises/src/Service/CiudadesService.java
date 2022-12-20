package Service;



import java.util.ArrayList;
import model.Ciudad;

public class CiudadesService {
	ArrayList <Ciudad> ciudades = new ArrayList <>();
	
	public void nuevaCiudad(String nombre,int habitantes, String pais ) {
		ciudades.add(new Ciudad(nombre, habitantes, pais));
	}
	
	
	public Ciudad masPoblada() {
		int maxi = 0;
		Ciudad ciudad= null;
	//for (int i=0; i<ciudades.size();i++) {
		for ( Ciudad c : ciudades) {
			if (c.getHabitantes()>maxi) {
				ciudad=c;
				maxi=c.getHabitantes();
			}	
		}
		return ciudad;
	}
	
	
	public ArrayList <Ciudad> ciudadesPais (String pais) {
		ArrayList <Ciudad> arrayciudades = new ArrayList <> ();
		
	/*	for (int i=0; i<ciudades.size();i++) {
			if (pais.equals(ciudades.get(i).getPais()))
				arrayciudades.add(ciudades.get(i));
			}
				*/
		for (Ciudad c : ciudades) {
			if (pais.equals(c.getPais())) {
				arrayciudades.add(c);
			}
		}
		return arrayciudades;
	}
}
