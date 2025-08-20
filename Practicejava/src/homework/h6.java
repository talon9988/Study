package homework;

public class h6 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		int rand = 0;
		int i, j;
		boolean trigger = false;
		for (i = 0; i < arr.length;) {
			rand = (int)(Math.random() * 45) + 1;
			for (j = 0; j < i; j++) {
				if (arr[j] == rand) {
					trigger = true;
					break;
				}
			}
			if (!trigger) { //false일때
				arr[i] = rand;
				i++;
			}
			trigger = false; 
		}

		for (int lottery:arr) {
			System.out.print(lottery + " ");

		}
		
	}

} // 숙제: 숙제 제출 링크 https://forms.gle/vFC1cDHM21bdvqLs7