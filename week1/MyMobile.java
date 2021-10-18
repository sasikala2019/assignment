package week1day2;


public class MyMobile {
	float size;
	String shape;
	String imei;
    char brandName;
    int resolution;
    byte weight;
    boolean isTouchScreen;
    short costMobile;
    

	public void makecall() {
		System.out.println("making calls");
		
	}
	
	public void viewGallery() {
		System.out.println("viewing the Gallery");
	}
	private void payBills() {
		System.out.println("paying bills");
	}

	public static void main(String[] args) {
		MyMobile obj = new MyMobile();
		obj.makecall();
		obj.viewGallery();
		obj.payBills();

	}

}
