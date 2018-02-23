package by.htp.model;

public abstract class Account implements AccountActions{

	private String accountType;
	private int accountAmount;
	private boolean accountState;
		
	public Account(){
		
	}
	
	public Account(int amount){
		this.accountAmount = amount;
		this.accountState = true;
	}
	
	public void setAccountType(String type){
		this.accountType = type;
	}
	
	public void setAccountAmount(int amount){
		this.accountAmount = amount;
	}
	
	public void setAccountState(boolean state){
		this.accountState = state;
	}	
	
	public String getAccountType(){
		return accountType;
	}
	
	public int getAccountAmount(){
		return this.accountAmount;
	}
	
	public boolean getAccountState(){
		return this.accountState;
	}
	
	public void blockAccount(){
		this.accountState = false;
	}
	
	public void unblockAccount(){
		this.accountState = true;
	}
	
	public String stringAccountState(){
		String str;
		if(this.accountState == true)
			str = "активен";
		else
			str = "заблокирован";
		return str;
	}
	
	public static void printInfo() {
		System.out.println("-----------------------------------------------");
	}
	
	public void printAccountStateInfo(){
		System.out.println("Остаток счета: " + this.getAccountAmount());
		System.out.println("Состояние счета: " + this.stringAccountState());
	}
		
}