package ch12.sec08;

import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs(); //모든 타임존을 불러와서 배열에 넣음
		for(String id : availableIDs) {
			System.out.println(id);
		}
	}
}

