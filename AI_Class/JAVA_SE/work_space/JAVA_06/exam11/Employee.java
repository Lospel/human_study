package exam11;

public class Employee {
	public int eno;
	public Employee(int eno) {
		this.eno = eno;
		System.out.println (eno + " 메모리 생성");
	}
	
	public void finalize() {
		System.out.println (eno + "메모리 제거");
	}
}
