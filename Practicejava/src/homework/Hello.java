package homework;

public class Hello {
	String text = "";
	//안녕하세요 세일즈포스 CRM101 4
	Hello(String s){ //클래스랑 생성자랑 이름 똑같아도됨
		text = s;
		// arr[] = text.split(""); //생성자가 호출이 되야 원하는 값으로 초기화가 되므로 메서드나 생성자 안에서 이걸 초기화 해야됨
	}
	
	void pritntText() {	
		for(int i = 0; i < text.length();i++) {
				System.out.println(text.substring(i, i + 1));	
			
		}
		/*String arr[] = text.split(""); //생성자가 호출이 되야 원하는 값으로 초기화가 되므로 메서드나 생성자 안에서 이걸 초기화 해야됨
		for(String i:arr) {
			System.out.println(arr[i]);
		}*/
		/*for(int i = 0; i < text.length();i++) {
			System.out.println(text.charAt(i)); 
		}*/
		return;
	}
}
