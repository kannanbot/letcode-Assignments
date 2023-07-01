package week1.day3;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		
		int num[]= {1,2,3,4,1,5,6,5,8,9,4};
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]==num[j]) {
					
					
					System.out.println("Duplicate value :" +num[j]);
					
					
				}
				
				
			}
			
		}
		
		
		
		

	}

}
