package exam08;

import java.util.Objects;

public class Student {
	int sno;
	String name;
	
	public Student (int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.sno, this.name);
	}
}


