package homework;
import java.util.Scanner;
public class h2 {
	//문자로 숫자 받은다음 인티저.파스인트로 문자를 숫자로 변환
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//3의 개수와 그 합을 아래와 같이 출력
		
		int [] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};

		//주어진 배열에서 3의 배수의 개수는?
		//주어진 배열 에서 3의 배수의 합?
		int cnt = 0, sum = 0;
		for(int tmp: data) {
			if(tmp % 3 == 0) {
				cnt++;
				sum += tmp;
			};
		}
		System.out.println("3의 배수 개수 " + cnt);
		System.out.println("3의 배수 합 " + sum);
	}
}