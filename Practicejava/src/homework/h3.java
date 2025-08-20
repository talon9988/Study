package homework;
import java.util.Scanner;
public class h3 {
	//문자로 숫자 받은다음 인티저.파스인트로 문자를 숫자로 변환
	public static void main(String[] args) {
		//5개의 숫자를 키보드로 입력받아 구하는 프로그램을 작성
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		double avg = 0;
		int sum = 0;
		System.out.println("input5");
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		};
		avg = (double)sum / arr.length;
		System.out.println("avg: " + avg);
	}
}