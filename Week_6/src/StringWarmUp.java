import java.util.Scanner;

public class StringWarmUp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = input.nextLine();

		int length = inputString.length();
		System.out.println(length + " characters");

		String toUpperCase = inputString.toUpperCase();
		System.out.println(toUpperCase);

		String toLowerCase = inputString.toLowerCase();
		System.out.println(toLowerCase);

	}

}
