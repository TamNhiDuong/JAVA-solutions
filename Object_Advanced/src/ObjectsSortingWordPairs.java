import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class ObjectsSortingWordPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<WordPair> wordList = new ArrayList<WordPair>(); 
		
		String english = "";
		String finnish = "";
		
		System.out.print("Enter an English word (quit ends): ");
		english = input.nextLine(); 
		
		while(!english.equals("quit")) {
			System.out.print("Enter a Finnish word: ");
			finnish = input.nextLine(); 
			System.out.println();
			
			wordList.add(new WordPair(english, finnish));
			
			System.out.print("Enter an English word (quit ends): ");
			english = input.nextLine(); 
		}
		//Sorting Object ****
		System.out.println();
		
		Collections.sort(wordList, new wordPairComparator());
		for (WordPair wordPairObject : wordList) {
			System.out.println(wordPairObject.getEnglishWord() + " = " + wordPairObject.getFinnishWord()); 
		}
		System.out.println();
		
		Collections.sort(wordList, new wordPairComparator2());
		for (WordPair wordPairObject : wordList) {
			System.out.println(wordPairObject.getFinnishWord() + " = " + wordPairObject.getEnglishWord()); 
		}
		
	}
	
	}

