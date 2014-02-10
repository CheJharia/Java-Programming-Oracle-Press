import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableTestApp {

	public static void main(String[] args) {
		try {
			Customer customer = new Customer(1, "1234-5678-9876");
			System.out.println("Before saving object: ");
			System.out.println("ID: " + customer.getId() + " CC:"
					+ customer.getCreditCard());
			ObjectOutputStream outstream = new ObjectOutputStream(
					new FileOutputStream("customer.dat"));
			outstream.writeObject(customer);
			outstream.close();
			ObjectInputStream inputStream = new ObjectInputStream(
					new FileInputStream("customer.dat"));
			customer = (Customer) inputStream.readObject();
			System.out.println("After retrieving object: ");
			System.out.println("ID: " + customer.getId() + " CC:"
					+ customer.getCreditCard());
			inputStream.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
