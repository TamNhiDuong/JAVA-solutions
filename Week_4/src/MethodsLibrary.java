import java.util.Scanner;

public class MethodsLibrary {

	int factorial = 1;
	private static Scanner input = new Scanner(System.in);

	public static int factorial(int inputNumber) {
		int factorial = 1;
		for (int i = 1; i <= inputNumber; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static int readInt(String prompt) {
		System.out.print(prompt);
		return Integer.parseInt(input.nextLine());

	}
} 
