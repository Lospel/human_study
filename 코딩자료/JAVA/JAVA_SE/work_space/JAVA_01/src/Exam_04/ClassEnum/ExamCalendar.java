package Exam_04.ClassEnum;

import java.util.Calendar;

public class ExamCalendar {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();

		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1; // Month는 0부터 시작... 그래서 +1 필요합니다.
		int day = today.get(Calendar.DAY_OF_MONTH);
		int week = today.get(Calendar.DAY_OF_WEEK);
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);

//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(day);

		System.out.printf("현재의 시각은 %d년 %d월 %d일 %d:%d:%d \n", year, month, day, hour, minute, second);
		System.out.printf("오늘의 요일은 %d요일입니다. \n",week);
	}

}
