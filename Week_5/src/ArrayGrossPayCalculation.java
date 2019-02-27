import java.util.Scanner;
import java.text.DecimalFormat; 
public class ArrayGrossPayCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00"); 
		
		System.out.print("Enter your hourly wage: ");
		double wage = readDouble(input); 
		
		System.out.print("Enter the number of days: ");
		int days = Integer.parseInt(input.nextLine()); 
		
		int[] dailyHours = new int[days]; 
		int[] nums = new int[days];
		int totalHours = 0;
		double totalCompensation = 0;
		double compensation = 0;
		double grossPay = 0;
		
		for (int i = 0; i < dailyHours.length; i++) {
		nums[i] = i + 1;
		System.out.print("Hours worked on day " + nums[i] + ": " ); 
		dailyHours[i] = Integer.parseInt(input.nextLine()); 
		
		if ( dailyHours[i] >= 8) {
			compensation = dailyHours[i] - 8; 
			totalCompensation = totalCompensation + compensation; 
		}
		totalHours = totalHours + dailyHours[i]; 
		grossPay = (totalHours * wage) + ((totalCompensation * wage * 50) / 100); 
		}
				System.out.print("\n");
		System.out.println("Total work hours is " + totalHours);
		System.out.println("Gross pay is " + twoDecimal.format(grossPay));
		System.out.print("You entered the following daily hours: ");
		
		for (int i = 0; i < dailyHours.length; i++) {
			System.out.print(dailyHours[i] + " ");
		}
		
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',','.')); 

	}

}
