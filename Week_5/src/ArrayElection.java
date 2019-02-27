import java.util.Scanner;

public class ArrayElection {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int candidates = Integer.parseInt(input.nextLine());

		String[] namesArray = new String[candidates];
		int[] votesArray = new int[candidates];
		int[] num = new int[candidates];

		for (int i = 0; i < namesArray.length; i++) {
			num[i] = i + 1;

			System.out.print("Enter " + num[i] + ". name: ");
			namesArray[i] = input.nextLine();

			System.out.print("Enter votes: ");
			votesArray[i] = Integer.parseInt(input.nextLine());
		}
		System.out.print("\n");

		int max = 0;
		String winner = null;
		int count = 0;
		for (int i = 0; i < namesArray.length; i++) {
			if (votesArray[i] > max) {
				max = votesArray[i];
				winner = namesArray[i];
			}
		}
		for (int i = 0; i < namesArray.length; i++) {
			if (max == votesArray[i]) {
				count = count + 1;
			}
		}

		if (count == 1) {
			System.out.println("The winner is " + winner + " with " + max + " votes!");
		} else if (count > 1) {
			System.out.println("The election is a tie between the following candidates:");
			for (int i = 0; i < namesArray.length; i++) {

				if (max == votesArray[i]) {
					System.out.println(namesArray[i] + " (" + max + " votes)");
				}
			}

		}

	}

}
