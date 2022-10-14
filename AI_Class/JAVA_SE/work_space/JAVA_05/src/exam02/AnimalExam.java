package exam02;

public class AnimalExam {

	public static void main(String[] args) {
		Animal am = new Cat(); // 자동타입변환
		Cat c = (Cat) am; // 강제타입변환
		Dog d = (Dog) am; // 강제타입변환
		// (d instanceof Dog) ==> false 나오므로 ClassCastException 발생
	}

}
