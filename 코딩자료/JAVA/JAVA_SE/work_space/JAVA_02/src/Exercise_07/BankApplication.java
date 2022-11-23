package Exercise_07;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	// accountArray 100개의 공간이 있는 배열변수.
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();

		Account ac = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = ac;
				System.out.printf("결과: %d번째 위치에 계좌가 생성되었습니다. \n", i);
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌목록");
		System.out.println("-------------------------------------------");
		
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null) {
				System.out.print(account.getAno());
				System.out.print("	");
				System.out.print(account.getOwner());
				System.out.print("	");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
//		for (int i = 0; i < accountArray.length; i++) {
//			if (accountArray[i] == null) {
//				break;
//			}
//			System.out.printf("계좌번호: %s \t 이름: %s \t 잔고: %d \n", accountArray[i].getAno(), accountArray[i].getOwner(),
//					accountArray[i].getBalance());
//		}
	}

	private static void deposit() {
		System.out.println("-------------------------------------------");
		System.out.println("예금");
		System.out.println("-------------------------------------------");
		System.out.println("계좌번호: ");
		String ano = scanner.next();
		System.out.println("예금액: ");
		int deposit = scanner.nextInt();
		
		Account ac = findAccounts(ano);

		int currentBalance = ac.getBalance();
		int nextBalance = currentBalance + deposit;
		ac.setBalance(nextBalance);
		System.out.println("결과: 예금이 성공되었습니다.");

	}

	private static Account findAccounts(String ano) {
		int i;
		for (i = 0; i < accountArray.length; i++) {
			if (ano.equals(accountArray[i].getAno())) {
				break;
			}
		}
		return accountArray[i];
	}

	private static void withdraw() {
		System.out.println("-------------------------------------------");
		System.out.println("출금");
		System.out.println("-------------------------------------------");
		System.out.println("계좌번호: ");
		String ano = scanner.next();
		Account ac = findAccounts(ano);
		System.out.println("출금액: ");
		int withdraw = scanner.nextInt();

		int currentBalance = ac.getBalance();
		int nextBalance = currentBalance - withdraw;
		ac.setBalance(nextBalance);
		System.out.println("결과: 출금이 성공되었습니다.");
	}

}
