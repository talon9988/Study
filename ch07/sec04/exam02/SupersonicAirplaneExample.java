package ch07.sec04.exam02; //메소드 오버라이딩

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff(); //부모
		sa.fly(); //자식
		sa.flyMode = SupersonicAirplane.SUPERSONIC; //2가됨
		sa.fly(); //자식
		sa.flyMode = SupersonicAirplane.NORMAL; //1이됨
		sa.fly(); //자식
		sa.land(); //부모
	}
}
