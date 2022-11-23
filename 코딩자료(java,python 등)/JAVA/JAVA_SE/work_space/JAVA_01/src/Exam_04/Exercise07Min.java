package Exam_04;

public class Exercise07Min {

	public static void main(String[] args) {
		int min = 10; // min를 구하기 위한 초기값이 작아야 한다.
		int[] array = { 1, 5, 3, 8, 2 };

		for (int x = 0; x < array.length; x++) {
			if (min > array[x]) {
				min = array[x];
			}
		}
		System.out.println("min: " + min);

	}

}
