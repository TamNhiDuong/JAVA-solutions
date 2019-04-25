
public class Department {
	
//Instance fields
	private int number;
	private String name; 

//Constructor
	public Department (int number, String name) {
	super(); 
	this.number = number;
	this.name = name; 
	}
	
//Methods
	public int getNumber() {
		return number; 
	}
	
	public String getName() {
		return name; 
	}	
	
	public void setNumber(int number) {
		this.number = number; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
}
