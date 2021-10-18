package week1day2;

import java.util.Iterator;

public class TwoSumProblem {

	public static void main(String[] args) {
		int target=9;
		int nums[]= {2, 11, 15, 7, 3,5,4 };
		//addition of consecutive numbers
		for(int i=0;i<nums.length;i++) {
			for (int j = i+1; j < nums.length; j++) {
if(nums[i]+nums[j]==target) {
	System.out.println(nums[i]);
	System.out.println(nums[j]);
			}
			}
		}
	}

}
