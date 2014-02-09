import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineCounter {

	public static void main(String[] args) {
		LineNumberReader reader = null;
		if (args.length < 1) {
			System.out.println("Usage: java LineCounter < filename");
			System.exit(0);
		}
		try {
			// introduce a wrapper on FileReader object
			reader = new LineNumberReader(new FileReader(args[0]));
			while (reader.readLine() != null) {
			}
			System.out.println("Line number of the last line in the file is: "
					+ reader.getLineNumber());
		} catch (FileNotFoundException fe) {
			System.out.println(fe.getMessage());
		} catch (IOException ioe) {
			System.out.println("Error reading file");
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
