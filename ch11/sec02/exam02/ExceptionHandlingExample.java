package ch11.sec02.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String"); //Class: 클래스를 로딩하는 메소드. 클래스 이름이 클래스다, forname: 자바에 해당이름의 스트링 클래스가 존재하는지 파악
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {		
			Class.forName("java.lang.String2"); //여기서 에러가 남
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
