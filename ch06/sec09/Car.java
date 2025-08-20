package ch06.sec09;

public class Car {
	// 필드 선언
	String model;
	int speed;

	// 생성자 선언
	Car(String model) {
		this.model = model;	// 매개변수를 필드에 대입
	}

	// 메소드 선언
	void setSpeed(int speed) {
		this.speed = speed;	// 매개변수를 필드에 대입
	}

	void run() {
		this.setSpeed(100); //위의 메소드를 여기서 호출
		System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)"); //메소드를 호출해서 매개변수를 필드에 대입
	}
}
