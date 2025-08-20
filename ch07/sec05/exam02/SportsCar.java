package ch07.sec05.exam02;

public class SportsCar extends Car { //자식
	@Override
	public void speedUp() { //오버라이딩 됨
		speed += 10; //부모의 필드
	}

	// 오버라이딩을 할 수 없음
	/*
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0; //값을 바꿀 수 없음
	}
	*/
}
