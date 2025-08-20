package practice;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		
		
		if(n % 2 == 0) {
			for(int i = 1; i <= n;i++) {
				if(i % 2 == 0) {
				sum += i;
				}
			}
		} 
		else {
			for(int i = 1; i <= n;i++) {
				if(i % 2 != 0) {
				sum += i;
				}
			}
			
		}System.out.println("결과값: " + sum);
		
	}
	
}
