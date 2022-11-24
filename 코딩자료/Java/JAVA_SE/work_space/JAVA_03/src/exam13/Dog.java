package exam13;

public class Dog extends Animal{
	
	public Dog(String kind) {
		this.kind = kind;
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
