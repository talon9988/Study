package practice;

import java.util.Scanner;

public class problem4option {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		
		/*for(int i = 1; i <= n;i++) { 
		if(n % 2 == 0 && i % 2 == 0) {
				sum += i;
			}
		else if (n % 2 != 0 && i % 2 != 0){
				sum += i;
			}
		}*/
		
		if(n % 2 ==1) {
			for (int i =1;i<=n; i+=2) {
				sum +=i;
			}
		} else{
			for (int i =0;i<=n; i+=2) {
				sum +=i;
			}
		}
		
		System.out.println("결과값: " + sum);
		
	}

}
