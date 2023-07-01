package week1.day3;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		int num = 1;
		
		
		for (int i = 0; i < arr.length-1; i++) {
			
			
			if(arr[i] !=i + num)
				
			System.out.print(i + num);
				
		}
		

		
	
	}

}
