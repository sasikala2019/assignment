package week2.day2.assignment;

import java.util.HashSet;
import java.util.Set;

public class CollectionFindIntersectionSet {

	public static void main(String[] args) {
		int[] array1 ={3,2,11,4,6,7};
		 int[] array2 = {1,2,8,4,9,7};
//set declaration		 
		 Set<Integer> intSet=new HashSet<Integer>();
		 System.out.println("The first Array:");
		 for(int i=0;i<array1.length;i++) {
			 System.out.print(" "+array1[i]);
		 }System.out.println();
		 System.out.println("The Second Array:");
		 for(int i=0;i<array2.length;i++) {
			 System.out.print(" "+array2[i]);
		 }System.out.println();
		System.out.println("The intersection of array using set");
		 for(int i=0;i<array1.length;i++) {
			 for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					intSet.add(array1[i]);
					
				}
			 }
		 }System.out.println(intSet);
	}

}
