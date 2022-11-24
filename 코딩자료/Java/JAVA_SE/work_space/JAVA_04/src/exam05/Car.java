package exam05;

public class Car {
	Tire[] tires = { new KTire(), new KTire(), new KTire(), new KTire(), };
	void run() {
		for (int i=0; i<tires.length; i++) {
			System.out.printf("%d : ", i);
			tires[i].roll();
		}
	}
}
