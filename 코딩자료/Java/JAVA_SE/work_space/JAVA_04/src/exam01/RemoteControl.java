package exam01;

public interface RemoteControl {
	public static int MIN_VOL = 0;

	public void turnOn();
	// JAVA 8 버전 이후 추가 기능.

	// default 메서드는 해당 interface를 구현하는 실체클래스 모두가 default로 사용할 수 있음.
	// 실체클래스에서 오버라이드하면 실체클래스의 기능을 수행하고,
	// 실체클래스에서 구현하지 않은면 interface에 있는 default 메서드를 수행한다.

	default void setMute() {
		System.out.println("볼륨을 0으로 하다.");
	}

	static void changBatt() {
		// static은 클래스 차원의 내용.
		System.out.println("배터리 교체하다.");
	}
}
