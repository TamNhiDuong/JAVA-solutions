import java.util.Scanner;
 
public class MethodsMax {
	
	double first;
	double second;
	
    static double max(double first, double second) {
    	if (first > second) {
    		return first;
    	}
    	else {
    		return second;
    	}
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first double: ");
		double first = readDouble(input);
		
		System.out.print("Enter second double: ");
		double second = readDouble(input); 
		
		double result = max(first, second); 
		System.out.print("The max value is " + result);
	
	}
	private static double readDouble(Scanner input) {
				return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
