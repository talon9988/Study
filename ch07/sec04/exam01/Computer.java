package ch07.sec04.exam01; //메소드 오버라이딩

public class Computer extends Calculator {
	//메소드 오버라이딩
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 arearCircle() 실행");
		//return Math.PI * r * r; //부모메소드와 자식메소드의 형태가 같음 > 자식것으로 재정의 됨
		return super.areaCircle(r); //부모클래스의 메소드 불러오기
	}
}
