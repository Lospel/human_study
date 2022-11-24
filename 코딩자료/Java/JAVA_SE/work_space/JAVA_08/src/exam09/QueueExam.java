package exam09;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {

	public static void main(String[] args) {
		Queue<Coin> que = new LinkedList<Coin>();

		Coin c1 = new Coin(10);
		Coin c2 = new Coin(20);
		Coin c3 = new Coin(30);
		Coin c4 = new Coin(40);

		que.offer(c1);
		que.offer(c2);
		que.offer(c3);
		que.offer(c4);
		// 10원 코인이 가장 앞에, 40원 코인이 가장 뒤에.
		// 앞에 있는 10원 코인부터 빠져나감.
		System.out.println(que);

		while (!que.isEmpty()) {
			Coin rmCoin = que.poll();
			// poll은 que에서 빼내고, 빠진 코인은 rmCoin에 대입.
			// 앞에서부터 빠짐.
			System.out.println("제거된 코인 : " + rmCoin.value);
		}

		System.out.println("Queue에 코인이 없습니다.");
	}

}
