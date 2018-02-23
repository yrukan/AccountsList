package by.htp.model;

public class Client {

	private String name;
	private String surname;
	
	public Client(){
		
	}
	
	public Client(String name, String surname){
		this.name = name;
		this.surname = surname;
	}
	
	public void setClientName(String name){
		this.name = name;
	}
	
	public void setClientSurname(String surname){
		this.surname = surname;
	}
	
	public String getClientName(){
		return this.name;
	}
	
	public String getClientSurname(){
		return this.surname;
	}
	
	public void printClient(){
		System.out.println("-----------------------------------------------");
		System.out.println("Клиент: " + this.name + " " + this.surname);
	}
	
}
