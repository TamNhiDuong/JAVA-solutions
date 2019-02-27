import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsLanguageTranslationArrayList {

	private static final String WordPair = null;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// dictionary
		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");

		ArrayList<WordPair> wordsList = new ArrayList<WordPair>();
		String englishWord = "";
		String finnishWord = "";

		System.out.print("Enter an English word: ");
		englishWord = input.nextLine();
		wordsList.add(new WordPair(englishWord, finnishWord));

		while (!(englishWord.equals("ok"))) {
			System.out.print("Enter a Finnish word: ");
			finnishWord = input.nextLine();
			
			System.out.println();

			System.out.print("Enter an English word: ");
			englishWord = input.nextLine();
			wordsList.add(new WordPair(englishWord, finnishWord));

		}
		
		System.out.println();
		
		System.out.println("Input:");
		String wordInput = input.nextLine();
		for (WordPair wordsObject : wordsList) {
			if(wordsObject.getEnglishWord().equals(wordInput)) {
				System.out.print(wordsObject.getFinnishWord());
			}
		}
		System.out.print("no");

		// translate

		/*System.out.println("=== English-Finnish translation service (quit ends) ===");
		String inputWord = ""; 
		System.out.print("Enter an English word: ");
		inputWord = input.nextLine(); 
		boolean wordFound = false;

		for (int i = 0; i < wordsList.size(); i++) {
		
			if (wordsList.get(i).getEnglishWord().equals(inputWord)) {
				System.out.print("true");
				wordFound = true;
			}
			if (wordFound == false) {
				System.out.print("Unknown word");
			}
			
		}*/
		
		
	} 
}

