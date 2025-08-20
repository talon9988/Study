package ch07.sec10.exam02;

public abstract class Animal { //추상클래스라 객체를 직접 못만듦
	//메소드 선언
	public void breathe() { //일반메소드
		System.out.println("숨을 쉽니다.");
	}

	//추상 메소드 선언
	public abstract void sound();
}
