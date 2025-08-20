package ch11.sec06;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		//출금하기
		try {
			account.withdraw(30000); //에러발생
		} catch(InsufficientException e) { //사용자 지정 예외처리
			String message = e.getMessage(); //부모클래스(Exception)의 메서드
			System.out.println(message);
		}
	}
}
