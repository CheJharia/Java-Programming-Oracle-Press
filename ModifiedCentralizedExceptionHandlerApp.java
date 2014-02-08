import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ModifiedCentralizedExceptionHandlerApp {
	private static BufferedReader reader = null;

	public static void main(String[] args) {
		String urlStr = null;
		try {
			ModifiedCentralizedExceptionHandlerApp app = new ModifiedCentralizedExceptionHandlerApp();
			app.openDataFile("src.txt");
			app.readData();
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Specified file not found");
		} catch (IOException e) {
			System.out.println("Error closing file");
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format, skipping rest");
		} catch (Exception e) {
			System.out.println("Unknown error :" + e.getMessage());
		}
	}

	// throw FileNotFoundException to main method
	void openDataFile(String fileName) throws FileNotFoundException {
		reader = new BufferedReader(new FileReader(fileName));
	}

	// throw NumberFormatException to main method
	void readData() throws IOException, NumberFormatException {
		String str;
		while ((str = reader.readLine()) != null) {
			int n = Integer.parseInt(str);
			System.out.println(n);
		}

	}

}
