package ch11.sec05;

public class ThrowsExample1 {
	public static void main(String[] args) {
		try {
			findClass(); //()안의 클래스가 존재하는지 확인
			//return;
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString()); //발생한 예외를 문자열로 표현해줌
		}
		finally {System.out.println("종료");}
	}
	
	public static void findClass() throws ClassNotFoundException { //catch쪽으로 예외 떠넘김
		Class.forName("java.lang.String2");
		// JVM이 해당 클래스 이름을 메모리에 로딩하려고 시도하는 코드예요.
		//"java.lang.String2"라는 문자열로 클래스를 찾음 (실제 존재해야 함!)
	}
}


