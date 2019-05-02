import java.util.Scanner;
public class PasswordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("=== Password validation ===");
		System.out.print("Enter username: ");
		String name = input.nextLine();
		
		System.out.print("Enter password: ");
		String pass = input.nextLine();
		System.out.println();
		
	
		if (checkPassword(name,pass) == true) {
			System.out.print("Password ok");
		}
		else {
			System.out.print("Invalid password");
		}
		
	}
	static boolean checkPassword(String pass, String name) {
		int check = pass.toLowerCase().indexOf(name);
		
		if(check < 0 && pass.matches("^(.){5,}[0-9]{1,}$")) {
			return true;
		}
		
		return false;
		

	}

}
