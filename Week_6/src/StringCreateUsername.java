import java.util.Scanner;

public class StringCreateUsername {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String name = input.nextLine();

		System.out.print("Enter surname: ");
		String surname = input.nextLine();

		System.out.println(createUsername(name, surname));

	}

	static String userName = "";

	static String createUsername(String name, String surname) {

		int nameLength = name.length();
		int surLength = surname.length();

		String notUsername = "Not enough letters to create a username!";

		if (nameLength >= 2 && surLength >= 3) {
			String surNameSubstring = surname.substring(0, 3).toLowerCase();
			String nameSubstring = name.substring(0, 2).toLowerCase();
			userName = surNameSubstring + nameSubstring;
			return userName;
		}
		return notUsername;
	}

	private static String substring(int i, int j) {
		return null;
	}
}
