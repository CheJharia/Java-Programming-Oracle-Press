import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProductWriter {

	public static void main(String[] args) {
		Product p1 = new Product(100);
		try {
			ObjectOutputStream os = new ObjectOutputStream(
					new FileOutputStream("product.dat"));
			os.writeObject(p1);
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
