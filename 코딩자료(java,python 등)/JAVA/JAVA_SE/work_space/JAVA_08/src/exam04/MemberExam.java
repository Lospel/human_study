package exam04;

import java.util.HashSet;
import java.util.Set;

public class MemberExam {

	public static void main(String[] args) {
		Member m1 = new Member("강현준", 47);
		Member m2 = new Member("강우혁", 20);
		Member m3 = new Member("강현준", 47); // 내용은 같아도 객체의 주소가 다르다.
		Member m4 = new Member("강현준", 45);
		Member m5 = new Member("강현진", 45);
		
		Set<Member> set = new HashSet<Member>();
		set.add(m1);
		set.add(m2);
		System.out.println(set);
		
		boolean result = set.add(m3);
		// hashCode와 equals를 오버라이드하여야만 중복 제거됨.
		// set.add를 하면 2가지를 체크하여 중복 여부를 확인함.
		// 1. hashCode가 같은지?
		// 2. m3.equals(m1 or m2 등등)가 true인지?
		// 모두 만족하면 같은 객체. 그래서 set에 추가 안됨.
		System.out.println(result);
		System.out.println(set);
		System.out.println(m1.equals(m3));
		
		set.add(m4);
		System.out.println(set);
		set.add(m5);
		System.out.println(set);

	}

}
