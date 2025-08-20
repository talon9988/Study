package homework;

public class Depart extends Employee {

    //코드작성
	
	String dept;
	Depart(String name, int salary, String dept){
		super(name, salary);
		this.dept = dept;
	}
	
	public void getInformation() {
        System.out.println("이름:" + getName() + " 연봉:" + getSalary() + " 부서:" + dept); //부모메서드를 사용
        //이름하고 연봉은 부모클래스에서 작업 후 여기서 호출
    }
}
