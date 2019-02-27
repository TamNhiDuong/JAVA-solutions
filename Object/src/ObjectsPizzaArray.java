import java.text.DecimalFormat;

public class ObjectsPizzaArray {

	public static void main(String[] args) {
		 DecimalFormat df = new DecimalFormat("#.00");
		
		Pizza[] pizzaArray = new Pizza[3];
		
		pizzaArray[0] = new Pizza("Diavolo", 8.75);
		pizzaArray[1] = new Pizza("Frutti al Mare", 9.00);
		pizzaArray[2] = new Pizza ("Alla Pollo", 7.50); 
		
       for (int i = 0; i < pizzaArray.length; i++) {
    	   System.out.println(pizzaArray[i].getName() + " (" + df.format(pizzaArray[i].getPrice()).replace('.', ',') + " euros)");
    	   
       }
	}

}
