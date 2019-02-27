import java.util.Scanner;

public class ValidateThird {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean validInput = false;
		String inputRandom = null;

		while (!validInput) {

			try {
				System.out.print("Enter grade (0-5):");
				inputRandom = input.nextLine();
				int inputNumber = new Integer(inputRandom);

				if (inputNumber >= 0 && inputNumber <= 5) {
					System.out.print("OK");
					validInput = true;

				} else {
					System.out.println(inputNumber + " is not a valid grade.");

				}
			} catch (Exception e) {
				System.out.println(inputRandom + " is not a valid grade.");
			}
		}
	}

}
