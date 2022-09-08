package week1.day2;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="Malayalam";
        String b="";
        char[] charArray = a.toCharArray();
     
        
        
        for(int i=charArray.length-1 ; i>=0; i--) {
        	
			b=b.concat(String.valueOf(charArray[i]));
		}
        
		if(a.equalsIgnoreCase(b)) {
                System.out.println("String is a Palindrome");
		}else {
				System.out.println("String is not a Palindrome");
			}

      }

}
