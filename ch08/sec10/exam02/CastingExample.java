package ch08.sec10.exam02;

public class CastingExample {
	public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();

		//인터페이스를 통해서 호출
		vehicle.run();
		//vehicle.checkFare(); (x) > 없으니까

		//강제 타입 변환후 버스클래스에서 직접 호출
		Bus bus = (Bus) vehicle; //비클 인터페이스를 버스로 형변환
		bus.run();
		bus.checkFare();
	}
}
