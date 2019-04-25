
public class Employee {

//Instance field
	private String name; 
	private String email;
	private Department department; 
	
//Constructor
	public Employee(String name, String email, Department department) {
		super(); 
		this.name = name;
		this.email = email;
		this.department = department; 
	}

//Methods
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Department getDepartment() {
		return department; 
	}
	public void setDepartment(Department department) {
		this.department = department; 
	}
	public void setName(String name) {
		this.name = name; 
	}
	public void setEmail( String email) {
		this.email = email; 
	}
	public String toString() {
		String employee = name + " (" + email + "), " + department.getName() + " department"; 
		return employee; 

	}

}
