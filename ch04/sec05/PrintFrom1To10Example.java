package ch04.sec05;

public class PrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while (i<=10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		for(i = 1; i <= 10;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		}while (i<=10);
		
	}
} 
//ctrl+/ : 주석단축키
