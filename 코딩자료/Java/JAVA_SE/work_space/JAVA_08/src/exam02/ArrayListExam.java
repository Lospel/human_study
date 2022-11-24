package exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		// default로 초기용량을 10으로 설정한다.
		List<String> list2 = new ArrayList<String>(100);
		// 초기용량을 100으로 설정.
		List<String> list3 = Arrays.asList("a", "b", "c", "d");
		// 컬렉션을 포함해서 초기화 가능.
		// 수정 불가. 고정적으로 사용할 때 이용. (검색만 가능)
		System.out.println(list3.get(0));

		List<String> list4 = new ArrayList<String>();
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		// 초기용량 10이라도 11개부터는 자동으로 용량을 늘리면서 처리해준다.
		System.out.println(list4);

		list1.add("휴먼");
		list1.add("교육");
		list1.add("센터");
		list1.add("휴먼");
		System.out.println(list1);
		list1.add(1, "영등포"); // 정해진 위치에 추가
		System.out.println(list1);

		list1.set(1, "수원"); // 정해진 위치에 변경
		System.out.println(list1);
		boolean a = list1.isEmpty();
		System.out.println(a); // 비어 있는지 확인. false
		System.out.println(list2.isEmpty()); // 비어 있는지 확인. true
		System.out.println(list4.size()); // collection 길이
		System.out.println(list1.add("학원")); // 리턴값은 성공여부를 알려주기 때문에 boolean 값이 표시된다.
		System.out.println(list1); // 현재의 list1의 값을 조회한다.
		
		System.out.println(list1.remove(4)); // 5번째의 휴먼 삭제.
		System.out.println(list1.remove("수원")); // 2번째의 수원 삭제.
		System.out.println(list1);
		System.out.println(list1.remove("영등포")); // 없는 것을 삭제 시도. false
		System.out.println(list1);
	
//		System.out.println(list1.clear()); // void 출력 불가.
		list1.clear();	// list1 모두 삭제.
		System.out.println(list1);

	}

}
