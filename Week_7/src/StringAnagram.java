import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String first = input.nextLine();

		System.out.print("Enter second string: ");
		String second = input.nextLine();

		isAnagram(first, second);
		if (isAnagram(first, second) == true) {
			System.out.print("Anagram!");
		} else {
			System.out.print("No anagram.");
		}

	}

	static boolean isAnagram(String first, String second) {

		if (first.matches("^(?=.*[a-z])(?=.*[A-Z])[A-Za-z\\s,\\.]+$") && second.matches("^(?=.*[a-z])(?=.*[A-Z])[A-Za-z\\s,\\.]+$")) {

			char[] charArray1 = first.replaceAll("[\\s,\\.]", "").toLowerCase().toCharArray();
			Arrays.sort(charArray1);

			char[] charArray2 = second.replaceAll("[\\s,\\.]", "").toLowerCase().toCharArray();
			Arrays.sort(charArray2);

			if (Arrays.equals(charArray1, charArray2) == true) {
				return true;
			}
		}
		return false;
	}
}
