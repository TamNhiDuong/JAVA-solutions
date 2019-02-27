import java.util.Scanner;
import java.text.DecimalFormat; 

public class ObjectsApplicantProgram {

	public static void main(String[] args) {
		String name = null;
		int points= 0;
		
		 DecimalFormat dec = new DecimalFormat();     
		 dec.setGroupingUsed(false);
		
		Scanner input = new Scanner(System.in); 
		//each object 
		Applicant applicant = new Applicant(name, points);
		//array object
		Applicant[] applicantArr = new Applicant[4]; 
		
		for (int i = 0; i < applicantArr.length; i++) {
			int numb = i + 1; 
			System.out.print("Enter "  + numb + ". name: ");
			name = input.nextLine();
			applicantArr[i] = applicant;
		 
			
			System.out.print("Enter points: ");
			points = Integer.parseInt(input.nextLine());
			applicantArr[i] = applicant;
		
			
			applicantArr[i] = new Applicant(name, points); 
		}
		System.out.println();
		System.out.print("Enter the minimum of required points: ");
		int min = Integer.parseInt(input.nextLine()); 
		
		
		System.out.println("The following applicants achived the minimum of " + min + " points:");
		for (int i = 0; i < applicantArr.length; i++) {
			if (applicantArr[i].getPoints() >= min) {
				System.out.println(applicantArr[i].getName() + ", " + dec.format(applicantArr[i].getPoints()) + " points");
			}
		}
	}

}
