import java.util.Scanner;
public class StringPassword {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter username: ");
	String userName = input.nextLine();
	
	System.out.print("Enter password: ");
	String pass = input.nextLine(); 
	 
	if (validatePassword(userName, pass) == true) {
		System.out.print("OK");
	}
	else {
		System.out.print("NOT OK"); 
	}

	}

	static boolean validatePassword(String userName, String pass) {
		int passLength = pass.length(); 
		int found =  pass.indexOf(userName.toLowerCase()); 
		int foundUpper = pass.indexOf(userName.toUpperCase());
		
		if (passLength >= 8 && found < 0 && foundUpper < 0) {
			return true; 
		}
		return false;
	}
		
	}

