package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		int result = 0;
		try {
		//int result2 = 10/result;
		
		result = data.length(); //예외가 발생할 수도 있는 구간
		} catch(Exception e) { //처리할 예외 받음(타입 변수이름)
			System.out.println(e.getMessage()); //예외발생 메시지 반환
			result = -1;
		}
		System.out.println("문자수: " + result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}


