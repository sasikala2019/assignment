package week1day1.assignment;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num=15;
		int flag=0;
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				flag++;
			}}
			if(flag==2) {
				System.out.println("The number is primenumber");
				
			}else {
				System.out.println("The number is not primenumber");
			}
				

	}

}
