package ch12.sec06;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Boxing
		Integer obj = 100; //박싱 - 기본형 데이터를 객체(object)로 감싸는 것
		System.out.println("value: " + obj.intValue());
	
		//Unboxing
		int value = obj;  	//언박싱 - 값으로 바꿈
		System.out.println("value: " + value);
		
		//연산시 Unboxing
		int result = obj + 100; 
		System.out.println("result: " + result);
	}
}
