package week2.day2.assignment;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CollectionListRemoveDup {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		char[] charArray=text.toCharArray();
		System.out.println("The Text is:");
		for(int i=0;i<charArray.length;i++) {
			System.out.print(charArray[i]);
		}System.out.println(" ");
		List<Character> charset= new LinkedList<Character>();
		List<Character> dupCharSet = new LinkedList<Character>();
		for(int i=0;i<charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i]==charArray[j]) {
				dupCharSet.add(charArray[i]);
				}charset.add(charArray[i]);
				}
		}System.out.println(charset);
		System.out.println(dupCharSet);
			
		}}


