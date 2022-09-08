package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[]= {12,34,53,65,78,23};
		int num2[]= {14,12,32,45,53,19};
		
		
		for(int i=0;i<num1.length;i++) {
			
			for(int j=0;j<num2.length;j++) {
				
				if(num1[i]==num2[j]) {
				
					System.out.println(num2[j]);
				}
			}
			
		}

	}

}
