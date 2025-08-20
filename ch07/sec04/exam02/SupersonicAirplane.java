package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane {
	//상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	//상태 필드 선언
	public int flyMode = NORMAL;
	
	//메소드 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");			
		} else {
			//Airpanle 객체의 fly() 메소드 호출
			super.fly(); //super. : 오버라이딩으로 덮어씌어진 부모클래스의 메소드를 호출할 수 있다.
		}
	}
}

