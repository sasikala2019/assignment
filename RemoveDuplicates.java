package week1day2.assignment;
import java.lang.ArrayIndexOutOfBoundsException;
public class RemoveDuplicates {

	public static void main(String[] args) {
         String text = "We learn java basics as part of java sessions in java week1";
         int count=0;
         String[] array=text.split(" ");
       for (int i = 0; i < array.length; i++) {
        	 System.out.print(" "+ array[i]);
        	  	for(int j = i+1; j < array.length; j++) {
        		 if(array[i]==array[j]) {
        			 count++;
        	 if(count>1) {
        				 System.out.println(array[j]);
        			 }
        		 }
        			 
        	  
			}
			
       }
}}