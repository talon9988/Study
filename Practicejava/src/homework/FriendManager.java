package homework;

import java.util.Scanner;

public class FriendManager {
	public static void main(String[] args) {
		/*int arr[];
		arr = new int[3];*/
		Boolean trigger = true;
		Friend[] addFriend = new Friend[10];		
		Scanner sc = new Scanner(System.in);	
		int cnt = 0;		
		while (trigger == true) {
			addFriend[cnt] = new Friend();
			System.out.println("----------------------");
			System.out.println("1.추가 2.목록 3.수정 4.종료");
			System.out.println("----------------------");
			System.out.print("선택>");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				System.out.print("이름: ");
				String name = sc.nextLine();
				addFriend[cnt].setName(name);

				System.out.print("전화번호: ");
				String phone = sc.nextLine();
				addFriend[cnt].setPhone(phone);

				System.out.print("이메일: ");
				String email = sc.nextLine();
				addFriend[cnt].setEmail(email);
				cnt++;
				break;
				
			case "2":
				for (int i = 0; i < cnt; i++) {
					addFriend[i].printList();
				}
				break;
				
			case "3":
				System.out.print("이름: ");
				String NameforFix = sc.nextLine();
				String fixPhone;
				String fixEmail;
				boolean t = false;
				for (int i = 0; i < cnt; i++) {
					if (addFriend[i].getName().equals(NameforFix)) {
						t = true;
						System.out.print("전화번호: ");
						fixPhone = sc.nextLine();
						System.out.print("이메일: ");
						fixEmail = sc.nextLine();
						addFriend[i].fix(fixPhone, fixEmail);
						break;
					}
				}
				if (t == false)
					System.out.println("그런 이름의 친구는 없습니다");
				break;
			default:
				System.out.println("종료");
				trigger = false;
				break;

			}
		}

	}
}
