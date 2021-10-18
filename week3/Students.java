package week2.day1.assignment;

public class Students {
	//method overloading
	 public void getStudentInfo(){
		 System.out.println("getStudentInfo");
	 }
	 public void getStudentInfo(int ID) {
		 System.out.println("getStudentInfo -ID");
	 }
	 public void getStudentInfo(int ID,String name) {
		 System.out.println("getStudentInfo-ID&name");
		 
	 }
     public void getStudentInfo(String email,long phoneNumber)
     {
    	System.out.println("getStudentInfo-email&phoneNumber)"); 
     }
public static void main(String[] args) {
	 Students obj=new  Students();
	 obj.getStudentInfo();
	 obj.getStudentInfo(25592);
	 obj.getStudentInfo(2532,"sasi");
	 obj.getStudentInfo("sasikalaecekiot@gmail.com",9677042528l);
}
		 
	 }
	 

