package week1day2.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] array=test.split(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
			}
		for (int i = 0; i < array.length; i++) {
			if (i%2 == 0) {
				System.out.print(" "+ array[i]+" ");
						}
			if (i%2 != 0) {
				char[] evenWords=array[i].toCharArray();
				for (int j =evenWords.length-1 ; j>=0; j--) {
					System.out.print(evenWords[j]);
				}
				
			}
			
		}
	}

}
