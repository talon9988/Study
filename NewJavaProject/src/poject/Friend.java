package poject;
public class Friend {
    private String name; //필드
    private String hp;
    private String school;
    //필요한 메소드 작성
    
    public Friend() { //생성자
	}
	public Friend(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}
    
	public String getName() { //메서드
		return name;
	}
	public String gethp() { //메서드
		return hp;
	}
	public String getschool() { //메서드
		return name;
	}
	
	public void setter(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}
	
	public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }
	
	@Override
	  public String toString() { 
		//원래 어레이 리스트 클래스에 있던 투 스트링 메서드를 오버라이드함. 
		//어레이리스트의 객체의 주소가 아니라 주소가 가리키는 값을 문자열로 반환 
	    return "이름 : " + name + ", 핸드폰 : " + hp + ", 학교 : " + school;
	  }
	

}
