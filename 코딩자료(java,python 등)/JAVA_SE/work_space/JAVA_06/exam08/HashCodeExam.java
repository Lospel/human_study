package exam08;

import java.util.Objects;

public class HashCodeExam {

	public static void main(String[] args) {
		Student s1 = new Student (1, "강현준");
		Student s2 = new Student (2, "강현준");
		// 객체의 값은 주소값을 갖는데.
		// new이기 때문에 서로 다른 주소값을 갖습니다.
		// 주소값은 hashCode에 영향을 받고.
		// 만약 hashCode 생성을 인자의 값으로 생성한다면.
		// 인자가 같을 경우 같은 주소를 갖게 됩니다.
		
		// Object의 hashCode는 주소값 기반으로.
		// Student 클래스의 hashCode는 인자 기반으로 오버라이딩 했음
		
		System.out.println (s1);
		System.out.println (s2);
		
		System.out.println (s1.hashCode());
		System.out.println (s2.hashCode());
		
		System.out.println (Objects.hashCode(s1));
		System.out.println (Objects.hashCode(s2));
	
	}

}
