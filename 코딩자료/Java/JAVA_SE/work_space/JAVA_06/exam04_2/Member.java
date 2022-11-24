package exam04_2;

import java.util.Arrays;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public int a[];
	public Car car;

	public Member(String id, String name, String password, int age, boolean adult, int[] a, Car car) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.a = a;
		this.car = car;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member) super.clone();
		// super.clone() Object 클래스의 clone() 메서드 실행하는 것임.
		cloned.a = Arrays.copyOf(this.a, this.a.length);
		cloned.car = new Car(this.car.model);
		return cloned;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
			// 기존에는 Object 클래스의 clone() 메서드 실행.
			// 이번에는 Member 클래스의 clone() 메서드 실행.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
