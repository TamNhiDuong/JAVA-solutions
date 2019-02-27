import java.util.Scanner; 
import java.text.DecimalFormat; 
public class CompoundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		DecimalFormat twoDecimal = new DecimalFormat("0.00"); 
		
		System.out.print("Enter initial deposit:");
		double deposit = input.nextDouble(); 
		
		System.out.print("Enter interest rate:");
		double interestRate = input.nextDouble();
		
		System.out.print("Enter capital income tax rate:");
		double tax = input.nextDouble();
		
		System.out.print("Enter number of years:");
		int years = input.nextInt();
		
		double totalBalance = deposit; 
		
		for (int i = 1; i <= years; i++) {
			double interest = totalBalance * interestRate / 100; 
			double interestAfterTax = interest - (interest * tax / 100); 
			totalBalance += interestAfterTax; 
			System.out.println(i + ":" +  twoDecimal.format(totalBalance));
		}
	;

	}

	private static double readDouble(Scanner input) {
				return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
