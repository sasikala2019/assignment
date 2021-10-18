package week2.day1.assignment;

public class StringToNumber {
	public void replace() {
	String str=("I am working with Java8");
	System.out.println("The original string:"+str);
	String replaceString=str.replace("8","11");
	System.out.println("The replaced string:"+replaceString);
	String substring=str.substring(5,11);
	System.out.println("The substring:"+substring);
	
	}
	
	public static void main(String[] args) {
		StringToNumber obj=new StringToNumber();
		obj.replace();
	}
}
