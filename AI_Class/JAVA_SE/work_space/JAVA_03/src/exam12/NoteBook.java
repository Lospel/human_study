package exam12;

public abstract class NoteBook extends Computer {
	
	@Override
	public void display() {
		System.out.println("노트북을 화면에 출력하다.");				
	}

	@Override
	public abstract void typing();
}
