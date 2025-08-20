package ch02.sec09;

public class StringConcatExample {
	public static void main(String[] args) {
		//숫자 연산
		String result1 = 10 + 2 + 8 + ""; //int를 String으로 바꾸면 오류남: Stirng은 강제형변환이 일어나지 않음
		System.out.println("result1: " + result1);
		
		//결합 연산
		String result2 = 10 + 2 + "8"; //Sistem.out.print("12" + "8") 문자열 끼리 이어붙이기가됨, 12는 문자열이 됨
		//12 + "8" > "12" + "8"
		System.out.println("result2: " + result2);
		
		String result3 = 10 + "2" + 8; // "10" + "2" + "8" 문자열과 결합되는 것들은 문자열로 바뀜
		//"10" +"2" + 8 > "102" + 8 > "102" + "8"
		System.out.println("result3: " + result3);
		
		String result4 = "10" + 2 + 8; //"10" + "2" + "8" 
		//"10" + "2" + 8 > "10" +"2" + "8"
		System.out.println("result4: " + result4);
		
		String result5 = "10" + (2 + 8); //문자열 10과 정수 10이 결합됨
		//"10" + 10 > "10" + "10"
		System.out.println("result5: " + result5);
		String a = "Hello,";
		String b = "\"Java\"";
		System.out.println(a + b);
		
		String str = "10";
		byte temp = Byte.parseByte(str); //Byte.parseByte: 레퍼클래스
		System.out.println(temp + temp); //int 타입으로 바뀜
		System.out.println(String.valueOf(temp + temp)); //int형이 문자열로 바뀜
	}
	
	
}


