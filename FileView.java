import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileView {

	public static void main(String[] args) {
		int numberRead = 0;
		FileReader reader = null;
		PrintWriter writer = null;
		char[] buffer = new char[512];
		if (args.length < 1) {
			System.out.println("Usage: java FileView filename");
			System.exit(0);
		}
		try {
			// open an input stream on the file args[0]
			reader = new FileReader(args[0]);
			// open an output stream on the console
			writer = new PrintWriter(System.out);
			while ((numberRead = reader.read(buffer)) != -1) {
				writer.write(buffer, 0, numberRead);
			}
		} catch (FileNotFoundException fe) {
			System.out.println(fe.getMessage());
			System.exit(0);
		} catch (IOException e) {
			System.out.println("Error reading/writing file");
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
