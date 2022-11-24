package Exam_21.exam0;

public class InputSolution {

	public static void main(String[] args) {
		int[] array = { 5, 4, 9, 10, 3, 7 };
		MaxSolution maxSolution = new MaxSolution(array);
		int max = maxSolution.getMax();
		System.out.printf("Max : %d \n", max);
	}

}
