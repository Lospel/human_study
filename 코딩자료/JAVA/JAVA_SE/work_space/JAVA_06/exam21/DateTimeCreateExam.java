package exam21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeCreateExam {

	public static void main(String[] args) {
		LocalDate currDate = LocalDate.now();
	      System.out.println("현재날짜 : " + currDate);
	      LocalDate targetDate = LocalDate.of(2024, 5, 20);
	      System.out.println("목표날짜 : " + targetDate);

	      // 시간얻기
	      LocalTime currTime = LocalTime.now();
	      System.out.println("현재시간 : " + currTime);
	      LocalTime targetTime = LocalTime.of(6, 30, 1);
	      System.out.println("목표시간 : " + targetTime);

	      // 날짜와 시간얻기
	      LocalDateTime currDateTime = LocalDateTime.now();
	      System.out.println("현재 : " + currDateTime);
	      LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 20, 6, 30, 1);
	      System.out.println("목표 : " + targetDateTime);

	      // 협정 세계시와 시간존(TimeZone)
	      ZonedDateTime utcDateTime = ZonedDateTime.now();
	      System.out.println("협정세계시 : " + utcDateTime);
	      ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
	      System.out.println("뉴욕시간존 : " + newyorkDateTime);
	}

}
