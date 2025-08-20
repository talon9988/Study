package practice;

import java.util.Scanner;

//140페이지 문제 7번
public class example7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int cash = 0;
		int minus = 0;
		int total = 0;
while(true) {
			
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			String input = scanner.nextLine();
		//c랑 똑같이 정수입력과 문자입력등 여러 자료형을 입력 받으면 엉뚱한 값이 변수에 저장될 수 있다.
		//그래서 c의 gerchar();같이 잉여동작을 받아줄 문장을 써야됨
			if(input.equals("1")) {
				System.out.print("예금액>");
				cash = scanner.nextInt();
				//System.out.println(cash + "\n");
				total += cash;
			}
			else if(input.equals("2")) {
				System.out.println("출금액>");
				minus = scanner.nextInt();
				//System.out.println(minus + "\n");
				total -= minus;
			}
			else if(input.equals("3")) { 
				System.out.println("잔고>" + total + "\n");
			}
			else if(input.equals("4")){
				break;
			}
		}
			System.out.println("\n프로그램 종료");
	}
}

