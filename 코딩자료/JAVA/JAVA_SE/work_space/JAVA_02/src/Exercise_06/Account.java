package Exercise_06;

public class Account {
	private int balance = 0;
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance<Account.MIN_BALANCE || balance>Account.MAX_BALANCE) {
			return;
		}
		this.balance=balance;
	}

//	public void setBalance(int i) {
//		if (i <= MAX_BALANCE && i >= MIN_BALANCE) {
//			this.balance = i;
//		}
//	}
//	public int getBalance() {
//		return balance;
//	}

}
