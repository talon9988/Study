package ch06.sec10.exam01;

public class Calculator { //스태틱으로 선언해서 객체를 만들지 않고도 쓸 수 있다
	final static double pi = 3.14159; //필드
	//파이널을 설정하면 이 멤버변수는 값을 바꿀 수 없다.
	//double a = 3.14;

	static int plus(int x, int y) { //메서드
		return x + y;
	}

	static int minus(int x, int y) { //메서드
		return x - y;
	}
}
