package JdbcExercises;

public class Student {
	private String firstname;
	private String lastname;
	private String streetaddress;
	private String postoffice;
	private String postcode;

	public Student() {
		firstname = "";
		lastname = "";
		streetaddress = "";
		postoffice = "";
		postcode = ""; 
	}

	public Student(String firstname, String lastname, String streetaddress, String postoffice, String postcode) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.streetaddress = streetaddress;
		this.postoffice = postoffice;
		this.postcode = postcode;
	}
	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStreetaddress() {
		return streetaddress;
	}

	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}

	public String getPostoffice() {
		return postoffice;
	}

	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	
	@Override
	public String toString() {
		return firstname + " " + lastname + ", " + streetaddress + ", "+ postcode+ " "+ postoffice;
	}

}
