package exam03_1;

public class ProductExam {

	public static void main(String[] args) {
		Product<Tv, String> prod1 = new Product<Tv, String>();
		Tv tv1 = new Tv("μΌμ±");
		prod1.setType(tv1);
		prod1.setModel("Smart Tv");
		Tv t = prod1.getType();
		String str1 = prod1.getModel();
		System.out.println(t + "-" + t.company + " / " + str1);

		Product<Car, String> prod2 = new Product<Car, String>();
		Car c = new Car("νλ");
		prod2.setType(c);
		prod2.setModel("Sports Car");
		Car car1 = prod2.getType();
		String str2 = prod2.getModel();
		System.out.println(car1 + "-" + car1.company + " / " + str2);

	}

}
