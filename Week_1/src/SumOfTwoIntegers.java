import java.util.Scanner;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int first = Integer.parseInt(input.nextLine());

		System.out.print("Enter second integer: ");
		int second = Integer.parseInt(input.nextLine());

		System.out.print(first);
		System.out.print(" + ");
		System.out.print(second);
		System.out.print(" = ");
		System.out.print(first + second);

		input.close();
	}

}
