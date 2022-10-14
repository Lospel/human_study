package exam04;

public class Member extends Object { // extends Object는 생략가능.
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			return (this.name.equals(mem.name) && this.age == mem.age);
		} else {
			return false;

		}

	}
}
