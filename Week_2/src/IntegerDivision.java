import java.util.Scanner;

public class IntegerDivision {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter dividend: ");
		int dividend = Integer.parseInt(input.nextLine());

		System.out.print("Enter divisor: ");
		int divisor = Integer.parseInt(input.nextLine());

		int result = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.print(dividend + " / " + divisor + " = " + result + ", the remainder is " + remainder);

		input.close();
	}

}
