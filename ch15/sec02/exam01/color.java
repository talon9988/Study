package ch15.sec02.exam01;
import java.util.ArrayList;
public class color {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("빨");
		list.add("주");
		list.add("노");
		list.add("초");
		list.add("파");
		list.add("보");
		
		list.add(5, "남");
		System.out.println(list);
	}
}
