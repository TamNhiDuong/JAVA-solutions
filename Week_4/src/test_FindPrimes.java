import java.util.Scanner;

public class test_FindPrimes {
	static int j = 1;
	static int i = 1;
	static String printPrimes = "";

	static String isPrime(String printPrimes) {

		int divisors = 0;
		int counter = 0;
		boolean isPrime = false; 

		for (divisors = i; divisors >= 1; divisors--) {
			if (i % divisors == 0) {
				counter = counter + 1;
			}
		}
		if (counter == 2) {
			printPrimes = printPrimes + i + " ";
			j++;
			isPrime = true;
		}
		return printPrimes;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many primes: ");
		int timesToPrint = input.nextInt();
		input.close();

		while (j <= timesToPrint) {
			i++;
			String result = isPrime(printPrimes);
			System.out.print(result);
		}
	}

}
