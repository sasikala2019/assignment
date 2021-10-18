package week1day2.assignment;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
String str="changeme";
String str2;

char[] charArray=str.toCharArray();
for(int i=0;i<charArray.length;i++) {
	if(i%2!=0) {	
		String str1=Character.toString(charArray[i]);
		str2=str1.toUpperCase();
		System.out.println(str2);
		}}}}