package homework;
import java.util.Scanner;
public class h1 {
	//문자로 숫자 받은다음 인티저.파스인트로 문자를 숫자로 변환
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randnum;
		boolean c = true;

		String num, ans;
		while(true) {
			System.out.println("=========================");
			System.out.println("    [숫자 맞추기 게임 시작]");
			System.out.println("=========================");
			System.out.print(">>");
			randnum = (int)(Math.random() * 100 + 1); 	
			//Math.random(): 0.0 ~ 0.99999... 까지의 실수 반환 (까먹지 말기)
			//System.out.println("족보: " + randnum);
			while(true) {
				num = sc.nextLine();
				if(Integer.parseInt(num) > randnum) {
					System.out.print("더 낮게\n>>");
					} else if(Integer.parseInt(num) < randnum) {
					System.out.print("더 높게\n>>");
					} else {
						System.out.println("정답입니다.");
						break;
					}
				}
			while(true) {
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				ans = sc.nextLine();
				if("y".equals(ans)) {
					System.out.printf("=========================\n    숫자맞추기 게임 종료\n=========================");
					c = false;
					break;
				} 
				else if("n".equals(ans)) {
					break;
				}
				else if(!("n".equals(ans)) && !("y".equals(ans))) {
					System.out.println("장난치지 마세요");
				}
			}
			if(c == false) break;
		}
	}

}
