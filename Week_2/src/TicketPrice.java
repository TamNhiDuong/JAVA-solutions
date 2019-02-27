import java.util.Scanner;
import java.text.DecimalFormat;

public class TicketPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
				
		System.out.print("Enter price for a single ticket: ");
		double singlePrice = readDouble(input);
		
		System.out.print("Enter price for a season ticket: ");
		double seasonPrice = readDouble(input);
		
		System.out.print("Enter the number of bus trips per month: ");
		int trips = Integer.parseInt(input.nextLine());
		
		double calSinglePrice = trips * singlePrice;
		
		if (calSinglePrice > seasonPrice) {
		double result = calSinglePrice - seasonPrice; 
		System.out.print("Buying a season ticket is " + decimal.format(result) + " euros cheaper.");
		}
		
		else if (seasonPrice > calSinglePrice) {
			double result = seasonPrice - calSinglePrice;
			System.out.print("Buying single tickets s " + decimal.format(result) + " euros cheaper.");
		}
		else {
			System.out.print("There is no difference in the price.");
		}
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
