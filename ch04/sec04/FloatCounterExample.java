package ch04.sec04;

public class FloatCounterExample {
	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x); //소수점 이하는 언제나 계산이 부정확하다
		}
	}
}
