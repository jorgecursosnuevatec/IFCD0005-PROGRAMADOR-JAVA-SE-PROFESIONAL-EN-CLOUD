package service;

import java.util.Collection;
import java.util.HashMap;

public class AgendaService {
	HashMap<Integer,String> contactos=new HashMap<>();
	
	public void guardarContacto(Integer numero, String nombre) {
		//if(contactos.get(numero)==null)
		//si la clave está libre, el contacto se puede añadir
		if(!contactos.containsKey(numero)) {//esa pregunta equivale a:if(contactos.containsKey(numero)==false)
			contactos.put(numero, nombre);
		}
		
	}
	
	public String buscarContacto(Integer numero) {
		String nombre= contactos.get(numero);
		return nombre;
	}
	
	public void eliminarContacto(Integer numero) {
		contactos.remove(numero);
	}
	
	
	public String[] nombres() {
		String[] res=new String[contactos.size()];
		Collection<String> col=contactos.values();
		int i=0;
		for(String n:col) {
			res[i]=n;
			i++;
		}
		return res;
	}
	
}
