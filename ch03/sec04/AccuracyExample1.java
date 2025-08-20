package ch03.sec04;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		//double pieceUnit = 0.1;
		int totalpieces = apple * 10;
		int number = 7;
		
		double result = totalpieces - number;
		System.out.println("사과 1개에서 남은 양: " + result / 10); //0.3이 아닌 이유: 컴퓨터문제-소수점 아래의 자리수가 정확하지 않음
		System.out.println("사과 1개에서 남은 조각: " + result);
	}
}


