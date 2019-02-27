import java.util.Scanner;
import java.text.DecimalFormat;

public class AgentCommission {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");

		System.out.print("Enter selling price: ");
		double price = readDouble(input);

		double calculate = price * 3.44 / 100;

		if (calculate > 2400) {
			System.out.println("The comission is " + decimal.format(calculate) + " euros");
		}

		else {
			System.out.println("The commission is 2400,00 euros");
		}

	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
