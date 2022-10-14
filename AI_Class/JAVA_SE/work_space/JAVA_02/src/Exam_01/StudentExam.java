package Exam_01;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student();
		// Student라는 클래스의 인스턴스를 s1으로 만드는데,
		// Student 클래스의 생성자를 통해서 만든다.
		System.out.println("s1 : " + s1); // s1객체가 가지고 있는 시작 주소
		System.out.println("s1의 이름 : " + s1.name);
		System.out.println("s1의 나이 : " + s1.age);

		Student s2 = new Student();
		System.out.println("s2 : " + s2);
		System.out.println("s2의 이름 : " + s2.name);
		System.out.println("s2의 나이 : " + s2.age);

	}

}
