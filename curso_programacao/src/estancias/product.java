package estancias;

public class product {
	public String name;
	public double price;
	public int quantity;
	
	public product(String name2, double price2) {
		// TODO Auto-generated constructor stub
	}

	public product() {
		// TODO Auto-generated constructor stub
	}

	public double totalValueStock(){
		return price * quantity;
	}

	public void addproducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name + " $ " + String.format("%.2f", price) + "," + quantity + " units, Total: $" + String.format("%.2f",totalValueStock());
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}

