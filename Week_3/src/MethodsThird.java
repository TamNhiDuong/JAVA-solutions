import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodsThird {
	double salary;
	double tax;

	static double calculateNetSalary(double salary, double tax) {
		return (salary - (salary * tax / 100));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00"); 

		System.out.print("Enter gross salary: ");
		double salary = readDouble(input);

		System.out.print("Enter income tax rate: ");
		double tax = readDouble(input);

		System.out.println();
		double result = calculateNetSalary(salary, tax);
		System.out.print("The net salary is " + twoDecimal.format(result));
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
