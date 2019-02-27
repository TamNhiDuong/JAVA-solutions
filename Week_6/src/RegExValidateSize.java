import java.util.Scanner;

public class RegExValidateSize {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size: ");
		String inputSize = input.nextLine();

		if (inputSize.matches("XS|S|M|L|XL")) {
			System.out.println("OK");
		} else {
			System.out.print("Invalid size");
		}

	}

}
