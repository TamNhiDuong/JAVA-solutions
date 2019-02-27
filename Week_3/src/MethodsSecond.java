import java.util.Scanner;

public class MethodsSecond {

	int height;
	int width;

	static void printRectangle(int height, int width) {

		for (int h = 1; h <= height; h++) {
			for (int w = 1; w <= width; w++) {
				System.out.print("x");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());
		System.out.print("Enter height: ");
		int height = Integer.parseInt(input.nextLine());
		System.out.println();
		

		printRectangle(height, width);

	}

}
