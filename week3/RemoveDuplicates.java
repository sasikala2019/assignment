package week2.day2.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str="PayPal India";
		char[] charArray=str.toCharArray();
		Set<Character> charset= new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		System.out.print("The string is:");
		for(int i=0;i<charArray.length;i++) {
			System.out.print(charArray[i]);
		}System.out.println("");
		
		for(int i=0;i<charArray.length;i++) {
			if(!charset.add(charArray[i])){
				dupCharSet.add(charArray[i]);
					}
		}System.out.println("The unique char:"+charset);
		System.out.println("The duplicate char"+dupCharSet);	
	}
	

}
