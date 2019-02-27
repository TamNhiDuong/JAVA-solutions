import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int integer = Integer.parseInt(input.nextLine());
		integer = Math.abs(integer); 
		int remainder = integer % 10;
		integer = integer / 10; 
		int product = remainder;

		while (integer != 0) {
			remainder = integer % 10;
			integer = integer / 10;

			product = product * remainder;
		}
		System.out.println(product);

	}

}
