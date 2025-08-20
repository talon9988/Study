package ch05.sec06;
import java.util.Scanner;
public class ArrayLengthExample {
	public static void main(String[] args) {
		//배열 변수 선언과 배열 대입
		
		Scanner scanner = new Scanner(System.in);
		int[] scores = new int[3];
		
		//배열 항목의 총합 구하기
		int sum = 0;
		System.out.println("점수를 입력하세요.");
		for(int i=0; i<scores.length; i++) {
			scores[i] = scanner.nextInt();
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		//배열 항목의 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}


