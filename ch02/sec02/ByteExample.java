package ch02.sec02;

public class ByteExample {
	public static void main(String[] args) {
		byte var1 = -128; //바이트 연산자는 -128 ~ 127까지의 정수임
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128;  //컴파일 에러(Type mismatch: cannot covert from int to byte) >범위 초과
		//그리고 byte는 int보다 작은 범위이므로 int > byte로 자동 형변환이 안됨
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	} 
}

