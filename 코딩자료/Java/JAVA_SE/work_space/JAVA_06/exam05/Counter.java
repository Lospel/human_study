package exam05;

public class Counter {
	public int no;
	public Counter(int no) {
		this.no = no;
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no + "번째의 객체의 finalize 실행");
		super.finalize(); 
		// Object 클래스의 finalize 메서드 호출하여 실질적으로 메모리에서 쓰레기객체를 삭제함.
	}
}
