package principal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class PruebaTablas {

	public static void main(String[] args) {
		HashMap<Integer,String> tabla=new HashMap<>();
		tabla.put(800, "saturno");
		tabla.put(5000, "urano");
		tabla.put(100, "júpiter");
		tabla.put(300, "marte");
		tabla.put(100, "neptuno");
		//System.out.println(tabla.remove(300));
		//recorrer los valores de un HashMap:
		Collection<String> col=tabla.values();
		//for each o enhanced for
		for(String s:col) {
			System.out.println(s);
		}
		
		//recorrer claves de un HashMap:
		Set<Integer> claves=tabla.keySet();
		for(Integer c:claves) {
			System.out.println(c);
		}
	}

}
