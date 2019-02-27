import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int integer = Integer.parseInt(input.nextLine());
		
		int product = 1;

		while (integer != 0) {
			int remainder = integer % 10;
			integer = integer / 10;

			product = product * remainder;
		}
		System.out.print(product);

	}

}
