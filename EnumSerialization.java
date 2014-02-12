import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumSerialization {
	public static void main(String[] args) {
		ColorPalette drawingColor = ColorPalette.GREEN;

		System.out.println("Saving color setting");
		try {
			ObjectOutputStream os = new ObjectOutputStream(
					new FileOutputStream("color.dat"));
			os.writeObject(drawingColor);
			os.close();
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					"color.dat"));
			System.out.println("Retrived object: "
					+ (ColorPalette) is.readObject());
			is.close();
		} catch (IOException e) {
			System.out.println("Error in reading/writing the object");
		} catch (ClassNotFoundException e) {
			System.out.println("Class casting error.");
		}

	}
}
