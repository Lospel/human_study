package exam12;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("데스크탑 디스플레이 하다.");		
	}

	@Override
	public void typing() {
		System.out.println("데스크탑 타이핑 하다.");				
	}
	
	@Override
	public void turnOn() {
		System.out.println("데스크탑 부팅 하다.");				
	}
}
