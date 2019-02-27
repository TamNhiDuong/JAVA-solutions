import java.util.Scanner;
import java.text.DecimalFormat;

public class DiscountPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat transform = new DecimalFormat("0.00");

		System.out.print("Enter original price: ");
		double price = readDouble(input);

		System.out.print("Enter discount percentage: ");
		double discount = readDouble(input);

		double result = price - (price * discount / 100);
		System.out.println("The final price is " + transform.format(result));
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}