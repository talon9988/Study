package ch07.sec03.exam02;

public class SmartPhone extends Phone {
	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		super(model, color); //부모클래스 생성자 호출하면서 인자로 줌
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}
