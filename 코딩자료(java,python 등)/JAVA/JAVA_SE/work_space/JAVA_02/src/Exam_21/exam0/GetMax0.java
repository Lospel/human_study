package Exam_21.exam0;

public class GetMax0 {

	public static void main(String[] args) {
		int[] array1 = { 5, 4, 9, 10, 3, 7 };
		int max = 0;

		for (int i = 0; i < array1.length; i++) {
			if (max < array1[i]) {
				max = array1[i];
			}
		}
		System.out.printf("MAX : %d \n", max);

		int[] array2 = { 1, 4, 9, 19, 3, 7 };
		max = 0;
		for (int i = 0; i < array2.length; i++) {
			if (max < array2[i]) {
				max = array2[i];
			}
		}
		System.out.printf("MAX : %d \n", max);
	}

}
