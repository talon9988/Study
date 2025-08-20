package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성 > 객체를 만들어야 클래스의 필드를 쓸 수 있다.
		Car myCar = new Car(); //기본 생성자이용해 객체 선언
		myCar.speed += 100;
		//Car 객체의 필드 값 읽기
		System.out.println("모델명: " + myCar.model); //필드
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed); //200
		
		Car myCar2 = new Car();
		System.out.println(myCar2.speed); //100
		
		Car myCar3 = new Car();
		myCar3.brand = "LEXUS";
		System.out.println(myCar3.brand);
		
		

	}


}//배ㅗㄱ파죽겠다ㅏ


