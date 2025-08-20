package ch12.sec03.exam03;

public class ToStringExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
		/*System.out.println(myPhone);
		이 문장은 사실 다음과 완전히 같은 코드입니다.
		System.out.println(myPhone.toString());
		즉, println()에 객체를 넘기면 자동으로 그 객체의 toString() 메서드를 호출해서 출력해요.*/
	}
}

