package ch05.sec05;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바"); //값은 0 -> 시작점
		if(location != -1) { //위치가 잘 잡혔는지 확인
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		String ch = subject.substring(0, 6);
		System.out.println(ch);
		System.out.println(subject); //잘라냈다고 해도 원본은 안바뀜
	}
}

