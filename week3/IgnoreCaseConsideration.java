package week2.day1.assignment;

public class IgnoreCaseConsideration {
public void ignoreCase() {
	String str1=("I am Learning Java") ;
	String str2=("I am learning java"); 
	System.out.println("string comparison with == operator");
	if(str1==str2) {
		System.out.println("The two string is same");
	}else {
		System.out.println("The two string is diff");
	}
	System.out.println("string comparison with  equals");
	if(str1.equals(str2)) {
		System.out.println("The two string is same");
	}else {
		System.out.println("The two string is diff");
	}
	System.out.println("string comparison with  equalIgnoreCase");
	if(str1.equalsIgnoreCase(str2)) {
		System.out.println("The two string is same");
	}else {
		System.out.println("The two string is diff");
	}
	
}
	  
	public static void main(String[] args) {
		IgnoreCaseConsideration obj=new IgnoreCaseConsideration();
		obj.ignoreCase();
	}

}
