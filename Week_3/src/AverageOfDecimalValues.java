import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageOfDecimalValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");

		System.out.print("Enter first number (zero ends): ");
		double number = readDouble(input);
		int count = 1;
		double total = number;
		if (number == 0) {
			System.out.print("Nothing to calculate.");
		}

		else {
			while (number != 0) {
				System.out.print("Enter next number (zero ends): ");
				number = readDouble(input);
				count = count + 1;
				total = total + number;
			}
			double result = total / (count - 1);
			System.out.print("The average is " + decimal.format(result));
		}

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
