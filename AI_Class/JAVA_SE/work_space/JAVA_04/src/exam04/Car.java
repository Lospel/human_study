package exam04;

public class Car {
	Tire frontLeftTire = new KTire();
	Tire frontRightTire = new KTire();
	Tire rearLeftTire = new KTire();
	Tire rearRightTire = new KTire();
	
	void run() {
		System.out.print("앞우 : ");
		frontRightTire.roll();
//		System.out.println();
		
		System.out.print("앞좌 : ");
		frontLeftTire.roll();
//		System.out.println();
		
		System.out.print("뒤우 : ");
		rearRightTire.roll();
//		System.out.println();
		
		System.out.print("뒤좌 : ");
		rearLeftTire.roll();
//		System.out.println();
				
	}

}
