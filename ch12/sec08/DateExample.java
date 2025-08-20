package ch12.sec08;

import java.text.*;
import java.util.*;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();		
		System.out.println(strNow1);
		
		//심플 데이트 포멧: 데이트 객체를 인자로 받아서 데이트 출력 형식을 바꿈
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}

