import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProductReader {

	public static void main(String[] args) {
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(
				"product.dat"))) {
			Product p1;
			p1 = (Product) is.readObject();
			System.out.println(p1.toString());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
