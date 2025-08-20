package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {
	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles"); //미국 로스엔젤리스의 타임존을 얻음
		Calendar now = Calendar.getInstance( timeZone ); //타임존에 맞는 지역의 현재날짜와 시간을 가져옴
		//"America/Los_Angeles"는 **미국 로스앤젤레스 시간대 (PST/PDT)**를 의미합니다.
		//이 코드를 통해 해당 지역의 시간대 정보를 담은 TimeZone 객체를 가져옵니다.
		int amPm  = now.get(Calendar.AM_PM);   
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}		
		int hour    = now.get(Calendar.HOUR);                 
		int minute  = now.get(Calendar.MINUTE);             
		int second  = now.get(Calendar.SECOND);        
		
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
	}
}
