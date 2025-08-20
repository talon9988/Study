package poject;

import java.util.Scanner;

public class PooPoo2 {

	public static void main(String[] args) {
		PooPoo pp = new PooPoo();
		System.out.print("숫자: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i < num;i++) {
			pp.setXYZ(num - i - 1,i * 2 + 1, num - i - 1);
			//System.out.printf("%d %d %d\n", pp.getX(), pp.getY(),pp.getZ());
			pp.build();
		}

	}

}
/*5
 
4 1 4
3 3 3
2 5 2
1 7 1
0 9 0*/