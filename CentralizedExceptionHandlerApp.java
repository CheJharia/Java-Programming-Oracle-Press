import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CentralizedExceptionHandlerApp {
	private static BufferedReader reader = null;

	public static void main(String[] args) {
		String urlStr = null;
		try {
			CentralizedExceptionHandlerApp app = new CentralizedExceptionHandlerApp();
			app.openDataFile("src.txt");
			app.readData();
			reader.close();
		} catch (IOException e) {
			System.out.println("Error closing file");
		} catch (Exception e) {
			System.out.println("Unknown error :" + e.getMessage());
		}
	}

	void openDataFile(String fileName) {
		try {
			reader = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Specified file not found");
		}
	}

	void readData() {
		String str;
		try {
			while ((str = reader.readLine()) != null) {
				int n = Integer.parseInt(str);
				System.out.println(n);
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
