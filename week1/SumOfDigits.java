package week1day1.assignment;

public class SumOfDigits {

	public static void main(String[] args) {
int num=123,rem=0;
int sum=0;
while(num>0){
	rem=num%10;
	sum=sum+rem;
	num=num/10;
	
}System.out.println("The sum of Digits:" +sum);

	}

}
