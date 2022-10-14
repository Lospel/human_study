package Exam_04;

public class Exercise07Max {

	public static void main(String[] args) {
		int max = 0;			// MAX를 구하기 위한 초기값이 작아야 한다.
		int[] array = {1,5,3,8,2};
		
		for (int x=0; x<array.length;x++) {	
				if (max < array[x]) {
					max = array[x];
			}
		}
		System.out.println("max: "+ max);
		
	}

}
