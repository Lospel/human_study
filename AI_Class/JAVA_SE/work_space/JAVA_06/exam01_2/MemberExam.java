package exam01_2;

public class MemberExam {
	public static void main(String[] args) {
		Member mem1 = new Member("Blue");
		Member mem2 = new Member("Blue");
		Member mem3 = new Member("Red");
		
		if(mem1.equals(mem2)) {
			System.out.println ("mem1과 mem2는 같다");
		}
		else {
			System.out.println ("mem1과 mem2는 다르다");		
		}
		
		if(mem1.equals(mem3)) {
			System.out.println ("mem1과 mem3는 같다");
		}
		else {
			System.out.println ("mem1과 mem3는 다르다");		
		}
	}

}
