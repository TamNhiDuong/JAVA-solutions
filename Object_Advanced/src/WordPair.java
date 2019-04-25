import java.util.Comparator;

public class WordPair{

	//Field
	private String englishWord;
	private String finnishWord;
	
	//Constructor
	public WordPair(String englishWord, String finnishWord) {
		this.englishWord = englishWord;
		this.finnishWord = finnishWord;
	}
	//Methods
	public String getEnglishWord() {
		return englishWord;
	}
	public String getFinnishWord() {
		return finnishWord; 
	}
	//Comparing class
	/*public int compareTo (WordPair anotherWordPair) {
		return englishWord.compareTo(anotherWordPair.englishWord); 
	}
	
	public int compareTo (WordPair anotherWordPair) {
		return finnishWord.compareTo(anotherWordPair.finnishWord); 
	}
	*/
	
	}

