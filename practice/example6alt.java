package practice;
//140페이지 문제 6번
public class example6alt {

	public static void main(String[] args) {
		int sum = 0;
		for(int x = 0; x < 5;x++) {
			for(int z = (5 - x - 1); z >0;z--) {
				
				System.out.print(" ");
			}
			for(int y = 1; y <= 2 * (x + 1) - 1;y++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
