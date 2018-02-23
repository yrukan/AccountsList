package by.htp.model;

public class DepositAccount extends Account{

	private static String accType = "Депозит";
	
	public DepositAccount(){
		this.setAccountType(accType);
	}
	
	public DepositAccount(int amount){
		super(amount);
		this.setAccountType(accType);
	}
	
	public static void printAccountInfo() {
		printInfo();
		System.out.println(accType);
	}
	
	@Override
	public void printAccount(){
		printAccountInfo();
		this.printAccountStateInfo();		
	}
	
		
}
