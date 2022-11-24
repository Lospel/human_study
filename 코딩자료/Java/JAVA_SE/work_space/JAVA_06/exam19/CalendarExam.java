package exam19;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		// Date 클래스를 통해서 현재 시간을 얻을수도 있지만,
		// Calendar 클래스도 getInstance 메서드를 통해서 얻을 수 있다.
		// getInstance 메서드 내에 Date 클래스를 통해서 처리하는 부분이 있다고 짐작할 수 있다.
		
		System.out.println(now.toString());

		int year = now.get(Calendar.YEAR); // 2022 출력
		int month = now.get(Calendar.MONTH) + 1; // Month는 0부터 시작하므로 +1 함.
		int day = now.get(Calendar.DAY_OF_MONTH); // 24
		int week = now.get(Calendar.DAY_OF_WEEK); // 주별 일련번호. 수(4). 일(1) 그리고 월(2)...

		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:	// Calendar.MONDAY = 2 ==> static final로 선언되었으므로 클래스를 통해서 변수 접근.
			strWeek = "월";
			break;
		case Calendar.TUESDAY:	// Calendar.TUESDAY = 3
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";		// strWeek = "수"
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}

		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.printf("%d년 %d월 %d일 %s요일 %s %d:%d:%d \n", year, month, day, strWeek, strAmPm, hour, minute, second);
	}

}
