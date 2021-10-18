package week2.day1;

public class MethOverloading {
public void add(int a,int b) {
	int sum=a+b;
	System.out.println("The Addition of two nums:"+sum);
}
public void add(int a,int b,int c) {
	int sum=a+b+c;
	System.out.println("The Addition of three nums:"+sum);
}
public void mul(int a,int b) {
	int sum=a*b;
	System.out.println("The Mul of two nums:"+sum);
}
public void Mul(double a,double b,double c) {
	double sum=a*b*c;
	System.out.println("The mul of three nums:"+sum);
}
public void sub(int a,int b) {
	int sum=a-b;
	System.out.println("The sub of two nums:"+sum);
}
public void sub(int a,int b,int c) {
	int sum=a-b-c;
	System.out.println("The sub of three nums:"+sum);
}

	
	public static void main(String[] args) {
		MethOverloading obj= new MethOverloading();
		obj.add(20, 30);
		obj.add(10,20,30);
		obj.sub(10, 20);
		obj.sub(10, 20, 30);
		obj.sub(20, 30, 60);
		obj.Mul(10.0, 20.0, 30.0);

	}
	

}
