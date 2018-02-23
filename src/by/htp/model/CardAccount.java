package by.htp.model;

public class CardAccount extends Account{

	private Card card;
	private String accType = "Карт-счет";
	
	public CardAccount(){
		super();
		this.setAccountType(accType);
		this.card = new Card();	
	}
	
	public CardAccount(int amount, String cardType){
		super(amount);
		this.setAccountType(accType);
		this.card = new Card(cardType);	
	}
	
	public static void setAccountType() {
		
	}
	
	public Card getCard(){
		return this.card;
	}
	
	@Override
	public void blockAccount(){
		this.setAccountState(false);
		this.card.setCardState(false);
		
	}
	
	@Override
	public void unblockAccount(){
		this.setAccountState(true);
		this.card.setCardState(true);
		
	}
	
	public void printAccountInfo() {
		printInfo();
		System.out.println(accType);
	}
	
	public void printAccountInfo(String accType) {
		printInfo();
		System.out.println(accType);
	}
	
	public void printCardAccount(){
		this.printAccountStateInfo();
		this.getCard().printCardInfo();		
	}
	
	@Override
	public void printAccount(){
		printAccountInfo();
		printCardAccount();
	}
	
	public void printAccount(String accType){
		printAccountInfo(accType);
		printCardAccount();
	}
	
}