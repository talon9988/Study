package ch04.sec04;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		
		for (int m=2; m<=9; m++) {
			System.out.print("*** " + m + "단 ***\t");
		}
		System.out.println();
		for (int m=1; m<=9; m++) {
			
			for (int n=2; n<=9; n++) {
				
				System.out.print(n + " x " + m + " = " + (m*n) + "\t");
				
			} 
			System.out.println();
			
		}
	}
}

//>U<