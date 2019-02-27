public class Applicant {
	 
	//Instance fields- non static- define its attribute
	private String name;
	private double points; 
	
	//Constructor
	public Applicant(String name, double points) {
		this.name = name;
		this.points = points; 
	}
	
	//Methods- define its behaviours

	public String getName() {
		return name;
	}
	
	public double getPoints() {
		return points; 
	}
}