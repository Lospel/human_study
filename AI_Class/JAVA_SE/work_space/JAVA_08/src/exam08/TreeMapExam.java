package exam08;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(new Integer(80), "human1");
		tm.put(new Integer(70), "human2");
		tm.put(new Integer(99), "human3");
		tm.put(new Integer(90), "human4");

		// 검색
		System.out.println("firstEntry() : " + tm.firstEntry().getKey() + " - " + tm.firstEntry().getValue());
		System.out.println("lastEntry() : " + tm.lastEntry().getKey() + " - " + tm.lastEntry().getValue());
		System.out.println("lowerEntry(82) : " + tm.lowerEntry(82).getKey() + " - " + tm.lowerEntry(82).getValue());
		System.out.println("higherEntry(82) : " + tm.higherEntry(82).getKey() + " - " + tm.higherEntry(82).getValue());
		System.out.println("floorEntry(80) : " + tm.floorEntry(80).getKey() + " - " + tm.floorEntry(80).getValue());
		System.out.println("ceilingEntry(80) : " + tm.ceilingEntry(80).getKey() + " - " + tm.ceilingEntry(80).getValue());

		// 정렬
		Map.Entry<Integer, String> me = null;

		NavigableMap<Integer, String> descMap = tm.descendingMap();	// Key 기준 내림차순 정렬
		Set<Map.Entry<Integer, String>> descEntrySet = descMap.entrySet(); 
		System.out.println("descEntrySet : " + descEntrySet);
		NavigableMap<Integer, String> ascMap = descMap.descendingMap();	// 내림차순 정렬에 내림차순 ==> 오름차순.
		Set<Map.Entry<Integer, String>> ascEntrySet = ascMap.entrySet();
		System.out.println("ascEntrySet : " + ascEntrySet);

		NavigableMap<Integer, String> rangeMap = tm.subMap(80, true, 99, false);
		System.out.println("rangeMap : " + rangeMap);
	}

}
