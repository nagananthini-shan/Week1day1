package week1.day1;

public class Bike {
	 void applyBreak() {
		// TODO Auto-generated method stub
		 System.out.println("print as apply break");

	}
	public void soundHorn() {
		// TODO Auto-generated method stub
		System.out.println("print as sound horn");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.applyBreak();
		obj.soundHorn();
		Bike obj1=new Bike();
		obj1.applyBreak();
		obj1.soundHorn();
		

	}

}
