package week1day1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		//sum of previous two numbers
		int range=8;
		int first=0,second=1;
		int third;
		System.out.println(first);
		System.out.println(second);

		for(int i=3;i<=range;i++) {
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
			}
	}

}
