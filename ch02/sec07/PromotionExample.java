package ch02.sec07;

public class PromotionExample {
	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;  //자동 형변환: 바이트가 int로
		System.out.println("intValue: " + intValue);

		char charValue = '가'; 
		intValue = charValue; //캐릭터보다 int가 더 큼 char>int로 형변환(반대는 안됨)
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue; //int < long
		System.out.println("longValue: " + longValue);	
		
		longValue = 100;
		float floatValue = longValue; //롱 < 플로트
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.52342352342442324F;
		double doubleValue = floatValue; //플로트 < 더블
		System.out.println("doubleValue: " + doubleValue);
		
		floatValue = (float)doubleValue; //>오류남: 플로트가 더블보다 작아서
		//강제 형변환: 사이즈가 큰 변수의 데이터를 작은 변수로 강제 형변환 하면 값이 손실될 수 있다
		System.out.println("floatValue: " + floatValue);
	}
}


