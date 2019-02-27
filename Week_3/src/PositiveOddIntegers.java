import java.util.Scanner;

public class PositiveOddIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String integer = null;
		boolean validInput = false;

		while (!validInput) {
			try {
				System.out.print("Enter a positive odd integer: ");
				integer = input.nextLine();
				int newInteger = new Integer(integer);

				if (newInteger > 0 && newInteger % 2 == 1) {
					System.out.println("  OK");
					System.out.println("");
				}

				else {
					System.out.println("  " + newInteger + " is not a positive odd integer");
					System.out.println("");
				}
			} catch (Exception e) {
				if (integer.equalsIgnoreCase("quit")) {
					System.out.println("  Bye!");
					validInput = true;
				} else {
					System.out.println("  " + "\'" + integer + "\'" + " is not a positive odd integer");
					System.out.println("");
				}
			}
		}

	}

}
