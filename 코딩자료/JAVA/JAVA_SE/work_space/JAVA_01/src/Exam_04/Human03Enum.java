package Exam_04;

public class Human03Enum {

	public static void main(String[] args) {
		
		System.out.println(Week.values());
		System.out.println(Week.valueOf("SUN"));
		System.out.println(Week.FRI);
		
	}
	
	public enum Week {
		SUN, MON, THE, WED, THU, FRI, SAT
	}
}
