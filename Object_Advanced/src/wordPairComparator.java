import java.util.Comparator;

public class wordPairComparator implements Comparator<WordPair> {
	public int compare(WordPair a, WordPair b) {
		return a.getEnglishWord().compareTo(b.getEnglishWord());
	
	}
	
}