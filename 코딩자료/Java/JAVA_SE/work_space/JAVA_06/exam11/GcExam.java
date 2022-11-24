package exam11;

public class GcExam {

	public static void main(String[] args) {
		Employee emp;
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.println ("emp : " + emp.eno);
		
		System.gc();
				

	}

}
