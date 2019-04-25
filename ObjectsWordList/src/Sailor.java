
public class Sailor {
		//Instance fields
		private String name;
		private String email; 
		
		//Constructor
		public Sailor(String name, String email) {
			super(); 
			this.name = name;
			this.email = email;
		}
		
		//Methods
		public String getName() {
			return name;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}

	}


