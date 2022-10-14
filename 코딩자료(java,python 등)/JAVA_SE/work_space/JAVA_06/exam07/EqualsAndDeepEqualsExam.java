package exam07;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExam {

	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));// null은 서로 같음
		System.out.println(Objects.deepEquals(o1, o2));// 객체의 동등비교함.
		System.out.println("----------------------");

		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };

		System.out.println(arr1 + "-" + arr2);
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		// 배열의 주소가 달라도 객체의 동등비교함.
		System.out.println(Arrays.deepEquals(arr1, arr2)); // 위의 내용과 동일
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
		// null도 같다고 인식함.

	}

}
