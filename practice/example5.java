package practice;
//140페이지 문제 5번
public class example5 {

	public static void main(String[] args) {
		int sum = 0;
		for(int x = 1; x <= 10;x++) {
			for(int y = 1; y <= 10;y++) {
				if(4 * x + 5 * y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
		
	}

}
