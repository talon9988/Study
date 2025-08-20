package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x; //제 3의 그릇에 임시저장
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}
}
