package principal;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<String> datos=new HashSet<>();
		datos.add("elemento 1");
		datos.add("elemento 2");
		datos.add("elemento 3");
		datos.add("elemento 1");
		System.out.println(datos.size());
		
		for(String s:datos) {
			System.out.println(s);
		}
	}

}
