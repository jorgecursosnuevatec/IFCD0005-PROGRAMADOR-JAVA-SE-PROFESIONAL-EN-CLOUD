package principal;

public class UsoArray {

	public static void main(String[] args) {
		int[] nums=new int[4];
		nums[0]=20;
		nums[1]=39;
		nums[2]=4;
		nums[3]=11;
		//nums[4]=45;
		System.out.println(nums[2]); //muestra el contenido de la posición 2
		//mostrar todos: length nos da el tamño del array
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
	}

}
