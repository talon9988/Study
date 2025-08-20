package ch06.sec10.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator c = new Calculator(); //스태틱으로 선언해서 객체를 만들지 않고도 쓸 수 있다
		double result1 = 10 * 10 * Calculator.pi; //314.159 //스태틱 멤버 사용법
		int result2 = Calculator.plus(10, 5); //15 //정적(스태틱)멤버는 글씨체가 다르다.
		int result3 = Calculator.minus(10, 5); //5
		int parc = Integer.parseInt("33");
		
		double result4 = Calculator.pi; //3.14
		System.out.println(result4);
		//Calculator.pi = 99.99; //클래스 멤버변수에 final을 선언하면 업데이트가 불가능함
		double result5 = Calculator.pi; //파이널 없으면99.99
		System.out.println(result5); //파이널 없으면 스태틱 멤버값 변환 
		

		System.out.println("result1 : " + result1); //값 변환되기 전에 값 초기화 했으므로 
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
