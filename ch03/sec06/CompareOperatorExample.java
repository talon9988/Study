package ch03.sec06;

import java.util.Scanner;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); 
		boolean result2 = (num1 != num2); 
		boolean result3 = (num1 <= num2);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);   //65 < 66
		System.out.println("result4: " + result4);		
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("result5: " + result5); //true
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float)num6);
		System.out.println("result6: " + result6); //플로트가 더블보다 범위가 짧기 때문에 소수점 자리가 달라지면서 값도 달라짐
		System.out.println("result7: " + result7);
		
		String str1 = "자바"; //new String
		String str2 = "자바"; //값이 같아지면 str1과 str2가 주소값이 같아짐. str1주소 = str2주소**
		
		/*String str1 = new String("자바"); //new String
		String str2 = new String("자바"); //new String*/
		//값이 같아도 각각 새 주소가 생성됨(new)
		boolean result8 = (str1.equals(str2)); //.equals(): 객체간의 값을 비교함
		boolean result9 = (! str1.equals(str2));
		boolean result10 = (str1 == str2); // ==: 객체간의 주소를 비교함 (**주의)
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
		System.out.println("result10: " + result10);
		// Scanner scanner = new Scanner(System.in); //문자열 객체의 주소를 할당함(c의 string 문자열 포인터와 비슷함)
	}
}



