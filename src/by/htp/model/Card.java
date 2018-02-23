package by.htp.model;

public class Card {

	private String type;
	private boolean isActive;
	
	public Card(){
		
	}
	
	public Card(String type){
		this.type = type;
		this.isActive = true;
	}
	
	public void setCardType(String type){
		this.type = type;				
	}
	
	public void setCardState(boolean state){
		this.isActive = state;				
	}
	
	public String getCardType(){
		return this.type;
	}
	
	public boolean getCardState(){
		return this.isActive;
	}
	
	public String stringCardState(){
		String str;
		if(this.getCardState() == true)
			str = "�������";
		else
			str = "�������������";
		return str;
	}
	
	public void printCardInfo(){
		System.out.println("�����: " + this.type);
		System.out.println("��������� �����: " + this.stringCardState());
	}
}
