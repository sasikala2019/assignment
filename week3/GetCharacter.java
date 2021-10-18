package week2.day1.assignment;

public class GetCharacter {
	public void getChar() {
	String text = "Java Exercise" ;
	System.out.println(text);
	char charArray[]=text.toCharArray();
	
	//print Index for character E and s 
		for(int i=0;i<=charArray.length;i++){
		if(i==5) {
		System.out.println(charArray[i]);
		}if(i==11) {
			System.out.println(charArray[i]);
		}
	}	}
	public static void main(String[] args){
		GetCharacter obj=new GetCharacter();
		obj.getChar();		
		}
	}

	
	


