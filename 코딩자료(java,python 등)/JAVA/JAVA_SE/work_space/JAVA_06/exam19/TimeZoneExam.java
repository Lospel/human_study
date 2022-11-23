package exam19;

import java.util.TimeZone;

public class TimeZoneExam {

	public static void main(String[] args) {
	     String[] availableIDs = TimeZone.getAvailableIDs();
	     // 세계시의 구분
	      for (String id : availableIDs) {
	         System.out.println(id);
	      }
	}

}
