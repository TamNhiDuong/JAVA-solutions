import java.util.Scanner;
public class ArrayLanguageTranslation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter an English word: ");
		String english = input.nextLine(); 
		String output= null; 
		
		String arrayEnglish[] = {"bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher"};
		String arrayFinnish[] = {"lintu", "bussi", "auto", "kissa", "koira", "koulu", "kiitos", "juna", "opettaja"}; 
		boolean wordFound = false;
		
		for (int i = 0; i < arrayEnglish.length && wordFound == false; i++) {
		 
		if (arrayEnglish[i].equals(english)) {
		    output = arrayFinnish[i]; 
			wordFound = true; 	 
		}
		
	}
		if (wordFound == false) {
			output = "Unknown word"; 
		}
		System.out.print(output);
		
	}
	

}
