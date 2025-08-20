package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) throws Exception { //throws Exception : 예외처리할 때 필요한 메서드
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.print(i + " "); //짝수만 출력
		}
		System.out.println();
		for(int i=2; i<=10; i +=2) {
			System.out.print(i + " "); //짝수만 출력
		}
	}
}

