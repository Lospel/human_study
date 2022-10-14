package exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("강현준", 47);
		map.put("강우혁", 20);
		map.put("강주혁", 16);

		System.out.println("size() : " + map.size());
		System.out.println("강우혁의 나이 : " + map.get("강우혁"));

		// Key와 Value를 전체적으로 정리하여 검색하는 방법.
		// Key는 중복되지 않으므로 set의 형태로 추출 가능.

		Set<String> keyset = map.keySet(); // key값을 Set으로 설정.
		System.out.println("KeySet : " + keyset);
		Iterator<String> iter = keyset.iterator();

		// 검색의 1번째 방법.
		while (iter.hasNext()) {
			String k = iter.next();
			Integer v = map.get(k);
			System.out.println(k + " - " + v);
		}

		// map 삭제 기능.
		map.remove("강현준");
		System.out.println("map.size : " + map.size()); // 2

		map.put("강현준", 47); // 원상복구

		// 검색의 2번째 방법.
		Set<Map.Entry<String, Integer>> mEntry = map.entrySet();
		System.out.println("Map.Entry : " + mEntry);

		Iterator<Map.Entry<String, Integer>> mEntryIter = mEntry.iterator();
		while (mEntryIter.hasNext()) {
			Map.Entry<String, Integer> nextEntry = mEntryIter.next();
			// nextEntry = [강현준(key)=47(value)]
			String k = nextEntry.getKey(); // map.entry 상의 key를 추출.
			Integer v = nextEntry.getValue();
			System.out.println(k + " - " + v);
		}

		// map 전체 삭제
		map.clear();
		System.out.println(map);
	}

}
