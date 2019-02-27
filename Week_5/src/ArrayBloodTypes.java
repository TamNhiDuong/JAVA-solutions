import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols; 
public class ArrayBloodTypes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0"); 
		DecimalFormatSymbols symbol = DecimalFormatSymbols.getInstance(); 
		symbol.setDecimalSeparator(','); 
		oneDecimal.setDecimalFormatSymbols(symbol); 
		System.out.print("Enter blood type: ");
		String typeInput = input.nextLine();
		
		String[] array = {"A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+"};
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (typeInput.equals(array[i])) {
				count = count + 1;
			}
		}
		
		double percent = count * 100 / array.length; 
		
		System.out.print(oneDecimal.format(percent) + " %");
	}

}
