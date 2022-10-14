
public class BeepPrintEx3 {
	public static void main(String[] args) {
		Thread thread = new BeepTask();
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
