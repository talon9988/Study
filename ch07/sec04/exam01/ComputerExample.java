package ch07.sec04.exam01; //메소드 오버라이딩

public class ComputerExample {
	public static void main(String[] args) {		
		int r = 10;		//반지름

		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));		
		System.out.println();		

		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r)); //부모것 실행X, 자식것 실행됨
	}
}
