package exam12;

public class CompExam {

	public static void main(String[] args) {
		Desktop dt = new Desktop ();
		dt.turnOn();
		dt.typing();
		dt.display();
		dt.turnOff();
		System.out.println();
		
		MyNoteBook nb = new MyNoteBook ();
		nb.turnOn();
		nb.typing();
		nb.display();
		nb.turnOff();
	}

}
