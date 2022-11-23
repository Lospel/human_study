package exam02;

import java.util.LinkedList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		List<String> list = new Vector<String>();
		List<String> list = new LinkedList<String>();
		// List는 인터페이스 = ArrayList는 구현 클래스.
		list.add("휴먼");
		list.add("교육");
		list.add("센터");
		list.add("휴먼");
		// add는 가장 뒤에 배열을 늘려서 추가.
		System.out.println(list);

		String str1 = list.get(2);
		// get은 특정 위치의 값을 얻어옴.
		System.out.println(str1);

		list.remove(1);
		System.out.println(list);
		System.out.println(list.get(1));

		list.remove("휴먼");
		// remove는 위치를 지정할 수도 있지만, 내부값을 기반으로 삭제 가능.
		// 동일한 것이 있으면 맨 앞에만 삭제.
		System.out.println(list);
		list.remove("휴먼");
		System.out.println(list);
		System.out.println(list.get(1));
		// 검색시, 인덱스를 벗어나면 Exception이 발생함.
	}

}
