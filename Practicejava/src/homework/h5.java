package homework;
import java.util.Scanner;
public class h5 {
	//문자로 숫자 받은다음 인티저.파스인트로 문자를 숫자로 변환
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("돈");
		int mon = sc.nextInt();
		int[] cash = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int y = mon, x = mon;
		/*for(int i = 0; i < cash.length;i++) {
			System.out.println(cash[i] + "원: " + mon / cash[i] + "개");
			mon %= cash[i];
		}*/
		
		for(int i:cash) {
			System.out.println(i + "원: " + mon / i + "개");
			mon %= i;
		}
		
	}
	
} //숙제: 숙제 제출 링크 https://forms.gle/vFC1cDHM21bdvqLs7