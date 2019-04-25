import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections; 
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


		while (!(englishWord.equals("ok"))) {
			System.out.print("Enter a Finnish word: ");
			finnishWord = input.nextLine();

			wordsList.add(new WordPair(englishWord, finnishWord));

			System.out.println();

			System.out.print("Enter an English word: ");
			englishWord = input.nextLine();

		}

	

		// translate

		System.out.println("=== English-Finnish translation service (quit ends) ===");
		String inputWord = "";
		System.out.print("Enter an English word: ");
		inputWord = input.nextLine();
		

		while (!inputWord.equals("quit")) {
			
			boolean wordFound = false;
			for (int i = 0; i < wordsList.size(); i++) {

				if (wordsList.get(i).getEnglishWord().equals(inputWord)) {
					System.out.print(wordsList.get(i).getFinnishWord());
					
					System.out.println("\n");
				
					System.out.print("Enter an English word: ");
					inputWord = input.nextLine();
					wordFound = true;
				}
			}
			if (wordFound == false) {
				System.out.println("Unknown word");
				System.out.println();
				System.out.print("Enter an English word: ");
				inputWord = input.nextLine();
			}
		}
		System.out.print("Bye!");
	}
}
