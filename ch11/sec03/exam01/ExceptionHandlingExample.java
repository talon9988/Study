package ch11.sec03.exam01;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100", "1oo"};
		
		for(int i=0; i<=array.length; i++) {		
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch(ArrayIndexOutOfBoundsException e) { //받을 에러 종류
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage()); //i<=array.lengt
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
			}
		}
	}
}
