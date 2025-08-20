package ch04.sec02;

public class IfExample {
	public static void main(String[] args) {
		int score = 83;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score < 90)//중괄호가 없음
			System.out.println("점수가 90보다 작습니다."); // 조건문을 한줄만 쓸 때는 중괄호 안써도 됨
			System.out.println("등급은 B 입니다."); //이건 if문 밖에 쓴걸로 간주되어 무조건 출력됨
		
	}
}
//ctrl+shift+f누르면 줄맟춤이 자동으로 됨
