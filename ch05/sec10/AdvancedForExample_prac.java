package ch05.sec10;

import ch05.sec05.LengthExample;

public class AdvancedForExample_prac {
	public static void main(String[] args) {
		int[] num = {1,5,3,8,2};
		int max = 0;
		int i = 0;
		for(int tmp: num) { //진회된 포문
			
			if(max < tmp) {
				max = tmp;
				
			}
			System.out.println(i + "번째는: " + tmp);
			i++;
			
		}
		System.out.println(max + "인데요");
		
		for(int j = 0; j < num.length; j++) {
			System.out.println(j + "번째는: " + num[j]);
			
		}
	}
}

