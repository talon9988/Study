package homework;

public class Account {
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
	    if (balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
	      return;
	    }
	    this.balance = balance;
	  
	  }
	  
}
