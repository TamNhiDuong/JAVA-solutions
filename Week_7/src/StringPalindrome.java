import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = input.nextLine();

		isPalindrome(inputString);
		if (isPalindrome(inputString) == true) {
			System.out.print("The text is a palindrome.");
		} else {
			System.out.print("No palindrome");
		}

	}

	static boolean isPalindrome(String inputString) {

		if (inputString.matches("^(?=.*[A-Za-z])[A-Za-z\\s,.:;?!\'\"-]+$")) {
			String reverseString = "";
			String cleanString = inputString.replaceAll("[\\s,.:;?!\'\"-]", "").toLowerCase();
			System.out.print(cleanString);
			for (int i = cleanString.length() - 1; i >= 0; i--) {
				reverseString += cleanString.charAt(i);
			}
			if (cleanString.equals(reverseString)) {
				return true;
			}
		}
		return false;
	}
}
