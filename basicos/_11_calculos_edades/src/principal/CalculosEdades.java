package principal;

public class CalculosEdades {

	public static void main(String[] args) {
		int [] edades= {34,19,26,44,30,18};
		//calcular la media de edad
		int media=0;
		for(int i=0;i<edades.length;i++) {
			media=media+edades[i];
		}
		media=media/edades.length;
		System.out.println(media);
	}

}
