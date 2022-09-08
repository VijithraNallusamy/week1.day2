package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="vijithra";
		char[] ch=name.toCharArray();
		int length=ch.length;
		for(int i=0;i<=length;i++) {
			
			
			if(i%2!=0) {
				
				ch[i]=Character.toUpperCase(ch[i]);
				System.out.print(ch[i]);
		    	  
				
			}
			else {
				System.out.print(ch[i]);
			}
			
			
		}

	}

}
