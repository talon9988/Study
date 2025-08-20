package ch13.sec05;

public class Course {
	//<?>: 모든 사람이면 등록 가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + 
								"이(가) Course1을 등록함");
 	}
	
	//<? extends Student>: 학생만 등록 가능 - 스튜던트, 스튜던트에 익스텐드 되있는 놈들만 가능(스튜던트의 자식클래스들만 가능)
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + 
								"이(가) Course2를 등록함");
 	}
	
	//<? super Worker>: Worker 클래스거나 워커 클래스의 조상 클래스만 허용한다.
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + 
								"이(가) Course3을 등록함");
	}
}
