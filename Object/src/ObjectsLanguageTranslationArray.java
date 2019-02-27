import java.util.Scanner;
public class ObjectsLanguageTranslationArray {

	public static void main(String[] args) {
		//Create string variable of english & finnish word
		String englishWord = null;
		
		
		//Scanner object to input data
		Scanner input = new Scanner(System.in); 
			
		//Create an array-length 5
		ArrayLanguageTranslation[] WordPair = new ArrayLanguageTranslation[5];
		
		WordPair[0] = new ArrayLanguageTranslation("bird", "lintu");
		WordPair[1] = new ArrayLanguageTranslation("bus", "bussi");
		WordPair[2] = new ArrayLanguageTranslation("car", "auto");
		WordPair[3] = new ArrayLanguageTranslation("cat", "kissa");
		WordPair[4] = new ArrayLanguageTranslation("dog", "koira");
		
		//Boolean
		boolean wordFound = false; 
		
		//Loop through to translate 
		System.out.print("Enter an English word: ");
		englishWord = input.nextLine(); 
		for (int i = 0; i < WordPair.length && wordFound == false; i++) {
			if(englishWord.equals(WordPair[i].getEnglishWord())) {
				System.out.print(WordPair[i].getFinnishWord());
				wordFound = true; 
			}

		}
		if (wordFound == false) {
			System.out.print("Unknown word");
		}
	}

}
