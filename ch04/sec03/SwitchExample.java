package ch04.sec03;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break; //브레이크가 없으면 쓸데없는 케이스까지 다 실현되어서 이상한 값들도 출력됨
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다."); //위의 조건문에 해당되는게 하나도 없으면 디폴트문 수행하고 스위치문 탈출
		}
	} //졸려잉
}

