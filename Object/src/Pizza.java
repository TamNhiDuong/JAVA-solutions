import java.text.DecimalFormat;

public class Pizza {
	
	 DecimalFormat df = new DecimalFormat("#.00");
	 
	//Instance fields- non static- define its attribute
	private String name;
	private double price; 
	
	//Constructor
	public Pizza(String name, double price) {
		this.name = name;
		this.price = price; 
	}
	
	//Methods- define its behaviours
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price; 
	}
	
	public String toString() {
		return name + " (" + df.format(price).replace('.', ',') + " euros" + ")"; 
	}
}
