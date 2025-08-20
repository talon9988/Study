package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home>{ //렌터블인터페이스 타입이 홈 클래스임
													
	@Override 									   
	public Home rent() { //제네릭 타입 받아서 인터페이스에 있는 메소드 오버라이드
		return new Home(); //홈타입을 반환
	}
}
