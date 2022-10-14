package exam13;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog1 = new Dog("포유류");
		dog1.sound();
		dog1.breathe();

		Cat cat1 = new Cat("포유류");
		cat1.sound();
		cat1.breathe();
		System.out.println("---------------------");
		// 다형성. 자동타입변환
		
		Animal animal1= new Dog("포유류");
		animal1.breathe();
		animal1.sound();
		// Animal 입장에서 추상클래스로 정의한 것은 자식 클래스에서 Override된 것을 수행함.
		
		
		Animal animal2= new Cat("포유류");
		animal2.breathe();
		animal2.sound();
		System.out.println("---------------------");

		// 함수에 의해서 자동타입변환 처리.
//		Animal am1 = new Cat("포유류");
//		aniamlSound(am1);
		aniamlSound(new Cat("포유류"));
		aniamlSound(new Dog("포유류"));

	}

	private static void aniamlSound(Animal animal) {
		animal.sound();
	}

}
