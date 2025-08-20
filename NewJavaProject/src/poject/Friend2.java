package poject;
public class Friend2 {
    private String name; //필드
    private String hp;
    private String school;
    //필요한 메소드 작성
    
    public Friend2() { //생성자
	}
	public Friend2(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}
    
	public String getName() { //메서드
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void sethp(String hp) {
		this.hp = hp;	
	}
	public void setschool(String school) {	
		this.school = school;
	}
	
	public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }
	

}
