package ch06.sec10.exam03;

public class Car {
	// 인스턴스 필드 선언
	int speed;

	// 인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "로 달립니다.");
	}
	
	static void simulate() {
		// 객체 생성
		Car myCar = new Car();
		// 인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
	} 

	public static void main(String[] args) {
		//정적 메소드 호출
		simulate(); //호출되고 실행을 다하면 이 정적 메소드 안에 생서한 객체는 사라짐
		
		// 객체 생성-아까 위에 만든 거랑 이름은 같지만 전혀 다른 새객체임
		Car myCar = new Car();
		// 인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();
	}
}
