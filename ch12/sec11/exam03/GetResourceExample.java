package ch12.sec11.exam03;

public class GetResourceExample {
	public static void main(String[] args) {
		Class clazz = Car.class;
		//둘 다 수업자료에 있는 것들
		//리소스 - 파일이라는 뜻
		String photo1Path = clazz.getResource("photo1.jpg").getPath(); //"photo1.jpg"의 경로
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath(); //이미지 파일의 "photo2.jpg"의 경로
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}
//척추측만증, 거북목, 기린목, 경추디스크, ㅇㅏ라겨쟈인룽ㄴㅍㅣ