package ch02.sec04;

public class FloatDoubleExample {
	public static void main(String[] args) {		
		//정밀도 확인
		float var1 = 0.1234567890123456789f; //f붙여야 함, 대문자 소문자 안가림
		double var2 = 0.1234567890123456789;
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
		//10의 거듭제곱 리터럴
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3; //2e = 2/1000
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4); 
		System.out.println("var5: " + var5);
	} 
}


