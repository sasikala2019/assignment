package week2.day1.assignment;

public class AxisBank extends BankInfo {
	//@override
	public void deposit() {
		System.out.println("deposit-axis");
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.deposit();
		BankInfo obj1=new BankInfo();
		obj1.deposit();
		obj1.saving();
		obj1.fixed();
		
		}
}
