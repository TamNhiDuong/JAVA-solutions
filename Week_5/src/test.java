
public class test {

	public static void main(String[] args) {
		int[][] first = { { 1, 2, 0 }, { 2, 3, 4 } };
		int[][] second = { { 3, 2, 5 }, { 6, 4, 3 } };
		
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
