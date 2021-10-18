package week2.day1.assignment;

public class JustifyOutput {

	public static void main(String[] args) {
		 String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("***");
	}//string stored in diff memory location.
	//better string use equals method for compare two strings.it compare value of the string 

}
