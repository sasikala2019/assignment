package week2.day2.assignment;

public class Desktop implements HardWare,Software {
	public void desktopModel() {
		System.out.println("deskmodel-desktop");
	}

	@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("HardwareResources");
	}

	public void softwareResources(){
		// TODO Auto-generated method stub
		System.out.println("SoftwareResources ");
	}

	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.desktopModel();
		obj.hardwareResources();
		obj.softwareResources();
	}
}
