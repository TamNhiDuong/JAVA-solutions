import java.util.ArrayList;
import java.text.DecimalFormat;;

public class ShoppingCart {
    //fields
	ArrayList<Item> itemList = new ArrayList<Item>();
	
    //constructors
	public ShoppingCart() {
		this.itemList = new ArrayList<Item>();
	}
	
    //methods
	public void add(Product product, int quantity) {
		itemList.add(new Item(product, quantity));
	}

	public void remove(Product product) {
		for (int i = 0; i < itemList.size(); i++) {
			if(product.equals(itemList.get(i).getProduct())) {
				itemList.remove(i--); 
			}
		}
	}

	public double getTotalPrice() {
		double totalPrice = 0;
		for (int i = 0; i < itemList.size(); i++) {
			totalPrice += itemList.get(i).getSubtotal();
		}
		return totalPrice;
	}

	public String toString() {
		DecimalFormat decimal = new DecimalFormat("0.00");
		String output = "";
		double total = 0;

		if (itemList.size() == 0) {
			System.out.print("There are no items in the shopping cart." + "\n");
		}

		else {
			output = "=== Shopping cart === \n";
			for (int i = 0; i < itemList.size(); i++) {
				output += itemList.get(i).getProduct().getCode() + ": " + itemList.get(i).getProduct().getName()
						+ ", quantity: " + itemList.get(i).getQuantity() + ", unit price: "
						+ decimal.format(itemList.get(i).getProduct().getPrice()) + ", subtotal: "
						+ decimal.format(itemList.get(i).getSubtotal()) + "\n";
				total += itemList.get(i).getSubtotal();

			}
			output += "TOTAL PRICE: " + decimal.format(total) + " euros \n";

		}
		return output;
	}
}
