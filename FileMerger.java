import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class FileMerger {
	/*
	 * store String objects of the names of the files to be merged
	 */
	private Vector<String> listOfFileNames = new Vector<String>();
	/*
	 * store InputStream objects for each files
	 */
	private Vector<InputStream> fileStreams = new Vector<InputStream>();

	public static void main(String[] args) {
		FileMerger app = new FileMerger();
		app.getFileName();
		if (!app.createFileList()) {
			System.exit(0);
		}
		try {
			app.mergeFiles();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void getFileName() {
		String fileName = "";
		System.out.println("Enter file names (one on a line): ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		while (true) {
			try {
				fileName = reader.readLine();
			} catch (IOException e) {
				System.out.println("Error reading keyboard");
			}
			if ((fileName.equals("over"))) {
				break;
			}
			listOfFileNames.add(fileName);
		}
	}

	private boolean createFileList() {
		Enumeration<String> list = listOfFileNames.elements();
		while (list.hasMoreElements()) {
			// the list is in Object type, typecasting is needed
			String filename = (String) list.nextElement();
			InputStream inputStream = null;
			try {
				inputStream = new FileInputStream(filename);
			} catch (FileNotFoundException fe) {
				System.out.println("File not found: " + filename);
			}
			fileStreams.add(inputStream);
		}
		return true;
	}

	private void mergeFiles() throws FileNotFoundException {
		try (OutputStream outStream = new FileOutputStream(
				"monthlyDataFile.txt");
				SequenceInputStream inputStream = new SequenceInputStream(
						fileStreams.elements());) {
			byte[] buffer = new byte[4096];
			int numberRead = 0;
			while ((numberRead = inputStream.read(buffer)) != -1) {
				outStream.write(buffer, 0, numberRead);
			}
		} catch (IOException e) {
			System.out.println("Error reading/writing file");
		}
		System.out.println("Created monthlyDataFile.csv "
				+ "in your current folder");
	}

}
