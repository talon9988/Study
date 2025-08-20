package poject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FriendManager_list {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Friend> members = new ArrayList<>(); //타입이 프렌드 클래스임
		
		System.out.println("친구를 3명 등록해 주세요.");		
		for (int i = 0; i < 3; i++) {

			String info = sc.nextLine();
			String s_info[] = info.split(" ");
			
			members.add(new Friend(s_info[0], s_info[1], s_info[2])); 
			
		}
		for (Friend i: members) { //어레이 리스트는 향상된 포문을 쓰도록 합시다!
			i.showInfo();
			
		}
		System.out.println(members); 

	}
}
