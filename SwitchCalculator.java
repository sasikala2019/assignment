package week1day1.assignment;

public class SwitchCalculator {

	public static void main(String[] args) {
int num1=10,num2=20;
String operation ="add";
switch(operation) { 
case"add":
	 System.out.println("The addition of two numbers:"+(num1+num2));
	 break;
case"sub":
	System.out.println("The subraction of two numbers:"+(num1-num2));
	break;
case"mul":
	System.out.println("The Mul of two numbers:"+ (num1*num2));
	break;
case"div":
	System.out.println("The division of two numbers:" +(num1/num2));
	break;
default:
	System.out.println("Enter Valid Operation");
}
	}}


