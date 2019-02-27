import java.util.Scanner;

public class MethodsFactorial {
	int factorial = 1;

	static int factorial(int j) {
		int factorial = 1;
		for (int i = 1; i <= j; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		for (int j = 1; j <= 9; j++) {
			int result = factorial(j);
			System.out.println(j + "!" + " = " + result);
		}

	}

}
