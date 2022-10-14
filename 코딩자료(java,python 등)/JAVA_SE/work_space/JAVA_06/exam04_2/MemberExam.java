package exam04_2;

public class MemberExam {

	public static void main(String[] args) {
		int [] a = {10,20,30};
		Member origin 
		= new Member("blue","강현준","12345", 47, 
				true, a, new Car("소나타")) ;
		Member cloned = origin.getMember();
		
		cloned.password = "67890";
		cloned.a[0] = 100;
		cloned.car.model = "그랜저";
		
		System.out.println (origin.password);
		System.out.println (cloned.password);
		
		System.out.println (origin.a[0]);
		System.out.println (cloned.a[0]);
		
		System.out.println (origin.car.model);
		System.out.println (cloned.car.model);

	}

}
