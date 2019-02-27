import java.util.Scanner;
public class RegExValidateUsernameFormat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter username: ");
		String userName = input.nextLine();
		
		if (userName.matches("(a)[0-9]{7}(@myy.haaga-helia.fi)")) {
			System.out.print("OK");
		}
		
		else {
			System.out.print("Invalid username format");
		}

	}

}
