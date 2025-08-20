package ch05.sec05;

public class stringEx {

	public static void main(String[] args) {
		String name1 = "toto program"; //내용이 같으므로 같은 주소값을 갖게된다. 같은 객체임
		String name2 = "toto";
		System.out.println(name1.charAt(3)); //인덱스3의 문자를 출력
		System.out.println(name1.length()); //길이 출력
		System.out.println(name1.hashCode()); //주소값을 출력
		System.out.println(name2.hashCode());
		String name3 = new String("홍길동"); //new로 선언해서 주소가 다르지만
		String name4 = new String("홍길동");
		System.out.println(name3.hashCode()); //같은 주소값을 출력. 효율성 때문인듯
		System.out.println(name4.hashCode());
		
		
	}

}
