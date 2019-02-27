import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter a non-negative integer:");
			int n = Integer.parseInt(input.nextLine());
			int result = 1;
			if (n > 0) {
				for (int x = 1; x <= n; x++) {
					result = result * x;
				}
				System.out.print(n + "!" + " = " + result);
			} else if (n == 0) {
				System.out.print("0! = 1");
			} else {
				System.out.print("Please enter a non-negative integer.");
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Please enter a non-negative integer.");

		}
	}
}
