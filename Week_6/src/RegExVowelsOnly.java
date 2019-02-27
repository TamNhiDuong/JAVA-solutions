import java.util.Scanner;

public class RegExVowelsOnly {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = input.nextLine(); 
		
		if (inputString.matches("^[AEIOUYÄÖaeiouyäöå]+$")) {
			System.out.print("Vowels only");
		}
		else {
			System.out.print("Not only vowels!");
		}

	}

}
