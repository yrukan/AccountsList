package by.htp.model;

public class CreditAccount extends CardAccount{

	private Overdraft overdraft;
	private String accType = "ׁקוע ס מגונהנאפעמל";
		
	public CreditAccount(){
		super();		
		this.setAccountType(accType);
		this.overdraft = new Overdraft();	
	}
	
	public CreditAccount(int amount, String cardType, int overdraftLimit){
		super(amount, cardType);
		this.setAccountType(accType);
		this.overdraft = new Overdraft(overdraftLimit);	
	}
	
	public Overdraft getOverdraft(){
		return this.overdraft;
	}
	
	@Override
	public void blockAccount(){
		super.blockAccount();
		this.overdraft.setOverdraftState(false);
		
	}
	
	@Override
	public void unblockAccount(){
		super.unblockAccount();
		this.overdraft.setOverdraftState(true);
		
	}
	
	public void printAccountInfo() {
		printInfo();
		System.out.println(accType);
	}
	
	@Override
	public void printAccount(){
		super.printAccount(accType);
		this.overdraft.printOverdraftInfo();
	}
	
	
}
