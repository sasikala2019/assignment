package week1day2.assignment;

public class ReverseString {

	public static void main(String[] args) {

		String test = "feeling good";
		System.out.println("feeling good");
		char[] charArray=test.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
	}

}
