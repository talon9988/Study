package ch02.sec06;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name); //println 은 알아서 개행이 됨
		System.out.println(job);

		String str = "나는 \"자바\"를 배웁니다..";
		System.out.println(str);

		str = "번호\t이름\t직업 "; //탭은 그 자체로 한 글자다
		System.out.println(str);
		
		System.out.print("나는\n"); //print는 개행이 안됨
		System.out.print("자바를\n"); 
		System.out.print("배웁니다.");
	}
}
