package week1day2.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss"; 
		int length1=text1.length();
		int length2=text2.length();
		if(length1==length2) {
			System.out.println("Both string equal length");
		}else {
			System.out.println("The length of two string varied.so can't perform anagram");
			
		}
		char[] charArray1=text1.toCharArray();
		char[] charArray2=text2.toCharArray();
		Arrays.sort(charArray1);	
		Arrays.sort(charArray2);
		if(Arrays.equals(charArray1,charArray2))
		{
					System.out.println("anagram");
		}else {
			System.out.println("not an anagram");
		}}}

