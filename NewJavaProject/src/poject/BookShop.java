package poject;

import java.util.Scanner;

public class BookShop {
	public static void main(String[] args) {
		Book[] books = new Book[10]; // 배열로 뭉탱이로 객체선언 > 메인함수 안에 선언함*
		books[0] = new Book(1, "트와일라잇", "스테파니메이어"); // 생성자 호출
		books[1] = new Book(2, "뉴문", "스테파니메이어");
		books[2] = new Book(3, "이클립스", "스테파니메이어");
		books[3] = new Book(4, "브레이킹던", "스테파니메이어");
		books[4] = new Book(5, "아리랑", "조정래");
		books[5] = new Book(6, "젊은그들", "김동인");
		books[6] = new Book(7, "아프리카 청춘이다", "김난도");
		books[7] = new Book(8, "귀천", "천상병");
		books[8] = new Book(9, "태백산맥", "조정래");
		books[9] = new Book(10, "풀하우스", "원수연");
		
		Scanner scanner = new Scanner(System.in);	
		boolean t = true;
		while (t == true) {
			System.out.println("*****도서 정보 출력하기******");
			displayBookInfo(books); // 메소드로 빼버림 > 그래서 객체를 메인함수 밖의 메소드의 매개변수로 보낼 수 있게 됨**

			System.out.print("대출/반납/종료: ");
			String todo = scanner.nextLine();

			if ("대출".equals(todo)) {
				System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
				String numS = scanner.nextLine(); //대출용 인덱스 변수
				int num = Integer.parseInt(numS);
				if(num == 0) {
					System.out.println("종료");
					break;
				}
				// (1) 입력된 번호에 맞는 책을 찾아 대여 되었음(상태코드=0)을 체크 합니다.
				books[num - 1].rent();
				System.out.println("*****도서 정보 출력하기******");
				displayBookInfo(books);
			} 
			
			else if ("반납".equals(todo)) {
				System.out.print("반납 하고 싶은 책의 번호를 입력하세요:");
				String numString = scanner.nextLine(); //반납용 인덱스변수
				int num = Integer.parseInt(numString);			
				if(num == 0) {
					System.out.println("종료");
					break;
				}
				
				books[num - 1].rent(); //혹은 recover()
				System.out.println("*****도서 정보 출력하기******");
				displayBookInfo(books);
			}
			
			else {
				System.out.println("종료");
				t = false;
			}
		}
		
		scanner.close(); // 스캐너 닫기 문장 마지막에 한번만 수행되도록!!!
	}

	// (2)전달받은 배열을 모두 출력하는 메소드
	private static void displayBookInfo(Book[] books) {
		for (int i = 0; i < 10; i++) {
			books[i].print();
		}
	}
}

//추가 옵션: 반납기능도 만들어 보세요