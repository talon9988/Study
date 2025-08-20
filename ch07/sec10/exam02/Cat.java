package ch07.sec10.exam02;

public class Cat extends Animal { //추상 클래스를 상속받음
	//추상 메소드 재정의
	@Override
	public void sound() {
		System.out.println("야옹"); //추상 클래스의 메소드를 구체적으로 정의해 줘야 함
	}
}
