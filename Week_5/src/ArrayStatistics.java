import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ArrayStatistics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");
		DecimalFormatSymbols symbol = DecimalFormatSymbols.getInstance(); 
		symbol.setDecimalSeparator(','); 
		oneDecimal.setDecimalFormatSymbols(symbol); 

		System.out.print("Enter the number of values: ");
		int num = Integer.parseInt(input.nextLine());

		if (num < 3) {
			System.out.println("Sorry, at least 3 values required");
		} else {

			int[] integersArray = new int[num];

			for (int i = 0; i < integersArray.length; i++) {
				System.out.print("Enter an integer: ");
				integersArray[i] = Integer.parseInt(input.nextLine());
			}

			System.out.print("\n");
			System.out.println("n = " + num);
			System.out.println("Min: " + ArrayStatLibrary.min(integersArray));
			System.out.println("Max: " + ArrayStatLibrary.max(integersArray));
			System.out.println("Median: " + oneDecimal.format(ArrayStatLibrary.median(integersArray)));
			System.out.println("Mean: " + oneDecimal.format(ArrayStatLibrary.mean(integersArray, num)));
			System.out.println("Sample standard deviation: "
					+ oneDecimal.format(ArrayStatLibrary.standardDeviation(integersArray)));
			System.out.print("Sample data: ");
			for (int i = 0; i < integersArray.length; i++) {
		    System.out.print(integersArray[i] + " ");
			}
		}
	}
}

class ArrayStatLibrary {

	static int integersArray[];

	static int min(int[] integersArray) {
		int min = integersArray[0];
		for (int i = 0; i < integersArray.length; i++) {
			if (integersArray[i] < min) {
				min = integersArray[i];
			}
		}
		return min;
	}

	static int max(int[] integersArray) {
		int max = 0;
		for (int i = 0; i < integersArray.length; i++) {
			if (integersArray[i] > max) {
				max = integersArray[i];
			}
		}
		return max;

	}

	static double median(int[] integersArray) {
		int[] copy = Arrays.copyOf(integersArray, integersArray.length); 
		for (int i = 0; i < copy.length; i++) {
			for (int j = i + 1; j < copy.length; j++) {
				if (copy[i] > copy[j]) {
					int temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}

		int length = copy.length;
		double doubleMedian = 0;
		int medianSecond = 0;
		if (length % 2 == 0) {
			doubleMedian = (double) copy[(length / 2) - 1] + (double) copy[(length / 2)];
		} else {
			doubleMedian = (double) copy[(length / 2)];
		}
		return doubleMedian;
	}

	static double mean(int[] integersArray, int num) {
		double total = 0;
		int length = integersArray.length;
		for (int i = 0; i < integersArray.length; i++) {
			total = total + integersArray[i];
		}
		double mean = total / (double) length;
		return mean;
	}

	static double standardDeviation(int[] integersArray) {
		double copyMean = mean(integersArray, 0);
		double totalSubstract = 0;
		for (int i = 0; i < integersArray.length; i++) {
			totalSubstract += Math.pow((integersArray[i] - copyMean), 2);
		}
		double deviding = totalSubstract / (integersArray.length - 1);
		double squareRoot = Math.sqrt(deviding);

		return squareRoot;

	}
}
