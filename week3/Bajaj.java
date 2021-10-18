package week2.day1;

public class Bajaj extends Auto{
	//overriden
	public void driveVehicle()
	{
		System.out.println("The method is overrided");
	}
		public static void main(String[] args) {
		Bajaj Baj=new Bajaj();
		Baj.accelerate();
		Baj.applyBrake();
		Baj.fillFuel();
		Baj.shiftGear();
		
	}

}
