import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string:");
		String inputString = input.nextLine();
		int length = inputString.length();
		int total = length;

		while (!(inputString.equalsIgnoreCase("quit"))) {

			System.out.print("Enter a string:");
			inputString = input.nextLine();
			length = inputString.length();
			total = length + total;
		}
		total = total - 4; 
		System.out.println("The total length is " + total);
		input.close();
	}

}
