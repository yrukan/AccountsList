package by.htp.model;

public class Overdraft {

	private int overdraftLimit;
	private boolean isActive;
	
	public Overdraft(){
		
	}
	
	public Overdraft(int limit){
		this.overdraftLimit = limit;
		this.isActive = true;
	}
	
	public void setOverdraftLimit(int limit){
		this.overdraftLimit = limit;
		this.isActive = true;			
	}
	
	public void setOverdraftState(boolean state){
		this.isActive = state;		
	}
	
	public int getOverdraftLimit(){
		return this.overdraftLimit;
	}
	
	public boolean getOverdraftState(){
		return this.isActive;
	}
	
	public String stringOverdraftState(){
		String str;
		if(this.getOverdraftState() == true)
			str = "�������";
		else
			str = "������������";
		return str;
	}
	
	public void printOverdraftInfo(){
		System.out.println("���������: " + this.getOverdraftLimit());
		System.out.println("��������� ����������: " + this.stringOverdraftState());
	}
}
