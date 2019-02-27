import java.util.Scanner;
public class StringRemoveSpace {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter a string: ");
    String inputStr = input.nextLine(); 
    
    System.out.print(removeExtraSpace(inputStr));
	}

	static String removeExtraSpace(String inputStr) {
		
		String newString = "\"" + inputStr.replaceAll("\\s+", " ") + "\""; 

		return newString;

	}

}
