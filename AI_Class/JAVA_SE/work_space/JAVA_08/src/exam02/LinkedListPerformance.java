package exam02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPerformance {
	// List의 맨 앞쪽에 데이터를 추가시
	// ArrayList와 LinkedList간의 시간차이 분석.
	// ArrayList는 기존의 데이터를 뒤로 미루는 프로세스가 있어서 시간이 오래걸리는 반면.
	// LinkedList는 기존의 데이터의 링크를 변경시키기 때문에 시간이 짧다.
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		list1.clear();
		list2.clear();

		long startTime, endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list1.add(0, String.valueOf(i));
			// 정수 i를 String의 형태로 변경하여 맨 앞에 입력.
			// 데이터의 추가 삭제가 빈번하게 발생한 경우를 실험.
		}
		endTime = System.nanoTime();

		long diff1 = endTime - startTime;
		System.out.println("ArrayList의 수행시간 : " + diff1);

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list2.add(0, String.valueOf(i));
			// 정수 i를 String의 형태로 변경하여 맨 앞에 입력.
			// 데이터의 추가 삭제가 빈번하게 발생한 경우를 실험.
		}
		endTime = System.nanoTime();

		long diff2 = endTime - startTime;
		System.out.println("LinkedList의 수행시간 : " + diff2);
	}

}
