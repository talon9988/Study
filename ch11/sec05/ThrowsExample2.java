package ch11.sec05;

public class ThrowsExample2 {
	public static void main(String[] args) throws Exception { //메인 함수를 호출한 jvm으로 예외떠넘기기
		findClass();
	}
	
	public static void findClass() throws ClassNotFoundException { //이 메소드를 호출한 메인메소드로 예외 떠넘기기
		Class.forName("java.lang.String2");
	}
}



