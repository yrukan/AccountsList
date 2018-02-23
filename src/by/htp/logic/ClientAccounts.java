package by.htp.logic;

import by.htp.model.*;

public class ClientAccounts implements PrintAccounts{

	
	private Client client;
	private Account[] accountsList;
	private int accountsCounter;
	private int totalBalance;
	
	public ClientAccounts(){
		
	}
	
    public ClientAccounts(Client client, Account[] accounts){
		this.client = client;
		this.accountsList = accounts;
	}
	
    public void setAccount(Account acc) {
    	this.accountsList[accountsCounter] = acc;
		accountsCounter++;	
    }
    
    public void incAccountsListLength(){
		Account[] newAccList = new Account[this.accountsList.length + 1];
		for(int i=0; i<this.accountsList.length; i++)
			newAccList[i] = this.accountsList[i];    				
		this.accountsList = newAccList;
    }
    
    public void addAccount(Account acc){		  
		if(this.accountsList != null){
    		if(accountsCounter < this.accountsList.length){
    			setAccount(acc);	
    		}else{
    			incAccountsListLength();
    			setAccount(acc);			
       		}
    	}
    	else{
    		this.accountsList = new Account [3];
    		setAccount(acc);
   	    }
}
    
    private void countClientTotalBalance(){
		this.totalBalance = 0;
    	for(int i=0; i < this.accountsCounter; i++) {
			this.totalBalance = this.totalBalance + this.accountsList[i].getAccountAmount();			
		}	
	}
	
	public void printClientTotalBalance(){
		System.out.println("-----------------------------------------------");
		countClientTotalBalance();
		System.out.println("Итоговый баланс по всем счетам клиента: " + this.totalBalance);
	}
	
	public void printAccounts(){
		this.client.printClient();		
		for(int i=0; i<this.accountsCounter; i++)
			this.accountsList[i].printAccount();
	}
	
	public void printAccounts(String accType){
		this.client.printClient();		
		for(int i=0; i<this.accountsCounter; i++)
			if(this.accountsList[i].getAccountType() == accType)
				this.accountsList[i].printAccount();
	}
	
	public void blockAllAccounts(){
		for(int i=0; i<this.accountsCounter; i++)
			this.accountsList[i].blockAccount();
	}
	
	public void unblockAllAccounts(){
		for(int i=0; i<this.accountsCounter; i++)
			this.accountsList[i].unblockAccount();
	}
	
	public void rotateAccounts(int pos1, int pos2){
		Account acc;
	  	acc = this.accountsList[pos1];
    	this.accountsList[pos1] = this.accountsList[pos2];
    	this.accountsList[pos2] = acc;
	}
	
	public void sortByAccountAmountAsc(){
		for(int i=0; i<this.accountsCounter; i++){
			for(int j=1; j<this.accountsCounter - i; j++){
				    if(this.accountsList[j-1].getAccountAmount() > this.accountsList[j].getAccountAmount()){
				    	rotateAccounts(j-1,j);
				    }
			}
		}
	}
	
}