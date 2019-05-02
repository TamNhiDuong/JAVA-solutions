import java.util.Scanner;

public class DivisorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter a positive integer: ");
			int integerInput = Integer.parseInt(input.nextLine());

			if (integerInput > 0) {
				int counter = 0;
				for (int i = 1; i <= integerInput; i++) {
					if (integerInput % i == 0) {
						counter++;
					}
				}
				System.out.print(integerInput + " has " + counter + " divisors");

			}
			else {
				System.out.print("The input is not a positive integer");
			}

		} catch (NumberFormatException nfe) {
			System.out.println("The input is not a positive integer");
		}
		input.close();

	}

}
