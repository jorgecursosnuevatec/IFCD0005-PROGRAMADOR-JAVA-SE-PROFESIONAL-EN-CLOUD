package principal;

public class Comprobar {

	public static void main(String[] args) {
		//dado un array con números cualquiera, hacer un programa que nos diga
		//si hay o no algún número par en el array
		int[] nums= {5,7,8,3,1,11,4};
		boolean existepar=false;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				existepar=true;
				break;
			}
		}
		if(existepar) {
			System.out.println("hay al menos un par");
		}else {
			System.out.println("no hay ningún par");
		}
		
	}

}
