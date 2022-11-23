package varAndMethod;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Player p1 = new Player("조환석");
		Enemy e1 = new Enemy(150, 30, 20, "배쌤");
		Arrow a = new Arrow();
		Bat b = new Bat();
		Knife k = new Knife();
		int act;
		
		
		Scanner sc =  new Scanner(System.in) ;
		boolean gameover = true;
		while(gameover) {
			System.out.println("플레이어와 공격을 선택하세요");
			System.out.println("1 : player1의 공격			4 : player2의 공격");
			System.out.println("2 : player1의 스킬 사용			5 : player2의 스킬 사용");
			System.out.println("3 : player1의 무기 줍기			6 : player2의 무기 줍기");
			act= sc.nextInt();
			switch (act) {
			case 1 : p1.attack(e1); break;
			case 2 : p1.skill(e1); break;
			case 3 : p1.weaponBox(a, b, k); break;
			case 4 : e1.attack(p1); break;
			case 5 : e1.skill(p1); break;
			case 6 : e1.weaponBox(a, b, k); break;
			default: break;
			}
			if(e1.hp==0 | p1.hp==0) {
				if (e1.hp==0) {
					System.out.printf("%s 승리!\r", p1.name);
				} else if(p1.hp==0){				
					System.out.printf("%s 승리!\r", e1.name);
				}
				System.out.println("게임이 종료되었습니다.");
				gameover = false;
			}
			System.out.println();
		}
	}
}
		


	

