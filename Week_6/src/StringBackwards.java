import java.util.Scanner;
public class StringBackwards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = input.nextLine(); 
		
		
		System.out.println(reverse(inputString));

	}
	
	static String reverse(String inputString) {
		String newString = "";
		
		for (int i = inputString.length() - 1; i >= 0; i --) {
			newString += inputString.charAt(i); 
		}
		return newString;
		
	}

}
