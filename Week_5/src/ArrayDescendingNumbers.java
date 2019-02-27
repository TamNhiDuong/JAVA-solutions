import java.util.Scanner; 
public class ArrayDescendingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double[] fourNumbers = new double[4]; 
	
		int[] nums = new int[4];  
		for (int i = 0; i < fourNumbers.length; i++) {
			nums[i] = i + 1; 
			System.out.print("Enter " + nums[i] + ". number: ");
			fourNumbers[i] = readDouble(input);
		}
		System.out.print("\n");
		for (int k = 0; k < fourNumbers.length; k++) {
			for (int j = k+1; j < fourNumbers.length; j++) {
				if (fourNumbers[k] < fourNumbers[j]) {
				double temp = fourNumbers[k];
				fourNumbers[k] = fourNumbers[j];
				fourNumbers[j] = temp; 
				}
			}
			System.out.print(fourNumbers[k] + " "); 
		}
	}
	private static double readDouble(Scanner input) {
		
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}}



