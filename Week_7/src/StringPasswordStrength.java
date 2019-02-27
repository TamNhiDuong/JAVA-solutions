import java.util.Scanner; 
public class StringPasswordStrength {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter password: ");
	String password = input.nextLine();
	
	checkStrength(password);
	
	if(checkStrength(password) == true) {
		System.out.println("OK");
	}
	else {
		System.out.println("Not strong enough!");
	}
	}
	
	static boolean checkStrength(String password) {
		
		int length = password.length(); 
		if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$") || password.matches("^(?=.*[@#$%^&+=_*\\s])(?=.*[a-z])(?=.*[A-Z]).{8,}$") || password.matches("^(?=.*[@#$%^&+=_*\\s])(?=.*[0-9])(?=.*[A-Z]).{8,}$") || password.matches("^(?=.*[@#$%^&+=_*\\s])(?=.*[0-9])(?=.*[a-z]).{8,}$")) {
	    return true; 
		}
		return false;
		
	}

}
