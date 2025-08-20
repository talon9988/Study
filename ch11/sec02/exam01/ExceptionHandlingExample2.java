package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try {
			int result = data.length();
			
			System.out.println("문자수: " + result);
		} catch(NullPointerException e) { //처리하는 예외의 종류가 NullPointerException임(얘밖에 처리못함)
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace(); 
			//printStackTrace();는 자바(Java)에서 예외(Exception)가 발생했을 때, 
			//예외가 어디서 발생했는지를 추적할 수 있도록 **스택 트레이스(Stack Trace)**를 출력해주는 메서드입니다.
		} finally { //예외 발생 여부와 관계없이 항상 실행되는 블록
			System.out.println("[마무리 실행]\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}


