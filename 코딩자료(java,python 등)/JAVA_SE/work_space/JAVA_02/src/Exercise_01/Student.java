package Exercise_01;

public class Student {
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student() {
		this("홍길동", 1, 1, 100, 60, 76);
	}

	public int getTotal() {
		return this.kor + this.eng + this.math;
	}

	public double getAverage() {
		return this.getTotal() / (double) 3;
		// 정수/정수 ==> 정수, 둘 중 하나가 실수이면 ==> 실수.
	}
	
	}


