package poject;

public class Member {
	private String id; //회원아이디
	private String name; //회원명
	private int point; //포인트
	
	//생성자: 우클릭 > 소스 > generate constructor using fields > 필드 모두선택한거 하나, 모두 해제한거 하나 창조
	public Member(String id, String name, int point) {
		
		this.id = id;
		this.name = name;
		this.point = point;
	}
	public Member() {
		
	}
	
	//게터, 세터: 우클릭 > 소스 > generate getter and setter > 필드 모두 선택후 generate
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
