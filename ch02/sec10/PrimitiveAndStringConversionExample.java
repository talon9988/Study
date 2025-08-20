package ch02.sec10;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10"); //문자열이 정수 10이 됨
		double value2 = Double.parseDouble("3.14"); //문자열이 실수형이 됨
		boolean value3 = Boolean.parseBoolean("true"); //문자열이 불리언이됨
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		//String str1 = String.valueOf(10); //int값이 문자열 "10"이 됨 
		String str1 = value1 + ""; //다른 방법
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);		
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}
}
