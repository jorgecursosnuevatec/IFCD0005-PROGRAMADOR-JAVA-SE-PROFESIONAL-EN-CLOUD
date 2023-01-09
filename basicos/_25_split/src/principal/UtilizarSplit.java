package principal;

public class UtilizarSplit {

	public static void main(String[] args) {
		String texto="Juan,Marta,Elena,Jose,Juan,Maria,Lucas,Elena";
		String nombre="Elena";
		//indicar cuantas veces aparece el nombre en el texto
		String[] datos=texto.split(",");
		int contador=0;
		for(int i=0;i<datos.length;i++) {
			if(nombre.equals(datos[i])) {
				contador++;
			}
		}
		System.out.println(contador);
	}

}
