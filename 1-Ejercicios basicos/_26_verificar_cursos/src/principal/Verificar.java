package principal;

public class Verificar {

	public static void main(String[] args) {
		String cadena="Java básico,Python,JavaEE,JavaScript,Angular 10,Big Data";
		//cuantos cursos comienzan por Java?
		String[] cursos=cadena.split("[, .]");
		int contador=0;
		for(int i=0;i<cursos.length;i++) {
			if(cursos[i].startsWith("Java")) {
				contador++;
			}
		}
		System.out.println(contador);
	}

}
