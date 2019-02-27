import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		String inputString = input.nextLine();

		int count = 1;

		while (!(inputString.equals(""))) {
			System.out.print("Enter string: ");
			inputString = input.nextLine();
			count = count + 1;
		}
		System.out.print(count);
		input.close();
	}

}
