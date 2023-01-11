package service;

import java.util.ArrayList;

import model.Ciudad;

public class TemperaturasService {
	ArrayList<Ciudad> temperaturas=new ArrayList<>();
	public boolean agregarCiudad(Ciudad ciudad) {
		if(!comprobar(ciudad.getNombre())) {
			temperaturas.add(ciudad);
			return true;
		}
		return false;
	}
	
	public double media() {
		double m=0;
        for(Ciudad c:temperaturas){
            m+=c.getTemperatura();
        }
       return m/temperaturas.size();
	}
	
	public Ciudad mayor() {
		double max=temperaturas.get(0).getTemperatura(); //inicializamos
        Ciudad ciudad=temperaturas.get(0);
        for(Ciudad c:temperaturas){
        	if(c.getTemperatura()>max) {
        		max=c.getTemperatura();
        		ciudad=c;
        	}
        }
        return ciudad;
	}
	public Ciudad menor() {
		double min=temperaturas.get(0).getTemperatura(); //inicializamos
        Ciudad ciudad=temperaturas.get(0);
        for(Ciudad c:temperaturas){
        	if(c.getTemperatura()<min) {
        		min=c.getTemperatura();
        		ciudad=c;
        	}
        }
        return ciudad;
	}
	
	public Ciudad[] devolverCiudades() {
		return temperaturas.toArray(new Ciudad[0]);
	}

	private boolean comprobar(String nombre) {
		for(Ciudad c:temperaturas) {
    		if(c.getNombre().equalsIgnoreCase(nombre)) {
    			return true;
    		}
    	}
    	return false;
	}
}
