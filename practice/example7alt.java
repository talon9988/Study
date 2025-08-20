package practice;

import java.util.Scanner;

//140페이지 문제 7번
public class example7alt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int cash = 0;
		int minus = 0;
		int total = 0;
		String temp = ""; //문자열을 받아서 숫자로 바꿀 때 쓰는 용
while(true) {
			
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			temp = scanner.nextLine();
		
			if("1".equals(temp)) { //input.equals("1")로 써도되지만 업계에서는 안씀. input 객체가 비어있을 경우를 대비
				System.out.print("예금액>");
				temp = scanner.nextLine();
				cash = Integer.parseInt(temp); //문자열로 금액을 입력받은 후 숫자로 변형
				//System.out.println(cash + "\n");
				total += cash;
			}
			else if("2".equals(temp)) {
				System.out.println("출금액>");
				temp = scanner.nextLine();
				minus = Integer.parseInt(temp); //문자열로 금액을 입력받은 후 숫자로 변형
				//System.out.println(minus + "\n");
				if(total >= minus) { //통장잔고와 출금하려는 금액 비교
					total -= minus;
				}
				else {
					System.out.println("잔액부족함"); //잔액이 부족한경우
				}
				
//				total -= minus;
//				if(total < 0) {
//					System.out.println("잔액부족함"); //잔액이 부족한경우 other option
//					total += minus;
//				}				
			}
			else if("3".equals(temp)) { 
				System.out.println("잔고>" + total + "\n");
			}
			else if("4".equals(temp)){
				break;
			}
		}
			System.out.println("\n프로그램 종료");
	}
}

