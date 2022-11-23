package Exam_21.exam0;

public class MaxSolution {
	private int[] array;

	public MaxSolution(int[] array) {
		this.array = array;
	}

	public int getMax() {
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}
