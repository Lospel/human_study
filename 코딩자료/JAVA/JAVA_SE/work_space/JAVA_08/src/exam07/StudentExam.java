package exam07;

import java.util.HashMap;
import java.util.Map;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student(1, "강현준");
		Student s2 = new Student(2, "강우혁");
		Student s3 = new Student(3, "강주혁");
		Student s4 = new Student(3, "강주혁");

		Map<Student, Integer> map = new HashMap<Student, Integer>();
		// 학생의 점수
		map.put(s1, 100);
		map.put(s2, 90);
		map.put(s3, 80);
		map.put(s4, 70);
		// s3 == s4, 그러나 주소가 다름.
		// s4.equals(s3)
		System.out.println(map);

		Student s10 = new Student(1, "강현준");
		Student s20 = new Student(2, "강우혁");
		Student s30 = new Student(3, "강주혁");

//		System.out.println(map.get(new Student(1,"강현준")));
//		System.out.println(map.get(new Student(2,"강우혁")));
//		System.out.println(map.get(new Student(3,"강주혁")));

		System.out.println(map.get(s10));
		System.out.println(map.get(s20));
		System.out.println(map.get(s30));
		// hashCode, equals를 오버라이드 하지 않으면 못찾음. 왜냐하면 s1과 s10은 다르게 인식하기 때문임.

	}

}
