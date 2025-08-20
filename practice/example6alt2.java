package practice;

import java.util.Scanner;

//140페이지 문제 6번
public class example6alt2 {

	public static void main(String[] args) {
		int sum = 0;
		 System.out.print("input: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int x = 0; x < n;x++) {
			
			for(int y = 1; y <= x + 1;y++) {
				
				System.out.print(x + 1);
			}
			System.out.println();
		}
		
	}

}
