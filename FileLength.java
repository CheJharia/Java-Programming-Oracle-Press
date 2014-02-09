import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileLength {

	public static void main(String[] args) {
		// byte by byte counter
		int count = 0;

		InputStream streamReader = null;
		if (args.length < 1) {
			System.out.println("Usage: java FileLength <filename>");
			// the parameter 0 is interpreted as an indication to the
			// JVM that the program has terminated with success
			System.exit(0);
		}
		try {
			streamReader = new FileInputStream(args[0]);
			while (streamReader.read() != -1) {
				count++;
			}
			System.out.println(args[0] + " length = " + count);
			streamReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File " + args[0] + " was not found");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("Error reading file");
		} finally {
			try {
				streamReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
