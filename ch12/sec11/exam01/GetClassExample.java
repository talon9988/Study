package ch12.sec11.exam01;

public class GetClassExample {
	public static void main(String[] args) throws Exception {
		//how1 //클래스의 정보 불러오는법 123(메타정보 - 정보에 대한 정보)
		//Class clazz = Car.class;
		
		//how2
		//Class clazz = Class.forName("ch12.sec11.exam01.Car"); //.forname()안의 이름의 클래스를 찾아냄
		
		//how3
		Car car = new Car();
		Class clazz = car.getClass();
		
		System.out.println("패키지: " + clazz.getPackage().getName()); 
		System.out.println("클래스 간단이름: " + clazz.getSimpleName());
		System.out.println("클래스 전체이름: " + clazz.getName());
	}
}
