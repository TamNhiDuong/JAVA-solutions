import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections; 

public class ObjectsWordList {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> wordList = new ArrayList<String>();
		String inputWords = "";
		 do {
			 System.out.print("Enter a word (quit ends): ");
			 inputWords = input.nextLine();
			 wordList.add(inputWords);
		 }
		
		while (!(inputWords.equals("quit"))); 
		
		System.out.println();
		
		Collections.sort(wordList); 
		for (int i = 0; i < wordList.size(); i++) {
			if(!(wordList.get(i).equals("quit"))) {
		System.out.println(wordList.get(i));	
		}
		}
		}
	}


