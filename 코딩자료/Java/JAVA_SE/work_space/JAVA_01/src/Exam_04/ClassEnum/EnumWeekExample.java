package Exam_04.ClassEnum;

import java.util.Calendar;

import Exam_04.Human03Enum.Week;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// 오늘의 요일을 순서적으로 반환합니다. (1~7)
		// Week라는 변수에는 오늘의 요일을 일요일부터 순서대로 반환.

		int year = cal.get(Calendar.YEAR); // 연도

		System.out.println(week);
		switch (week) {
		case 1:
			today = Week.SUN;
			break;
		case 2:
			today = Week.MON;
			break;
		case 3:
			today = Week.THE;
			break;
		case 4:
			today = Week.WED;
			break;
		case 5:
			today = Week.THU;
			break;
		case 6:
			today = Week.FRI;
			break;
		case 7:
			today = Week.SAT;
			break;
		}
		System.out.println("today : " + today);
		System.out.println("today.name() : " + today.name());
		System.out.println("today.ordinal() : " + today.ordinal());
		// ordinal 은 0부터 시작해서 현재의 위치를 숫자로 반환함.

		Week day1 = Week.MON; // day1=월(2)
		Week day2 = Week.THU; // day2=목(5)

		System.out.println("day1.compareTo(day2) : " + day1.compareTo(day2));
		System.out.println("day2.compareTo(day1) : " + day2.compareTo(day1));
		System.out.println("day1.compareTo(day1) : " + day1.compareTo(day1));

//      System.out.println (Week.values());
		System.out.println(Week.valueOf("SUN"));
		System.out.println(Week.FRI);

		System.out.println("Week.values() : " + Week.values());

		Week[] days = Week.values();
		// 1개의 값이 아닌 여러 개의 값이 넘어옵니다.
		// days라는 것 안에는 Week Enum type의 값이 배열의 형태로 관리되고 있습니다.
		// days = {SUN, MON, THE, WED, THU, FRI, SAT}

		for (Week day : days) { // 초기값 ; 조건 ; 증감
			System.out.println(day);
		}
	}

}
