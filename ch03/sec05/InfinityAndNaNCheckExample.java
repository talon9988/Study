package ch03.sec05;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
		//double z = x % y;
		
		//잘못된 코드
		System.out.println(z + 2);	
		
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) { //나눗셈 오류, 나머지 산출 오류
			System.out.println("값 산출 불가"); 
		} else { 
			System.out.println(z + 2); 
		}
	}
}


