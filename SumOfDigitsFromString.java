package week1day2.assignment;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		System.out.println(text);
		int sum = 0;
		String replace=text.replaceAll("[\\D]","" );
		System.out.println(replace);
		char[] charArray=new char[replace.length()];
		for (int i = 0; i < replace.length(); i++) {
            charArray[i] = replace.charAt(i);}
		
            for (char c : charArray) {
               
               int num=Character.getNumericValue(c);
            sum=sum+num;
            }
            System.out.println("The sum of digits:" +sum);
            

}}
