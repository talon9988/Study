package ch13.sec05;

public class Applicant<T> {
	public T kind;
	
	public Applicant(T kind) {
		this.kind = kind; //객체 타입을 받음
	}
}

