import java.util.Scanner;

public class MethodsFirst {

	static int printNumbers (int x) {
		return x * 2; 
	}
	public static void main(String[] args) {
		for  (int i = 1; i <= 25; i++ ) {
			int result = printNumbers(i);
		System.out.print(result + " ");	
		}

	}

}
