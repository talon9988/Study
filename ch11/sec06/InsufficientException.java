package ch11.sec06;

public class InsufficientException extends Exception { //원래 있던 예외 처리 클래스의 자식 클래스로 지정
	public InsufficientException() {
	}

	public InsufficientException(String message) { //Account 클래스의 16번째 줄
		super(message); //부모 생성자 호출
	}
}
