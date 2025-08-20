package ch05.sec10;

import ch05.sec05.LengthExample;

public class AdvancedForExample_prac2 {
	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0, cnt = 0;
		for (int[] tmp : array) { // 진회된 포문
			cnt += tmp.length; // tmp에는 array[0]이 저장됨
			for (int tmp2 : tmp) { // tmp2에는 tmp[0]이 저장됨
				sum += tmp2;
			}

		}
		System.out.println("cnt " + cnt);
		System.out.println("sum " + sum);

		double avg = (double) sum / cnt; // 먼저 형변환을 한 다음 나누기해야 정확한 값이 나옴
		System.out.println("avg " + avg);

	}
}
