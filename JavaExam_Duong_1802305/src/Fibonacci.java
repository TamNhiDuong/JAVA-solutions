public class Fibonacci {

	public int[] getNumbers(int numberOfFibonacci) {
		int[] arrayOfFibonacci = new int[numberOfFibonacci]; 
	
		arrayOfFibonacci[0] = 0;
		arrayOfFibonacci[1] = 1;
	
		
		int counter = 2;
	
	while (counter < numberOfFibonacci) {
		
		arrayOfFibonacci[counter] = arrayOfFibonacci[counter-1] + arrayOfFibonacci[counter-2]; 
		counter++;
	}
	return arrayOfFibonacci; 
	}
}