package ch06.sec10.exam02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;

	static { //전부다 스태틱 멤버-스태틱 멤버 묶음, 그리고 전부 문자열형임
		info = company + "-" + model;
	}
}
