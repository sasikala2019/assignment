package week1day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
		System.out.println("The string:" +str);
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println("The reverse string:" +rev);
		if(str.equals(rev)) {
			System.out.println("The string is palindrome");
			
		}else
		{
			System.out.println("The string is not palindrome");
		}

	}

	
	}

