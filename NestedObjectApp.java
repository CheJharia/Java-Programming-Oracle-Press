import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NestedObjectApp {

	public static void main(String[] args) {
		Line line = new Line();
		System.out.println("Before saving object:\n" + line);
		try (ObjectOutputStream outstream = new ObjectOutputStream(
				new FileOutputStream("graph.dat"))) {
			outstream.writeObject(line);
		} catch (IOException ie) {
			System.out.println("Error writing object");
		}
		try (ObjectInputStream instream = new ObjectInputStream(
				new FileInputStream("graph.dat"))) {
			line = (Line) instream.readObject();
		} catch (IOException e) {
			System.out.println("Error reading object");
		} catch (ClassNotFoundException e) {
			System.out.println("Casting error");
		}
		System.out.println("\nAfter retrieving object:\n" + line);
	}
}
