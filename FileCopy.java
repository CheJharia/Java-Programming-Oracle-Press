import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		int numberRead = 0;
		InputStream readerStream = null;
		OutputStream writerStream = null;

		// buffers are typically allocated in multiples of 512
		byte[] buffer = new byte[512];
		if (args.length < 2) {
			System.out.println("Usage: java FileCopy inputfile outputfile");
			System.exit(0);
		}
		try {
			// open an input stream on the file specified by
			// the first argument of the command line
			readerStream = new FileInputStream(args[0]);
		} catch (FileNotFoundException fe) {
			System.out.println(args[0] + " not found");
			System.exit(0);
		}
		try {
			// open an output stream on the file specified by
			// the second argument of the command line
			writerStream = new FileOutputStream(args[1]);
		} catch (FileNotFoundException e) {
			System.out.println(args[1] + " not found");
		}
		try {
			while ((numberRead = readerStream.read(buffer)) != -1) {
				writerStream.write(buffer, 0, numberRead);
			}
		} catch (IOException ioe) {
			System.out.println("Error reading/writing file");
		} finally {
			try {
				readerStream.close();
				writerStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// // try-with-resources
		// // note that we don't close the files anywhere in the program
		// // because they are closed automatically at the end of main method
		// // this is because these resources(files) implement the
		// // java.lang.AutoCloseable interface(Java SE 7 and above).
		// try (InputStream fis = new FileInputStream(new File("ssrc.txt"));
		// OutputStream fos = new FileOutputStream(new File("dest.txt"))) {
		// byte[] buf = new byte[8192];
		// int i;
		// while ((i = fis.read(buf)) != -1) {
		// fos.write(buf, 0, i);
		// }
		// } catch (IOException e) {
		// System.out.println("File is not found in the current directory");
		// }
		System.out.println("Copied " + args[0] + " to " + args[1]);
	}
}
