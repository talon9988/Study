package ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {	
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이  같음");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) { //주소를 대조함
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름"); //주소가 다름
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이  같음");
		}	
		
		System.out.println(strVar1.hashCode());
		System.out.println(strVar2.hashCode());
		System.out.println(strVar3.hashCode());
		System.out.println(strVar4.hashCode());
	}
}


