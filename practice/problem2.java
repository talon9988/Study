package practice;
import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10;i++) { //반복할 횟수가 정해져있을때는 for문을 많이 씀
			/*for(int j = 1; j <= 10;j++) {
				System.out.print((j + i) + "\t");
			}*/
			for(int j = 1 + i; j <= 10 + i;j++) { //other option
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}
