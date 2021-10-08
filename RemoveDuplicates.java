package week1day2.assignment;
public class RemoveDuplicates {
	public static void main(String[] args) {
		    String text = "We learn java basics as part of java sessions in java week1";
	         int count=0;
	         String[] array=text.split(" ");
	       for (int k= 0; k < array.length; k++) {
	        	 System.out.print(" "+ array[k]+ " ");}
	       for(int i=0;i<array.length;i++) {
	        	  	for(int j = i+1; j < array.length; j++) {
	        		 if(array[i].equals(array[j])) {
	        			 count++;
	        	 if(count>1) {
	        		 System.out.println(" ");
	        				 System.out.println(" "+array[j]);
	        			 }
	        		 }
	        			 
	        	  
				}
				
	       }
	}
}}
