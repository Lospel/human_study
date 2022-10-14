package exam09;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		Stack<Coin> st = new Stack<Coin>();

		Coin c1 = new Coin(10);
		Coin c2 = new Coin(20);
		Coin c3 = new Coin(30);
		Coin c4 = new Coin(40);

		st.push(c1); // add도 됨.
		st.push(c2);
		st.push(c3);
		st.push(c4);

		// 10원 코인이 가장 밑에, 40원 코인이 가장 위에.
		// 40원 코인부터 빠져나감.
		System.out.println(st);

		while (!st.empty()) {
			// st.empty는 비어있을 때 true
			// !st.empty는 비어있지 않으면 true
			Coin rmCoin = st.pop();
			// pop를 통해서 맨위의 코인이 제거되고, 제거된 코인은 rmCoin에 대입됨.
			System.out.println("제거된 코인 : " + rmCoin.getCoin());
			// rmCoin.getCoin() 대신 rmCoin.value 가능.
		}

		System.out.println("Stack에 코인이 없습니다.");

	}

}
