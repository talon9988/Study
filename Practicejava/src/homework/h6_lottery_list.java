package homework;

import java.util.ArrayList;

public class h6_lottery_list {

	public static void main(String[] args) {
		//int cnt = 0;
		ArrayList<Integer> lottery = new ArrayList<>();
		
		while(true) {
			
			if(lottery.size() >= 6) {
				break;
			}
			int num = (int)(Math.random() * 6) + 1;
			if(!lottery.contains(num)) { //()의 값이 리스트에 포함되어있으면 참을 반환
				lottery.add(num); //중복제거(기존에 있는 숫자면 리스트에안넣음)
			}
		}
		
		System.out.println(lottery);
	}

} // 숙제: 숙제 제출 링크 https://forms.gle/vFC1cDHM21bdvqLs7