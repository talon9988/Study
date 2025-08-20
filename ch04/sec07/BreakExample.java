package ch04.sec07;

public class BreakExample {
	public static void main(String[] args) throws Exception {
		while(true) {
			int num = (int)(Math.random()*6) + 1; //1부터 6까지의 랜덤정수 반환
			System.out.println(num); //실수형을 정수형으로 형변환 하면 소수점 자리수는 버려짐
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}


