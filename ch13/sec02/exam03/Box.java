package ch13.sec02.exam03;

public class Box<T> {
	public T content;
	
	//Box의 내용물이 같은지 비교
	public boolean compare(Box<T> other) {
		//System.out.println( other.content +","+ content);
		boolean result = content.equals(other.content); //box1의 content와 box2의 content를 비교
		return result;
	}
}
