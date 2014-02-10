import java.io.Serializable;

public class Product implements Serializable {
	private float price;
	private float tax;
	static final long serialVersionUID = 5733961360077184255L;

	public Product(float price) {
		this.price = price;
		tax = (float) (price * 0.20);
	}
	public String toString() {
		return "Price: " + price + " Tax:" + tax;
	}
}
