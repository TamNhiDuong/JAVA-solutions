import java.util.Scanner;
public class StringLettersAndDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter a string: ");
		String inputString = input.nextLine();
		
		char[] stringChar = inputString.toCharArray(); 
		int count = 0;
		int countSecond = 0;
		
		for (int i = 0; i < stringChar.length; i++) {
			if(Character.isLetter(stringChar[i])) {
				count++; 
			}
			 if(Character.isDigit(stringChar[i])) {
				countSecond++;    
			   }
		}
		System.out.println(count + " letter(s)");
		System.out.println(countSecond + " digit(s)"); 
	}
	   }


