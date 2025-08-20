package ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		int[] intArray = null;
		//int[] intArray = new int[10];
		//intArray[0] = 10;	 //NullPointerException
//이 배열은 new로 선언한적 없음 -> 객체할당 안됨
		String str = null;
		System.out.println("총 문자수: " + str.length() );	  //NullPointerException
		//str은 널이므로 글자수를 출력할 수 없다
	}
}




