package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car>{ //받은 렌터블 인터페이스 타입이 카 타입임
	@Override
	public Car rent() { //받은 제네릭 타입으로 인터페이스에 있는 메소드 오버라이드
		return new Car(); //카타입을 반환
	}
}
