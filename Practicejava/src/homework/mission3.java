package homework;

public class mission3 {

	public static void main(String[] args) {
		String[] arr = {"강승현", "권상윤", "권순빈", "김려명", "김성준", "김세빈", "김승연", "김영식", "김예진", "김지선",
	            "김지원", "남현희", "도원규", "문정현", "박근정", "박신혜", "박예진", "사준기", "원정연", "유수종",
	            "윤예슬", "이슬우", "장연우", "정시헌", "정재훈", "조남윤", "조민진", "최지원", "한주형", "허성준", "홍효원"};
		String cnt[] = new String[arr.length];
		int rand = 0;
		int i, j;
		boolean trigger = false;
		int row = 0;
		//System.out.println(arr.length);
		/*for(int k = 0; k < 6 ;k++) {
			System.out.print(" " + (k + 1) + "조\t");
		}*/
		//System.out.println();
		for (i = 0; i < arr.length;) {
			//0~30까지의 숫자 반환
			rand = (int)(Math.random() * arr.length); //인덱스 넘버임. 그래서 0부터 30까지만 나오게 해야됨
			
			for (j = 0; j < i; j++) {
				if (cnt[j].equals(arr[rand])) { //중복된 인덱스 넘버 검사
					trigger = true;
					break;
				}
			}
			if (!trigger) { //false일때
				
				cnt[i] = arr[rand];
				//System.out.print(cnt[i] + "\t");
				i++;
			}
			
			trigger = false; 
			
		}
		
		int r = 0;
		String raar[][] = new String[6][];
		for (int k = 0; k < 6; k++) {
			if(k == 5) 
				raar[k] = new String[6];
			else
				raar[k] = new String[5];
			for(int y = 0; y < raar[k].length;y++) {
				raar[k][y] = cnt[r];
				r++;
			}
		
		}
		
		for (int k = 0; k < 6; k++) {
			System.out.print((k + 1) + "조 ");
			for(int y = 0; y < raar[k].length;y++) {
				System.out.print(raar[k][y] + " ");
			}
			System.out.println();
		}
		
	}

} // 숙제: 숙제 제출 링크 https://forms.gle/vFC1cDHM21bdvqLs7