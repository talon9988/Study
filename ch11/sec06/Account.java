package ch11.sec06;

public class Account {
	private long balance;

	public Account() { }	

	public long getBalance() {
		return balance;
	}	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws InsufficientException { //이 메서드를 호출한 main의 catch쪽으로 던져짐
		if(balance < money) {
			throw new InsufficientException("잔고부족: "+(money-balance)+" 모자람"); //사용자 예외처리 생성자 호출
		}
		balance -= money;
	}
}

