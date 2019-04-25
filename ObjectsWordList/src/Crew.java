import java.util.ArrayList;

public class Crew {
    //Instance field
	
	private ArrayList<Sailor> sailorList = new ArrayList<Sailor>(); 

    //Constructor
	public Crew() {
		super();  
	}
	
	//Methods
	public void addCrewMember(Sailor sailor) {
		sailorList.add(sailor); 
	}
	public String toString() {
		String sailors = "";
		for (int i = 0; i < sailorList.size(); i++) {
			sailors += sailorList.get(i).getName() + " (" + sailorList.get(i).getEmail() + " ) \n";
		}
		return sailors; 
	}
}
