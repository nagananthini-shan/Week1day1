package week1.day1;

public class Mobile {
 public void makecall() {
	String mobileModel="Samsung A12";
	Float mobileWeight=0.981F;
	System.out.println("Makeing call");
	

}
	public void sendmsg() {
		boolean  isFullyCharged;
		int mobileCost=12000;
		System.out.println("SendMsg");
		

	}	
		
public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.sendmsg();
		obj.makecall();
		System.out.println("This is my mobile");

	}

}
