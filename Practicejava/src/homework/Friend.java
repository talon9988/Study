package homework;

public class Friend {
	private String name;
	private String phone;
	private String email;
	
	public Friend() {
	}

	public Friend(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void printList () {
		System.out.printf("이름: %s 핸드폰: %s 이메일: %s\n", this.name, this.phone, this.email);
		
	}
	public void fix(String fPhone, String fEmail) {
		if(!("".equals(fPhone)))
			this.setPhone(fPhone);
		if(!("".equals(fEmail)))
			this.setEmail(fEmail);
	}
	
}
