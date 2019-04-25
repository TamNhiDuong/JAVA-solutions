import java.util.Comparator;

public class wordPairComparator2 implements Comparator<WordPair> {
	public int compare(WordPair a, WordPair b) {
		return a.getFinnishWord().compareTo(b.getFinnishWord());
	
	}
	
}