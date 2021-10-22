package week2.day2.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionRemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		char[] charArray=text.toCharArray();
		System.out.println("The Text is:");
		for(int i=0;i<charArray.length;i++) {
			System.out.print(charArray[i]);
		}System.out.println(" ");
		Set<Character> charset= new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for(int i=0;i<charArray.length;i++) {
			if(!charset.add(charArray[i])) {
				dupCharSet.add(charArray[i]);
			}
		}System.out.println("The unique character:"+charset);
		System.out.println("The duplicate character:"+dupCharSet);
	}

}
