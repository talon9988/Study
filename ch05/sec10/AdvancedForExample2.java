package ch05.sec10;

public class AdvancedForExample2 {
	public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		int[] scores = { 1,5,3,8,2 };
		//배열 항목 전체 합 구하기
		int max = 0; 
		for (int score : scores) { //score변수에다 배열 객체의 값들을 하나씩 집어넣음
			if(max < score)
				max = score;
		}
		System.out.println(max);
	}
}

