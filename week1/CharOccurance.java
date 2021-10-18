package week1day2.assignment;

public class CharOccurance {
	

	public static void main(String[] args) {
		int count=0;
String str="Welcome To Chennai";
char[] charArray=str.toCharArray();
for(int i=0;i<=charArray.length;i++) {
	if(charArray[i]=='e')
		{
		count++;
		System.out.println(count);
		}
	

} 
}
}