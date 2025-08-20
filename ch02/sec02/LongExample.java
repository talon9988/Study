package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;		
		long var2 = 20L; //롱값을 쓸러면 L을 붙여야 함		
		//long var3 = 1000000000000;  //컴파일러는 int로 간주하기 때문에 에러 발생시킴(L안붙여서 범위초과 에러남)
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	} 
}




