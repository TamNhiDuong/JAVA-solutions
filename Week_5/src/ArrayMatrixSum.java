
public class ArrayMatrixSum {

	public static void main(String[] args) {
		int[][] first = { { 1, 2, 0 }, { 2, 3, 4 } };
		int[][] second = { { 3, 2, 5 }, { 6, 4, 3 } };
		int[][] third = { { 1, 1, 1, 1 }, { 4, 3, 2, 1 }, { 2, 2, 2, 2 } };
		int[][] fourth = { { 2, 2, 2, 3 }, { 2, 3, 2, 0 }, { 1, 2, 3, 4 } };
		printSum(first, second);
		System.out.println();
		printSum(third, fourth);
	}

	static void printSum(int[][] first, int[][] second) {
		int rowFirst = first.length;
		int colFirst = first[0].length;
		
		int sumFirst = 0;
		for (int x = 0; x < rowFirst; x++) {
			for (int y = 0; y < colFirst; y++) {
				sumFirst = first[x][y] + second[x][y];
				System.out.print(sumFirst + " "); 
			}
			System.out.println();
		}
	}
}
