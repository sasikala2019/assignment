package week1day2.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int length=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<length;i++) {
			System.out.print(arr[i ]+" ");
		}
		for(int i=0;i<length;i++) {
			if(i+1!=arr[i]) {
				System.out.print(" "+(i+1));
				break;
			}
		}
		
	}}
