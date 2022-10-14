package Exam_21.exam0;

public class GetMax1 {

	public static void main(String[] args) {
		int[] array1 = { 5, 4, 9, 10, 3, 7 };
		int getMax = getMax(array1);
		System.out.printf("MAX : %d \n", getMax);

		int[] array2 = { 1, 4, 9, 19, 3, 7 };
		getMax = getMax(array2);
		System.out.printf("MAX : %d \n", getMax);
	}

	private static int getMax(int[] array) { // int[] array = array1;
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

}
