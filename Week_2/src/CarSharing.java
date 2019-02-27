import java.util.Scanner;
import java.text.DecimalFormat;

public class CarSharing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");

		System.out.print("Enter driven kilometers: ");
		double kilometers = readDouble(input);

		System.out.print("Enter fuel consumption per 100 km: ");
		double fuel = readDouble(input);

		System.out.print("Enter fuel price per liter: ");
		double fuelPrice = readDouble(input);

		System.out.print("Enter number of people: ");
		int people = Integer.parseInt(input.nextLine());

		double calculate = ((fuel * kilometers / 100) / 5) * fuelPrice;
		System.out.print("Each of the " + people + " people should pay " + decimal.format(calculate) + " euros.");

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
