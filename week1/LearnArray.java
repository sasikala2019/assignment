package week1day2;

import java.util.Arrays;

public class LearnArray {
	public static void main(String[] args) {
		int[] num= {4,45,67,43,67,87};
		int length =num.length;
		System.out.println("The numbers in Array:");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		Arrays.sort(num);
		System.out.println("The sorted array:");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("The second largest number:" + (length-1));
		System.out.println("The second largest number:"+ num[1]);

	}
		

}
