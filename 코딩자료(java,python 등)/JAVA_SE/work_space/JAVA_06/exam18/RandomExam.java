package exam18;

import java.util.Arrays;
import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		long seed1 = System.currentTimeMillis();
		long seed2 = System.nanoTime();
		
		int[] selectNumber = new int[6];
		Random random = new Random(seed1);
		// 컴퓨터에서 난수를 발생시키는 기준인 seed라는 것이 있음.
		// 3은 seed를 의미함.
		System.out.print("선택 번호: ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			// nextInt는 1~45 사이의 난수를 뽑는 것. 중복X.
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		int[] winningNumber = new int[6];
		random = new Random(seed2);
		System.out.print("당첨 번호: ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();

		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨 여부: ");
		if (result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}

	}

}
