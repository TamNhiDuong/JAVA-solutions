import java.util.Scanner;

public class MethodsPrimes {
	static int j = 1;
	static int i = 1;
	static boolean isPrime;
	static String printPrimes = "";

	static boolean isPrime(int i) {

		int divisors = 0;
		int counter = 0;

		for (divisors = i; divisors >= 1; divisors--) {
			if (i % divisors == 0) {
				counter = counter + 1;
				return true;
			}
		}
		/*if (counter == 2) {
			printPrimes = printPrimes + i + " ";
			j++;
		}*/
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many primes: ");
		int timesToPrint = input.nextInt();
		input.close();

		while (j <= timesToPrint) {
			i++;
			if (isPrime(i) == true) {
				System.out.print(i);
			}
		}
	}

}
