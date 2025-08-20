package ch13.sec02.exam02;

public class GenericExample {
	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent(); //rent에서 홈타입을 반환받아서 홈 객체를생성 
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent(); //rent에서 카타입을 반환받아서 홈 객체를생성 
		car.run();
	}
}
