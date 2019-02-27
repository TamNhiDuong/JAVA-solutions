import java.util.Scanner;
public class StringDecimalPartLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		boolean isDecimal = false;
		
		try {
			String deNumberStr = input.nextLine().replace(',', '.'); 
			int length = deNumberStr.length();
			
			double deNumber = Double.parseDouble(deNumberStr); 
			int checkDecimal = deNumberStr.indexOf("."); 
			int places = length - 1 - checkDecimal; 
			if (checkDecimal > 0 && places > 0) {
				isDecimal = true; 
				System.out.print(places + " decimal place(s)");
			}
			else {
				System.out.print("Please enter a proper decimal number");
			}
		}
		catch (Exception e) {
			System.out.print("Please enter a proper decimal number");
		}
	}

}
