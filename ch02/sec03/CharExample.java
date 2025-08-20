package ch02.sec03;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';          	//문자 저장
		char c2 = 67;				//아스키코드(유니코드 직접 저장)
		
		char c3 = '가';         	//문자 저장
		char c4 = 44032;      	//유니코드 직접 저장(8 진수)
				
		System.out.println((int)c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}


 