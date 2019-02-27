
public class ObjectsWordPairArray {

	public static void main(String[] args) {
		WordPair[] wordPairArray = {
				new WordPair("class", "luokka"),
				new WordPair("object", "olio"),
				new WordPair("variable", "muuttuja")};
		
		for (int i = 0; i < wordPairArray.length; i++) {
			System.out.println(wordPairArray[i].getEnglishWord() + " = " + wordPairArray[i].getFinnishWord());
		}
	}

}
