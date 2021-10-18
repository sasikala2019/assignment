package week1day1.assignment;

public class AmstrongOrNot {

	public static void main(String[] args) {
         int num=153,rem;
         int result = 0;
        int temp=num;
         while(num!=0) {
        	 rem=num%10;
         	 result=result+rem*rem*rem;
        	 num=num/10;
         }System.out.println(result);
         if(result==temp) {
        	 System.out.println("The number is"   + temp +  " amstrong:");
        	 		}       
        	 else{
        		 System.out.println("The number is"  + temp + " not amstrong:" );
        	 }
         }
	}


