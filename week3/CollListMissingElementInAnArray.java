package week2.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollListMissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Set<Integer> intSet=new TreeSet<Integer>(); 
		
		System.out.println("The Array:");
		for(int i=0;i<arr.length;i++) {
			intSet.add(arr[i]);
		}System.out.print(intSet);
		
		List<Integer> intList=new LinkedList<Integer>(intSet);
		
//missing element
		System.out.println("Missing element:");
		for(int i=1;i<intList.size();i++) {
			if(i!=intList.get(i-1)) {
				System.out.println(i);
				break;
			}
		}			

	
	}}
		



