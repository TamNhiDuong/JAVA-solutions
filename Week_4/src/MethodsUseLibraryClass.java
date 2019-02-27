
public class MethodsUseLibraryClass {

	public static void main(String[] args) {
		int inputInteger = MethodsLibrary.readInt("Enter an integer: "); 
		System.out.print(inputInteger + "!" + " = " + MethodsLibrary.factorial(inputInteger));
	}

}
