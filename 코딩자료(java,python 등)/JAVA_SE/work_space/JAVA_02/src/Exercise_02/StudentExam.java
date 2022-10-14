package Exercise_02;

public class StudentExam {

	public static void main(String[] args) {
		Student a1 = new Student("홍길동", 1, 1, 100, 60, 76);

		System.out.println("이름: " + a1.name);
		System.out.println("총점: " + a1.getTotal());
		System.out.printf("평균: %.1f \n", a1.getAverage());
		
		System.out.println(a1.info());
	}

}
