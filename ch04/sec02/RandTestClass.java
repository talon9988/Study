package ch04.sec02;

public class RandTestClass {

	public static void main(String[] args) {
		int d = (int)(Math.random() * 6) + 1; //0부터 n-1까지의 수 + 1
		
		System.out.println("난수: " + d);

	}

}
