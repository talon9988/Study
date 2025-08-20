package practice;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int i;
		int num;
		int max = -99999;
		int c = 0;
		System.out.println("숫자를 입력하세요");
		for(i = 0; i < 5;i++) { //반복할 횟수가 정해져있을때는 for문을 많이 씀
			System.out.print("숫자: ");
			num = scanner.nextInt();
			if(c == 0) {
				max = num;                                                                                                                                                           
				c += 1;
			}
			if(num > max) {
				max = num;
			}
		}
		System.out.println("최대값은 " + max + "입니다.");

	}

}
