import java.util.Scanner;
public class ArrayDistinctValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int num = Integer.parseInt(input.nextLine());
		int[] array = new int[num]; 
		
		for (int i = 0; i < num; i++) {
			System.out.print("Enter an integer: ");
			array[i] = Integer.parseInt(input.nextLine()); 
		}
        int temp = 0; 
		for (int i = 0; i < array.length; i++) {
			for (int k = i + 1; k < array.length; k++) {
				if (array[k] < array[i]) {
					temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
			}
		}
		/*
		for (int j = 0; j< array.length; j++) {
			boolean isDuplicate = false;
			for (int h = 0; h < j; h++) {
				if (array[j] == array[h]) {
					isDuplicate = true; 
					break; 
				}}
				if (!isDuplicate) {
					System.out.print(array[j] + " ");
				}
			}*/
		for (int j=1;j < array.length;j++) {
			
			for (int g = j - 1; g < array.length; g++) {
				if(array[g] < array[j]) {
					System.out.print(array[g] + " ");
			}
		}
	
		}
		System.out.print(array[array.length-1] + " ");
	}
}


