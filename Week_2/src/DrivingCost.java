import java.util.Scanner;
import java.text.DecimalFormat;

public class DrivingCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");

		System.out.print("Enter driven kilometers: ");
		int kilo = Integer.parseInt(input.nextLine());

		System.out.print("Enter amount of fuel consumed: ");
		double fuel = readDouble(input);

		System.out.print("Enter fuel price per liter: ");
		double price = readDouble(input);

		double calculate = (price * fuel) / kilo;
		System.out.print("The cost per kilometer is " + decimal.format(calculate) + " euros.");

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
