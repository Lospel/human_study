package exam03;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	// Object 클래스의 toString() : 주소값을 String화 해서 출력
	// SmartPhone의 toString()을 재정의(오버라이드) 하여 아래와 같이 출력.
	public String toString() {
		return company + "_" + os;
	}

}
