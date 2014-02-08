import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// try-with-resources
		// note that we don't close the files anywhere in the program
		// because they are closed automatically at the end of main method
		// this is because these resources(files) implement the
		// java.lang.AutoCloseable interface(Java SE 7 and above).
		try (InputStream fis = new FileInputStream(new File("ssrc.txt"));
				OutputStream fos = new FileOutputStream(new File("dest.txt"))) {
			byte[] buf = new byte[8192];
			int i;
			while ((i = fis.read(buf)) != -1) {
				fos.write(buf, 0, i);
			}
		} catch (IOException e) {
			System.out.println("File is not found in the current directory");
	}
	}
}
