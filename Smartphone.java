package week1day1.assignment;

public class Smartphone extends AndroidPhone{

	public static void main(String[] args) {
		Smartphone obj= new Smartphone();
		obj.connectWhatsapp();
		obj.makeCall();
		obj.saveContact();
		obj.sendMsg();
		obj.takeVideo();
	}
public void connectWhatsapp() {
	System.out.println("Connect your whatsapp in smartphone");
}
}
