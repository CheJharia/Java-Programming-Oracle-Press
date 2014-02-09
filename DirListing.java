import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirListing {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: DirListing DirectoryName");
			System.exit(0);
		}
		Path dirPath = Paths.get(args[0]);
		DirectoryStream<Path> directory = null;
		try {
			directory = Files.newDirectoryStream(dirPath);

			for (Path p : directory) {
				System.out.println(p.getFileName());
			}
		} catch (Exception ie) {
			System.out.println("Invalid path specified:" + args[0]);
		} finally {
			try {
				if (directory != null) {
					directory.close();
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

}
