package exam03_2;

public class ProductExam {
	public static void main(String[] args) {
		Product<Tv, String> prod1 = new Product<Tv, String>();
		Tv tv1 = new Tv("삼성", "Galaxy TV", 300, true);
		prod1.setType(tv1);
		prod1.setModel("Smart Tv");
		Tv tv = prod1.getType();
		String str1 = prod1.getModel();
		System.out.println(tv + " - " + tv.company + " / " + str1);
		System.out.println(tv.name + " / " + tv.maxChannel + " / " + tv.isVoiceRecogition);
		System.out.println("-------------------");

		Product<Car, String> prod2 = new Product<Car, String>();
		Car c1 = new Car("현대", "G70", 300);
//		Car c2 = new Car("기아", "K7", 250);
//		Car c3 = new Car("쌍용", "액티언", 160);
		prod2.setType(c1);
		prod2.setModel("Sports Car");
		Car car1 = prod2.getType();
		String str2 = prod2.getModel();
		System.out.println(car1 + " - " + car1.company + " / " + str2);
		System.out.println(car1.name + " - " + car1.maxSpeed);
	}
}
