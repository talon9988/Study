package homework;
//업그레이드 버전
public class Account2 {
	public static final int MIN_BALANCE = 0;
	  public static final int MAX_BALANCE = 1000000;
	  private String accNum;
	  private String name;
	  private int balance;

	  public String getaccNum() {
		    return this.accNum;
		  }
	  public String getname() {
		    return this.name;
		  }
	  public int getBalance() {
	    return balance;
	  }
	  //보이드로 선언 주의
	  public void setAccNum(String accNum) {
		    
		    this.accNum = accNum;
		   
		  }
	  public void setName(String name) {
		    
		    this.name = name;
		
		  }
	  public void setBalance(int balance) {
	    if (balance < Account2.MIN_BALANCE || balance > Account2.MAX_BALANCE) {
	      return;
	    }
	    this.balance = balance;
	  
	  }
	  public void deposit(int amount) {
		  if(amount <= 0) {
			  return;
		  }
		  else if(this.balance + amount > Account.MAX_BALANCE) {
			  return;
		  }
		  else {
			  this.balance += amount;
		  }
	  }
	  
	  public int withdraw (int amount) {
		  if(balance >= amount) {
			  balance -= amount;
			  return amount;
		  }
		  else return 0;
	  }
	  
}

