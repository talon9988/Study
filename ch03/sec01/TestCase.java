package ch03.sec01;

public class TestCase {

	public static void main(String[] args) {
		int a = 0; // 나눗셈 할 때 0 있으면 안됨. 실행할 수 있는 오류임 Infinity에러.
		int b = 5; 
		double result = (double)b / a; //정수 연산 수행 후 실수 변수에 저장되므로,정확한 계산을 위해 a나 b 둘중 하나를 형변환 해야됨
		System.out.println("result: " + result);

	}

}
